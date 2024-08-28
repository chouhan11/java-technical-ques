package practiceQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class VizoltAndAspiresys {

	public static void main(String ...args) {
		//find duplicate charaters 
		String str="madhur@123md";
		int i=07;
		System.out.println(i);
		//Arrays.stream(str.split("")).collect(Collectors.groupingBy(e->e,Collectors.counting())).forEach((k,v)-> System.out.println(k +" "+v));
		
		//emp sort by salary asc
		List<Employee> empList=new ArrayList<>();
		Employee emp1=new Employee(100, "mady", 10, "male", "HR", 2010, 1200.00);
		Employee emp2=new Employee(200, "sandy", 22, "female", "finance", 2022, 1500.00);
		Employee emp3=new Employee(300, "mani", 30, "male", "HR", 2050, 1400.00);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
	   empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).forEach(e->System.out.println(e));
	}

}
