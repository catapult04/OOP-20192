package bt_trenlop.tuan10;

public class Main {
	public static void main(String [] args) {
		Person p = new Person("Pe", 20);
		Employee e = new Employee("Em", 21, 21);
		Manager m = new Manager("Ma", 22, 22, e);
		Person arr[] = {p, e, m};
		
		m.equals(m);
		
		System.out.println("Bye!");
	}
	
}
