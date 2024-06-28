package com.example.zasechkaServer.server;

import com.example.zasechkaServer.dto.CompetitionsDTO;
import com.example.zasechkaServer.entity.Competitions;
import com.example.zasechkaServer.enums.Reg;
import com.example.zasechkaServer.repository.CompetitionsRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

/*public class CompetitionsServerTest {


    @InjectMocks
    private CompetitionsServer competitionsServer;

    @Mock
    private CompetitionsRepository competitionsRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllCompetitionsToDatabase() {
        Competitions competition1 = new Competitions();
        competition1.setId_competitions(1);
        competition1.setDate(LocalDate.now());
        competition1.setLocation_event("Location 1");

        Competitions competition2 = new Competitions();
        competition2.setId_competitions(2);
        competition2.setDate(LocalDate.now());
        competition2.setLocation_event("Location 2");

        List<Competitions> competitionsList = Arrays.asList(competition1, competition2);

        when(competitionsRepository.findAll()).thenReturn(competitionsList);

        List<Competitions> result = competitionsServer.GetAllCompetitionsToDatabase();

        assertEquals(2, result.size());
        assertEquals("Location 1", result.get(0).getLocation_event());
        assertEquals("Location 2", result.get(1).getLocation_event());
    }

    @Test
    public void testAddCompetitionToDatabase_Success() {
        CompetitionsDTO competitionDTO = new CompetitionsDTO();
        competitionDTO.setDate(LocalDate.now());
        competitionDTO.setLocation_event("New Location");

        Competitions competition = new Competitions();
        competition.setDate(competitionDTO.getDate());
        competition.setLocation_event(competitionDTO.getLocation_event());
        competition.setRegistration(Reg.Open);

        ResponseEntity<String> responseEntity = competitionsServer.AddCompetitionToDatabase(competitionDTO);

        verify(competitionsRepository).save(competition);
        assertEquals("Соревнования успешно добавлены в базу данных", responseEntity.getBody());
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }

    @Test
    public void testAddCompetitionToDatabase_Error() {
        CompetitionsDTO competitionDTO = new CompetitionsDTO();
        competitionDTO.setDate(LocalDate.now());
        competitionDTO.setLocation_event("New Location");

        when(competitionsRepository.save(new Competitions())).thenThrow(new RuntimeException("Database Error"));

        ResponseEntity<String> responseEntity = competitionsServer.AddCompetitionToDatabase(competitionDTO);

        assertEquals("Произошла ошибка при добавлении Соревнований: Database Error", responseEntity.getBody());
        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, responseEntity.getStatusCode());
    }
}
*/