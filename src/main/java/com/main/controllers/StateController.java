package com.main.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.main.models.State;
import com.main.services.StateService;

@Controller
public class StateController {
	@Autowired
	private StateService stateService;
	
	@GetMapping("/states")
	public String getStates(Model model) {
		List<State> stateList = new ArrayList<State>();
		return "State";
	}
}
