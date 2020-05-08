package bt_trenlop.tuan10;

public class Manager<T> extends Employee{
	Employee assistant;
	
	public Manager(String name, int age, double salary, Employee e) {
		super(name, age, salary);
		this.assistant = e;
	}
	
	@Override
	public void getDetail() {
	}
	
	public boolean equa(T obj) {
		if(obj instanceof Manager)
			obj.getDetail();
		return true;
	}
}
