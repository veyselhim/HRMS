package com.example.hrmsdemo.business.abstracts;

import com.example.hrmsdemo.entities.concretes.JobTitle;

import java.util.List;

public interface JobTitleService {

    List<JobTitle> getAll();
}
