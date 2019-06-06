import java.util.Scanner;

import builders.Painter;
import builders.Plasterer;
import builders.Stonemason;
import people.Worker;

public class Program {
	
public static void main(String args[]) {
  
	
	
    Worker workers[] = new Worker[5];
    workers[0] = new Painter("Ivan", "High", "Outside");
    workers[1] = new Plasterer("Vasya", "High", "Inside");
    workers[2] = new Painter("Inokentiy", "High", "3");
    workers[3] = new Stonemason("Dima", "High", "4");
    workers[4] = new Painter("Sanya", "High", "2");
    
    mainMenu();
    switchForMenu(workers);
	
}

public static void findByTypeOfWork(Worker array[], String typeOfWork ) {
	
	for(int i = 0; i < array.length; i++ ) {
		if(array[i] instanceof Painter ) {
			Painter painter = (Painter) array[i];
			if(painter.getTypeOfWork().equalsIgnoreCase(typeOfWork) ) {
				System.out.println(painter.toString());
			}
		}else if(array[i] instanceof Plasterer) {
			Plasterer plasterer = (Plasterer) array[i];
			if( plasterer.getTypeOfWork().equalsIgnoreCase(typeOfWork)) {
				System.out.println( plasterer.toString());
			}
		}else if(array[i] instanceof Stonemason) {
			Stonemason stonemason = (Stonemason)  array[i];
			if( stonemason.getTypeOfWork().equalsIgnoreCase(typeOfWork)) {
				System.out.println( stonemason.toString());
			}

		}
	}
}
public static void findByEducation(Worker array[], String typeOfEducation) {
	
	for(int i = 0; i < array.length; i++ ) {
		if(array[i] instanceof Painter ) {
			Painter painter = (Painter) array[i];
			if(painter.getEducation().equalsIgnoreCase(typeOfEducation) ) {
				System.out.println(painter.toString());
			}
		}else if(array[i] instanceof Plasterer) {
			Plasterer plasterer = (Plasterer) array[i];
			if( plasterer.getEducation().equalsIgnoreCase(typeOfEducation)) {
				System.out.println( plasterer.toString());
			}
		}else if(array[i] instanceof Stonemason) {
			Stonemason stonemason = (Stonemason)  array[i];
			if( stonemason.getEducation().equalsIgnoreCase(typeOfEducation)) {
				System.out.println( stonemason.toString());
			}

		}
	}
}


public static void mainMenu() {
	System.out.println("Press 1 to find by type of work");
	System.out.println("Press 2 to find by necessary education");
	System.out.println("Press 0 to have fun)))00))");
}
public static void switchForMenu(Worker array[]) {
	Scanner scan = new Scanner(System.in);
	String key = scan.nextLine();
	
	switch(key) {
	case "1":
		System.out.println("Enter the type of work");
		String typeOfWork = scan.nextLine();
		findByTypeOfWork(array,typeOfWork);
		break;
	case "2":
		System.out.println("Enter the type of education");
		String typeOfEducation = scan.nextLine();
		findByEducation(array, typeOfEducation );
		break;
	case "0":
		System.out.println("Дружина програміста: - Дорогий, у нас буде дитина! Програміст: - Ти хочеш сказати, що я некоректно вийшов?" );
		break;
	default:
		break;
	}
	
}


}
