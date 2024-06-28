package com.example.zasechkaServer;
import com.example.zasechkaServer.enums.Reg;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

@Converter(autoApply = true)
public class RegConverter implements AttributeConverter<Reg, String> {

    @Override
    public String convertToDatabaseColumn(Reg reg) {
        if (reg == null) {
            return null;
        }
        return reg.getValue();
    }

    @Override
    public Reg convertToEntityAttribute(String dbData) {
        if (dbData == null) {
            return null;
        }
        switch (dbData) {
            case "Открыта":
                return Reg.Open;
            case "Закрыта":
                return Reg.Close;
            default:
                throw new IllegalArgumentException("Unknown value: " + dbData);
        }
    }
}
