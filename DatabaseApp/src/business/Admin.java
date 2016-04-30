package business;

public class Admin extends User {

	private Float salary;

	public Admin(int id, String firstname, String lastname, String phone, String email, Float salary) {
		super(id, firstname, lastname, phone, email);
		setSalary(salary);
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		if (salary > 0) {
			this.salary = salary;
		}
	}
}
