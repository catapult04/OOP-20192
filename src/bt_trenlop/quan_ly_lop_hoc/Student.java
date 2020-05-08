package quan_ly_lop_hoc;

class Student extends Person{
	public String name;
	private int age;
	
	//setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Constructor
	public Student(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}
	
	//Other methods
	public static int add(int...a) {
		int result = 0;
		for(int i: a)
			result+=i;
		return result;
	}
	
	public void increase(float i) {
		i += 1;
	}
	
	public static void doIt() {
		Student s = new Student("minh", 20);
		int n = 5;
		s.increase(5f);
		System.out.println(s.age);
	}
	
	void m1() {}
	
	//MAIN
	public static void main(String[] args) {
		String s = "a";
		s += "b";
		System.out.println(s);
		
	}
	

}
