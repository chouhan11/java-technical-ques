package practiceQuestions;

import lombok.Data;

@Data
public class Employee {

	    int id;
	    String name;
	    int age;
	    String gender;
	    String department;
	    int yearOfJoining;
	    double salary;

	    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) 
	    {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.gender = gender;
	        this.department = department;
	        this.yearOfJoining = yearOfJoining;
	        this.salary = salary;
	    }
}
