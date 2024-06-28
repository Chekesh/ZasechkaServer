package com.example.zasechkaServer.server;

import com.example.zasechkaServer.entity.Members;
import com.example.zasechkaServer.repository.MembersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembersServer {

    private final MembersRepository repository;

    public MembersServer(MembersRepository repository){
        this.repository = repository;
    }

    public List<Members> GetAllMembersToDatabase(){
        return repository.findAll();
    }

}
