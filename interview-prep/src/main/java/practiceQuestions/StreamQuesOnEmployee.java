package practiceQuestions;

import java.util.*;
import java.util.stream.*;

public class StreamQuesOnEmployee {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		// getCountOfMaleFemale(employeeList);
		// getDepartmentName(employeeList);
		getAvgAgeOfMaleFemale(employeeList);
	}

	private static void getAvgAgeOfMaleFemale(List<Employee> employeeList) {
	//	Map<String, Double> emp = employeeList.stream()
	//			.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
	//	System.out.println(emp);
		
		//Get the Names of employees who joined after 2015.
	//	employeeList.stream().filter(e-> e.getYearOfJoining()> 2015).map(e->e.getName()).forEach(System.out::println);
		
		//Count the number of employees in each department.
	//	employeeList.stream().collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.counting())).forEach((k,v)-> System.out.println(k +" = "+v));
		
		// Find out the average salary of each department.
	//	employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary))).forEach((k,v)-> System.out.println(k + " = "+v));
		
		// Find out the oldest employee, his/her age and department?
		
		Employee  oldest= employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).findFirst().get();
		System.out.println(oldest);
		
		//Find out the average and total salary of the organization.
		DoubleSummaryStatistics ss = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println(ss);
		System.out.println(ss.getSum() +" "+ ss.getAverage());
		
		// List down the employees of each department.
		Map<String, List<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		collect.forEach((k,v)-> System.out.println(k +" = "+ v.toString()));
	}

	private static void getDepartmentName(List<Employee> employeeList) {
		employeeList.stream().map(e -> e.getDepartment()).distinct().forEach(e -> System.out.print(e));

	}

	private static void getCountOfMaleFemale(List<Employee> list) {
		Map<String, Long> emp = list.stream().collect(Collectors.groupingBy(e -> e.getGender(), Collectors.counting()));
		System.out.println(emp);
		emp.forEach((K, V) -> System.out.println(K + " " + V));
	}

}
