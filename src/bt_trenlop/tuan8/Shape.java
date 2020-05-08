package bt_trenlop.tuan8;

public abstract class Shape {
	private String name;
	
	public Shape(String name) {
		this.name = name;
	}
	
	
	public double calculateArea() {
		return 0;
	}
	
	public static void main(String[] args) {
		Square s = new Square("a",3);
	}
}
