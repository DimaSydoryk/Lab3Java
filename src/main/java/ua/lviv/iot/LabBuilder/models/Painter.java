package ua.lviv.iot.LabBuilder.models;


import ua.lviv.iot.LabBuilder.manager.Worker;

public class Painter extends Worker{

	public Painter() {
		super();
	}

	public Painter(String name, String education, String typeOfWork) {
		super(name, education, typeOfWork);
	}

	public Worker draw() {
		System.out.println("I am  painting...");
		return null;
	}

	@Override
	public String toString() {
		return "Name: " + getName() + ", Education: " + getEducation() + ", TypeOfWork: "
				+ getTypeOfWork();
	}

}
