package com.example.zasechkaServer.controller;

import com.example.zasechkaServer.entity.Competitions;
import com.example.zasechkaServer.entity.Members;
import com.example.zasechkaServer.server.MembersServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MembersController {

    private static final Logger logger = LoggerFactory.getLogger(CompetitionsController.class);

    @Autowired
    private MembersServer membersServer;

    @GetMapping("/all")
    public List<Members> allMemmbers(){
        logger.debug("Получение всех участников");
        List<Members> mem = membersServer.GetAllMembersToDatabase();
        logger.debug("Количество участников: {}", mem.size());
        for(Members member : mem){
            logger.debug("Получение всех участников", mem);
        }
        return mem;
    }
}
