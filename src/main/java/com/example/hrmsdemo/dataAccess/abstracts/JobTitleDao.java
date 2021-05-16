package com.example.hrmsdemo.dataAccess.abstracts;

import com.example.hrmsdemo.entities.concretes.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer> {
}
