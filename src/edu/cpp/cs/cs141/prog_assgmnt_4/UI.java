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
	
	public String getOwnerName(){
		System.out.println("What is your name?: ");
		String ownerName = sc.nextLine();
		return ownerName;
	}
	
	public String getOwnerBirthday(){
		System.out.println("What is your date of birth?: (mm/dd/yyyy) ");
		String getOwnerBirthday = sc.nextLine();
		return getOwnerBirthday;
	}
	
	public float getOwnerPhoneNum(){
		System.out.println("What is your phone number?: ");
		float ownerPhoneNumber = sc.nextFloat();
		return ownerPhoneNumber;
	}
	
	public String getOwnerAddress(){
		System.out.println("What is your home address?: ");
		String ownerAddress = keyboard.nextLine();
		return ownerAddress;
	}
	
	public String getAnimalName(){
		System.out.println("What is the name of your animal?: ");
		String animalName = keyboard.nextLine();
		return animalName;
		
	}
	
	public int getAnimalAge(){
		System.out.println("What is the age of your animal?: ");
		int animalAge = keyboard.nextInt();
		return animalAge;
	}
	
	public void checkAppointment(){
		System.out.println("Do you have an appointment?: "
				+ "\n1.Yes" +"\n2.No ");
		
		int checkAppt = sc.nextInt();
		
		if (checkAppt == 1){
			System.out.println("swag");
		}
		else{
			System.out.println("Would you like to make an appointment?: "
					+ "\n1.Yes" + "\n2.No" );
			int makeAppointment = sc.nextInt();
				if(makeAppointment == 1){
					
				}
				else if(makeAppointment == 2){
					System.out.println("Come back next time!");
				}
				else
					System.out.println("Please enter a valid choice. ");
		}
			
			
	}	
	
	public void DogC(){
		
		Dog dog = new Dog(getAnimalName(), getAnimalAge(), getOwnerName(), getOwnerAddress());
		
	}
} 
