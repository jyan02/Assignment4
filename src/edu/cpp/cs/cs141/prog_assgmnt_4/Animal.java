package edu.cpp.cs.cs141.prog_assgmnt_4;

public abstract class Animal {

	private String name;
	private String medicalHistory;
	private String vaccinations;
	private int age;
	private int appointment;
	
	public String getAnimalName(){
		return name;
	}
	
	public int getAnimalAge(){
		return age;
	}
	
	public String getMedicalHistory(){
		return medicalHistory;
	}
	
	private String getVaccinations(){
		return vaccinations;
	}
	
	private int currentAppointment(){
		return appointment;
	}
	
}
