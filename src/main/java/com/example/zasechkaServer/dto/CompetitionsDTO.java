package com.example.zasechkaServer.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CompetitionsDTO {

    private LocalDate date;

    private String location_event;
}
