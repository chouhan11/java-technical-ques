package practiceQuestions;

import java.util.function.Predicate;

public class CustomPredicate implements Predicate<Employee> {
	String gender;

	public CustomPredicate(String filterGender) {
		this.gender = filterGender;
	}

	@Override
	public boolean test(Employee e) {
		return e.getGender().equalsIgnoreCase(gender);
	}

}
