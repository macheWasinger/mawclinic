# MawClinic – Sistema de Turnos Médicos 🏥
Gestión médica simple y eficiente

---

Este proyecto simula un sistema de turnos médicos, desarrollado en Java como ejercicio de práctica con Programación Orientada a Objetos, persistencia con JPA (EclipseLink), base de datos MySQL e interfaz gráfica usando Swing.

Permite registrar médicos, pacientes y gestionar turnos entre ellos mediante una interfaz amigable.

---

## 🚀 Cómo ejecutar el proyecto

1. Tener instalado Java (JDK 17 o superior)

2. Tener MySQL corriendo y crear una base de datos para el proyecto  
   👉 Podés importar el archivo SQL incluido en `/docs/mawclinic-estructura.sql` desde phpMyAdmin para generar automáticamente la estructura de tablas necesaria.

3. Configurar los datos de conexión en el archivo `persistence.xml` según tu entorno local

4. Abrir el proyecto en NetBeans

5. Ejecutarlo desde consola o desde el IDE

---

## ✅ Funcionalidades

### 👨‍⚕️ Médicos
- Cargar, editar y eliminar médicos
- Filtrar médicos por nombre o especialidad

### 🧑‍🤝‍🧑 Pacientes
- Cargar, editar y eliminar pacientes
- Filtrar pacientes por nombre o DNI

### 📅 Turnos
- Asignar turnos a pacientes con un médico, fecha y hora
- Editar y eliminar turnos
- Filtrar turnos por fecha

---

## 🛠 Base de datos

1. Abrir **phpMyAdmin** y crear una base de datos con el nombre que desees (por ejemplo: `mawclinic`)

2. Ir a la pestaña **"Importar"**, seleccionar el archivo `docs/mawclinic-estructura.sql` y hacer clic en **"Continuar"**

3. Verificar que se hayan creado las tablas correctamente

4. Configurar el archivo `persistence.xml` con los siguientes datos ajustados a tu entorno local:

   ```xml
   <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/mawclinic"/>
   <property name="javax.persistence.jdbc.user" value="TU_USUARIO"/>
   <property name="javax.persistence.jdbc.password" value="TU_CONTRASEÑA"/>

---

## 💻 Tecnologías utilizadas
- Java (JDK 17)
- Swing (Interfaz gráfica)
- JPA 2.1 con EclipseLink
- MySQL
- Maven
- NetBeans

---

## 👤 Autor

**Marcelo Wasinger**

---

Gracias por visitar este repositorio.  
¡Cualquier sugerencia o feedback es más que bienvenido!
