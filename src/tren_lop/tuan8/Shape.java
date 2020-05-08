package tuan8;

public abstract class Shape {
	private String name;
	
	public Shape(String name) {
		this.name = name;
	}
	
	public static double calculateArea() {
		return -1;
	}
	
	public static void main(String[] args) {
		Square s = new Square("a",3);
	}
}
