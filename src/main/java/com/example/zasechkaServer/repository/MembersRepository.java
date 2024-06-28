package com.example.zasechkaServer.repository;

import com.example.zasechkaServer.entity.Members;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MembersRepository extends JpaRepository<Members, Integer> {
}
