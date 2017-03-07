package edu.cpp.cs.cs141.prog_assgmnt_4;
import java.util.Scanner;

public class UI {
	
	private static Scanner keyboard;
	
	private int answer;
	
	Scanner sc = new Scanner(System.in);
	
	
	public UI(){
		keyboard = new Scanner(System.in);
	}
	
	public void promptUser(){
		System.out.println("Hello, Welcome to the Veterinary Office!\nPlease choose which animal you have: ");
		System.out.println("1. Dog ");
		System.out.println("2. Bird ");
		System.out.println("3. Fish ");
		
		answer = keyboard.nextInt();
		
			if (answer == 1 )
				answer = 1;
			else if (answer == 2)
				answer = 2;
			else if (answer == 3)
				answer = 3;
	}
	
	public int getType(){
		return answer;
	}
	
	public String getDogOwner(){
		System.out.println("What is the name of the owner?: ");
		String dOwner = sc.nextLine();
		return dOwner;
	}
	
	public String getDogName(){
		System.out.println("What is the name of the dog?: ");
		String dogN = sc.nextLine();
		return dogN;
	}
	
	
	
	public String getBirdOwner(){
		System.out.println("What is the name of the owner?: ");
		String bOwner = sc.nextLine();
		return bOwner;
	}
	
	public String getBirdName(){
		System.out.println("What is the name of the bird?: ");
		String birdN = sc.nextLine();
		return birdN;
	}
	
	public String getFishOwner(){
		System.out.println("What is the name of the owner?: ");
		String fOwner = sc.nextLine();
		return fOwner;
	}
	
	public String getFishName(){
		System.out.println("What is the name of the fish?: ");
		String fishN = sc.nextLine();
		return fishN;
	}
}
