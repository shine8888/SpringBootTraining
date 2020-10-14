package com.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.models.State;
import com.main.repositories.StateRepository;

@Service
public class StateService {
	
	@Autowired
	private StateRepository stateRepository;
	
	public List<State> getAllStates(){
		return stateRepository.findAll();
	}
	
	public void saveState(State state) {
		stateRepository.save(state);
	}
	
	public Optional<State> getStateById(int id) {
		return stateRepository.findById(id);
	}
	
	public void deleteState(int id) {
		stateRepository.deleteById(id);
	}
}
