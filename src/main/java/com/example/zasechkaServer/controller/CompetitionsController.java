package com.example.zasechkaServer.controller;

import com.example.zasechkaServer.dto.CompetitionsDTO;
import com.example.zasechkaServer.entity.Competitions;
import com.example.zasechkaServer.server.CompetitionsServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/competitions")
public class CompetitionsController {

    private static final Logger logger = LoggerFactory.getLogger(CompetitionsController.class);

    @Autowired
    private CompetitionsServer competitionsServer;

    @GetMapping("/all")
    public List<Competitions> AllCompetitions(){
        logger.debug("Получение всех соревнований");
        List<Competitions> competitions =competitionsServer.GetAllCompetitionsToDatabase();
        logger.debug("Количество соревнований: {}", competitions.size());
        return competitions;
        //return competitionsServer.GetAllCompetitionsToDatabase();
    }

    @PostMapping("/add") // добавление студента
    public ResponseEntity<String> addCompetition(@RequestBody CompetitionsDTO competition) {
        logger.debug("Добавление соревнования: {}", competition);
        ResponseEntity<String> responseData = competitionsServer.AddCompetitionToDatabase(competition);
        logger.debug("Ответ от сервера: {}", responseData.getBody());
        return responseData;
    }


}
