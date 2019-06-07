package ua.lviv.iot.LabBuilder.models;

import ua.lviv.iot.LabBuilder.manager.Worker;

public class Stonemason extends Worker{

	public Stonemason() {
		super();
	}

	public Stonemason(String name, String education, String typeOfWork) {
		super(name, education, typeOfWork);
	}

	public void stoneProcessing() {
		System.out.println("I am  doing something with stones...");
	}

	@Override
	public String toString() {
		return "Name: " + getName() + ", Education: " + getEducation() + ", TypeOfWork: "
				+ getTypeOfWork();
	}

}
