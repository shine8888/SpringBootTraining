package com.main.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.main.models.Country;
import com.main.models.State;
import com.main.services.StateService;

@Controller
public class StateController {
	@Autowired
	private StateService stateService;

	@GetMapping("/states")
	public String getStates(Model model) {
		List<State> stateList = stateService.getAllStates();
		model.addAttribute("states", stateList);
		return "State";
	}

	@PostMapping("/states/addNew")
	public String addNew(State state) {
		stateService.saveState(state);
		System.out.println(state.getCountryid()+ " "+ state.getName());
		return "redirect:/states";
	}

	@RequestMapping("/states/findById")
	@ResponseBody
	public Optional<State> findStateById(int id) {
		return stateService.getStateById(id);
	}

	@RequestMapping(value = "/states/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(State state) {
		stateService.saveState(state);
		return "redirect:/states";
	}
	
	@RequestMapping("/states/delete")
	public String delete(int id) {
		stateService.deleteState(id);
		return "redirect:/states";
	}
}
