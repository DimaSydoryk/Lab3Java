package ua.lviv.iot.LabBuilder.models;

import ua.lviv.iot.LabBuilder.manager.Worker;

public class Plasterer extends Worker{
   private int TypeOfWork;
	public Plasterer() {
		super();
		// TODO Auto-generated constructor stub
		 String origin;

	}
	
	public Plasterer(String name, String education, String typeOfWork) {
		super(name, education, typeOfWork);
		// TODO Auto-generated constructor stub
	}

	public void plaster() {
		System.out.println("I am  plasting...");
	}

	@Override
	public String toString() {
		 	return "Name: " + getName() + ", Education: " + getEducation() + ", TypeOfWork: "
				+ getTypeOfWork();
	}


	
	
	
	

}
