package com.example.zasechkaServer.entity;

import com.example.zasechkaServer.RegConverter;
import com.example.zasechkaServer.enums.Reg;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "competitions")
public class Competitions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_competitions;

    private LocalDate date;

    private String location_event;

    @Convert(converter = RegConverter.class)
    private Reg registration;

    @Override
    public String toString() {
        return "Competitions{" +
                "id_competitions=" + id_competitions +
                ", date=" + date +
                ", location_event='" + location_event + '\'' +
                ", registration='" + registration + '\'' +
                '}';
    }
}
