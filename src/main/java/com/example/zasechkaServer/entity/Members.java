package com.example.zasechkaServer.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "members")
public class Members {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_user;

    private String name;

    private String surname;

    private String patronymic;

    private Integer number_pas;

    private Integer series_pas;

    private Long insurance_policy;

    private Integer svid_rod;

    private String club;

    private String discharge;

    @Override
    public String toString() {
        return "Members{" +
                "id_user=" + id_user +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", number_pas=" + number_pas +
                ", series_pas=" + series_pas +
                ", insurance_policy=" + insurance_policy +
                ", svid_rod=" + svid_rod +
                ", club='" + club + '\'' +
                ", discharge='" + discharge + '\'' +
                '}';
    }
}
