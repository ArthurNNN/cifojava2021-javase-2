package personExample;

import java.util.ArrayList;

public class TestPerson {
	public static void executePerson() {
		createAndTestObjectsPerson();
	}

	public static void createAndTestObjectsPerson() {

		Person sergi = new Person();

		Person isa = new Person("Isabel", 18);

		Person toni = new Person("Antonio", 30, 80, 180, 2000);

//		System.out.println(sergi.toString());
//
//		System.out.println(isa);
//
//		System.out.println(toni);

		sergi.setName("Sergey");
		sergi.setAge(40);

		sergi.setWeigth(85);
		sergi.setHeigth(175);
		sergi.setBasicSalary(2500);

//		System.out.println(sergi);
//
//		System.out.println("Sergi's age: " + sergi.getAge());
//
//		System.out.println("Isa's age: " + isa.getAge());
//
//		System.out.println("Toni's age: " + toni.getAge());

	}

	public static void testMethodsObjectsPerson() {

		Person max = new Person("Max", 30, 75, 170, 2500.0);
		Person lisa = new Person("Lisa", 18, 65, 165, 1200);
		Person jack = new Person("Jackson Pollock", 35, 80, 180, 8000);

		ArrayList<Double> expensesArr1 = new ArrayList<>();
		expensesArr1.add(12.43);
		expensesArr1.add(60.25);
		expensesArr1.add(300.00);

		ArrayList<Double> expensesArr2 = new ArrayList<>();
		expensesArr2.add(5.00);
		expensesArr2.add(62.00);
		expensesArr2.add(200.00);

		ArrayList<Double> expensesArr3 = new ArrayList<>();
		expensesArr3.add(120.00);
		expensesArr3.add(90.25);
		expensesArr3.add(1500.00);

//		Double cashMax = jack.salaryAfterExpenses(expensesArr);

		max.sportOffer(max.salaryAfterExpenses(expensesArr1));

		lisa.sportOffer(lisa.salaryAfterExpenses(expensesArr2));

		jack.sportOffer(jack.salaryAfterExpenses(expensesArr3));

	}

	public static void testListObjectsPerson() {

		ArrayList<Person> people = new ArrayList<>();

		Person alexa = new Person("Alexa", 25, 60, 170);
		Person jack = new Person("Jackson Pollock", 35);
		Person marc = new Person();

		people.add(alexa);
		people.add(marc);
		people.add(jack);

		printPeople(people);
	}

	private static void printPeople(ArrayList<Person> arrayToPrint) {
		System.out.println("People:");
		for (Person personToPrint : arrayToPrint) {
			System.out.println(personToPrint);
		}
		System.out.println("\n");
	}
}