package edu.cpp.cs.cs141.prog_assgmnt_4;

import java.io.Serializable;

public class Engine implements Serializable {
	
	private static final long serialVersionUID = 9120252166535244660L;
	
	private UI ui;
	
	public Engine(UI ui){
		this.ui = ui;
	}
	
	public void run(){
		ui.promptUser();
		createAnimal(ui.getType());
		
	}
	
	public void createAnimal(int answer){
		if (answer == 1){
			createDog();
		}
				
		else if (answer == 2)
			createBird();
		
		else if (answer == 3)
			createFish();
	}
	
	public void createDog(){
		
		ui.getAnimalAge();
		ui.getAnimalName();
		
	}
	
	public void createBird(){
		
		
	}
	
	public void createFish(){
		
		ui.checkAppointment();
	}
}
