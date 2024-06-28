package com.example.zasechkaServer.server;

import com.example.zasechkaServer.dto.CompetitionsDTO;
import com.example.zasechkaServer.dto.MembersDTO;
import com.example.zasechkaServer.entity.Competitions;
import com.example.zasechkaServer.entity.Members;
import com.example.zasechkaServer.enums.Reg;
import com.example.zasechkaServer.repository.CompetitionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetitionsServer {

    @Autowired
    private CompetitionsRepository competitionsRepository;

    public List<Competitions> GetAllCompetitionsToDatabase(){
        return competitionsRepository.findAll();
    }

    public ResponseEntity<String> AddCompetitionToDatabase(CompetitionsDTO competitionsDTO){
        try {
            Competitions competitions = new Competitions();
            competitions.setDate(competitionsDTO.getDate());
            competitions.setLocation_event(competitionsDTO.getLocation_event());
            competitions.setRegistration(Reg.Open);

            System.out.println(competitions.getRegistration());

            competitionsRepository.save(competitions);
            return new ResponseEntity<>("Соревнования успешно добавлены в базу данных", HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>("Произошла ошибка при добавлении Соревнований: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
