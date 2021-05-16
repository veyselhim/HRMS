package com.example.hrmsdemo.business.concretes;

import com.example.hrmsdemo.business.abstracts.JobTitleService;
import com.example.hrmsdemo.dataAccess.abstracts.JobTitleDao;
import com.example.hrmsdemo.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTitleManager implements JobTitleService {

    JobTitleDao jobTitleDao;

    @Autowired
    public JobTitleManager(JobTitleDao jobTitleDao){
        super();
        this.jobTitleDao =jobTitleDao;
    }


    @Override
    public List<JobTitle> getAll() {
        return this.jobTitleDao.findAll();
    }
}
