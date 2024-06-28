package com.example.zasechkaServer.controller;

import com.example.zasechkaServer.dto.CompetitionsDTO;
import com.example.zasechkaServer.entity.Competitions;
import com.example.zasechkaServer.server.CompetitionsServer;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

/*public class CompetitionsControllerTest {

    @InjectMocks
    private CompetitionsController competitionsController;

    @Mock
    private CompetitionsServer competitionsServer;

    public CompetitionsControllerTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAllCompetitions() {
        Competitions competition1 = new Competitions();
        competition1.setId_competitions(1);
        competition1.setDate(LocalDate.now());
        competition1.setLocation_event("Location 1");

        Competitions competition2 = new Competitions();
        competition2.setId_competitions(2);
        competition2.setDate(LocalDate.now());
        competition2.setLocation_event("Location 2");

        List<Competitions> competitionsList = Arrays.asList(competition1, competition2);

        when(competitionsServer.GetAllCompetitionsToDatabase()).thenReturn(competitionsList);

        List<Competitions> result = competitionsController.AllCompetitions();

        assertEquals(2, result.size());
        assertEquals("Location 1", result.get(0).getLocation_event());
        assertEquals("Location 2", result.get(1).getLocation_event());
    }

    @Test
    public void testAddCompetition() {
        CompetitionsDTO competitionDTO = new CompetitionsDTO();
        competitionDTO.setDate(LocalDate.now());
        competitionDTO.setLocation_event("New Location");

        ResponseEntity<String> responseEntity = ResponseEntity.ok("Соревнование добавлено успешно");

        when(competitionsServer.AddCompetitionToDatabase(competitionDTO)).thenReturn(responseEntity);

        ResponseEntity<String> result = competitionsController.addCompetition(competitionDTO);

        assertEquals("Соревнование добавлено успешно", result.getBody());
    }
}*/
