package com.mycompany.sistematurnos.converters;

import java.sql.Time;
import java.time.LocalTime;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class LocalTimeConverter implements AttributeConverter<LocalTime, Time> {

    @Override
    public Time convertToDatabaseColumn(LocalTime attribute) {
        return (attribute != null ? Time.valueOf(attribute) : null);
    }

    @Override
    public LocalTime convertToEntityAttribute(Time dbData) {
        return (dbData != null ? dbData.toLocalTime() : null);
    }
}
