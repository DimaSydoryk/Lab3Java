package ua.lviv.iot.LabBuilder.manager;

public class Worker {
	private String name;
	private String education;
	private String typeOfWork;
	
	public Worker() {
		
	}


	public Worker(String name, String education, String typeOfWork) {
		super();
		this.name = name;
		this.education = education;
		this.typeOfWork = typeOfWork;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEducation() {
		return education;
	}


	public void setEducation(String education) {
		this.education = education;
	}


	public String getTypeOfWork() {
		return typeOfWork;
	}


	public void setTypeOfWork(String typeOfWork) {
		this.typeOfWork = typeOfWork;
	}


	@Override
	public String toString() {
		return "Worker [name=" + name + ", education=" + education + ", typeOfWork=" + typeOfWork + "]";
	}
	
	

	
	
	
	
}
