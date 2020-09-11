package com.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
