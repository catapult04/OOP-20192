package bt_trenlop.tuan10;

public class Employee extends Person{
	private double salary;
	
	public Employee(String name, int age, double salary) {
		super(name, age);;
		this.salary = salary;
	}
	public void setSalary(double s) {
		this.salary = s;
	}
	public double getSalary() {
		return this.salary;
	}
	
	//other methods
	@Override
	public void getDetail() {
		
	}
}
