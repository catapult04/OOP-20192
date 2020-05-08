package bt_trenlop.tuan10;

public class Manager extends Employee{
	Employee assistant;
	
	public Manager(String name, int age, double salary, Employee e) {
		super(name, age, salary);
		this.assistant = e;
	}
	
	
}
