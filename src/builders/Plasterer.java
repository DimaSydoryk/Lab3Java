package builders;

import people.Worker;

public class Plasterer extends Worker{

	public Plasterer() {
		super();
		// TODO Auto-generated constructor stub
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
