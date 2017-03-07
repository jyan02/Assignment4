package edu.cpp.cs.cs141.prog_assgmnt_4;

public class Engine {
	
	private UI ui;
	
	public Engine(UI ui){
		this.ui = ui;
	}
	
	public void run(){
		ui.promptUser();
		createAnimal(ui.getType());
		
	}
	
	public void createAnimal(int answer){
		if (answer == 1)
			createDog();	
		
		else if (answer == 2)
			createBird();
		
		else if (answer == 3)
			createFish();
	}
	
	public void createDog(){
		ui.getDogOwner();
		ui.getDogName();
	}
	
	public void createBird(){
		
	}
	
	public void createFish(){
		
	}
}
