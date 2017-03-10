package edu.cpp.cs.cs141.prog_assgmnt_4;

/**This class is the Main class, which is in charge of the running of the game.
 * @author J
 *
 */
public class Main {
	
	/** This method creates an instance of the User Interface and Engine and passes
	 * the User Interface into the Engine constructor and runs the game. 
	 * @param args
	 */
	public static void main(String[] args){
		UI ui = new UI();
		Engine engine = new Engine(ui);
		engine.run();
		
	}

}
