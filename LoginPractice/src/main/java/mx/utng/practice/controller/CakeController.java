package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.Cake;

import mx.utng.practice.repository.CakeRepository;

@Named
@ViewScoped
public class CakeController {
	@Autowired
	private CakeRepository cakeRository;
	private Cake cake=new Cake();
	private boolean editMode=false;
	private List<Cake> cakes;
	@PostConstruct
	public void init(){
		setCakes(cakeRository.findAll());
	}
	/**
	 * @return the cakes
	 */
	public List<Cake> getCakes() {
		return cakes;
	}
	/**
	 * @param cakes the cakes to set
	 */
	public void setCakes(List<Cake> cakes) {
		this.cakes = cakes;
	}


	public void save(){
		cakeRository.save(cake);
		if(!editMode){
			getCakes().add(cake);
		}
		cake=new Cake();
		setEditMode(false);
	}
	
	public void delete(Cake cake){
		cakeRository.delete(cake);
		cakes.remove(cake);
	}
	
	public void update(Cake cake){
		setCake(cake);
		setEditMode(true);
	}
	public void cancel(){
		cake=new Cake();
		setEditMode(false);
	}
	
	
	
	
	  
	/**
	 * @return the cake
	 */
	public Cake getCake() {
		return cake;
	}
	/**
	 * @param cake the cake to set
	 */
	public void setCake(Cake cake) {
		this.cake = cake;
	}
	/**
	 * @return the editMode
	 */
	public boolean isEditMode() {
		return editMode;
	}
	/**
	 * @param editMode the editMode to set
	 */
	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
	
	
	
	 
}
