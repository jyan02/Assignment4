package edu.cpp.cs.cs141.prog_assgmnt_4;
import java.util.Scanner;

public class UI {
	
	
	private static Scanner keyboard;
	Scanner sc = new Scanner(System.in);
	private int answer;
	
	public UI(){
		keyboard = new Scanner(System.in);
	}
	
	public void promptUser(){
		System.out.println("Hello, please choose which animal you have: ");
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
		String owner = sc.nextLine();
		return owner;
	}
	
	public String getDogName(){
		System.out.println("What is the name of the dog?: ");
		String dog = sc.nextLine();
		return dog;
		
	}
}
