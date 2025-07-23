package com.mycompany.sistematurnos.persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.sistematurnos.logica.Medico;
import com.mycompany.sistematurnos.logica.Paciente;
import com.mycompany.sistematurnos.logica.Turno;
import com.mycompany.sistematurnos.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TurnoJpaController implements Serializable {

    public TurnoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public TurnoJpaController() {
        emf = Persistence.createEntityManagerFactory("sistematurnosJPAPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Turno turno) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Medico medicoAsociado = turno.getMedicoAsociado();
            if (medicoAsociado != null) {
                medicoAsociado = em.getReference(medicoAsociado.getClass(), medicoAsociado.getId());
                turno.setMedicoAsociado(medicoAsociado);
            }
            Paciente pacienteAsociado = turno.getPacienteAsociado();
            if (pacienteAsociado != null) {
                pacienteAsociado = em.getReference(pacienteAsociado.getClass(), pacienteAsociado.getId());
                turno.setPacienteAsociado(pacienteAsociado);
            }
            em.persist(turno);
            if (medicoAsociado != null) {
                medicoAsociado.getTurnos().add(turno);
                medicoAsociado = em.merge(medicoAsociado);
            }
            if (pacienteAsociado != null) {
                pacienteAsociado.getTurnos().add(turno);
                pacienteAsociado = em.merge(pacienteAsociado);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Turno turno) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Turno persistentTurno = em.find(Turno.class, turno.getId());
            Medico medicoAsociadoOld = persistentTurno.getMedicoAsociado();
            Medico medicoAsociadoNew = turno.getMedicoAsociado();
            Paciente pacienteAsociadoOld = persistentTurno.getPacienteAsociado();
            Paciente pacienteAsociadoNew = turno.getPacienteAsociado();
            if (medicoAsociadoNew != null) {
                medicoAsociadoNew = em.getReference(medicoAsociadoNew.getClass(), medicoAsociadoNew.getId());
                turno.setMedicoAsociado(medicoAsociadoNew);
            }
            if (pacienteAsociadoNew != null) {
                pacienteAsociadoNew = em.getReference(pacienteAsociadoNew.getClass(), pacienteAsociadoNew.getId());
                turno.setPacienteAsociado(pacienteAsociadoNew);
            }
            turno = em.merge(turno);
            if (medicoAsociadoOld != null && !medicoAsociadoOld.equals(medicoAsociadoNew)) {
                medicoAsociadoOld.getTurnos().remove(turno);
                medicoAsociadoOld = em.merge(medicoAsociadoOld);
            }
            if (medicoAsociadoNew != null && !medicoAsociadoNew.equals(medicoAsociadoOld)) {
                medicoAsociadoNew.getTurnos().add(turno);
                medicoAsociadoNew = em.merge(medicoAsociadoNew);
            }
            if (pacienteAsociadoOld != null && !pacienteAsociadoOld.equals(pacienteAsociadoNew)) {
                pacienteAsociadoOld.getTurnos().remove(turno);
                pacienteAsociadoOld = em.merge(pacienteAsociadoOld);
            }
            if (pacienteAsociadoNew != null && !pacienteAsociadoNew.equals(pacienteAsociadoOld)) {
                pacienteAsociadoNew.getTurnos().add(turno);
                pacienteAsociadoNew = em.merge(pacienteAsociadoNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = turno.getId();
                if (findTurno(id) == null) {
                    throw new NonexistentEntityException("The turno with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Turno turno;
            try {
                turno = em.getReference(Turno.class, id);
                turno.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The turno with id " + id + " no longer exists.", enfe);
            }
            Medico medicoAsociado = turno.getMedicoAsociado();
            if (medicoAsociado != null) {
                medicoAsociado.getTurnos().remove(turno);
                medicoAsociado = em.merge(medicoAsociado);
            }
            Paciente pacienteAsociado = turno.getPacienteAsociado();
            if (pacienteAsociado != null) {
                pacienteAsociado.getTurnos().remove(turno);
                pacienteAsociado = em.merge(pacienteAsociado);
            }
            em.remove(turno);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Turno> findTurnoEntities() {
        return findTurnoEntities(true, -1, -1);
    }

    public List<Turno> findTurnoEntities(int maxResults, int firstResult) {
        return findTurnoEntities(false, maxResults, firstResult);
    }

    private List<Turno> findTurnoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Turno.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Turno findTurno(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Turno.class, id);
        } finally {
            em.close();
        }
    }

    public int getTurnoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Turno> rt = cq.from(Turno.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }  
}
