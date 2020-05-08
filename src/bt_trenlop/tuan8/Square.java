package bt_trenlop.tuan8;

public class Square extends Shape {
	private double side;
	
	public Square(String name, double side) {
		super(name);
		this.side = side;
	}
	
	@Override
	public double calculateArea() {
		return -1;
	}
}
