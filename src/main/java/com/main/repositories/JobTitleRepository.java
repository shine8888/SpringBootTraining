package com.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.models.JobTitle;

@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {

}
