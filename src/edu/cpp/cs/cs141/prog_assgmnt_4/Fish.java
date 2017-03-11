package edu.cpp.cs.cs141.prog_assgmnt_4;

public class Fish extends Animal {
	
	 private String fishName;
	 private String fishMedicalHistory;
	 private String fishVaccinations;
	 private int fishAge;
	 
	
	public Fish(String name, int age, String medicalHistory, String vaccinations){
		
		this.fishName = name;
		this.fishAge = age;
		this.fishMedicalHistory = medicalHistory;
		this.fishVaccinations = vaccinations;
		
		
	}

}
