package practiceQuestions;

import java.util.ArrayList;
import java.util.List;

public class  CustomPredicateTest{

	public static void main(String[] args) {
	
		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
	
		
		List<Employee> list = employeeList.stream().filter(new CustomPredicate("feMale")).toList();
		list.forEach(e->System.out.println(e));
	}

}
