package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.State;
import mx.utng.practice.repository.StateRepository;

@Named
@ViewScoped
public class StateController {
@Autowired
private StateRepository stateRepository;
private List<State> states;

@PostConstruct
public void init(){
setStates(stateRepository.findAll());
}

/**
 * @return the states
 */
public List<State> getStates() {
	return states;
}

/**
 * @param states the states to set
 */
public void setStates(List<State> states) {
	this.states = states;
}


}
