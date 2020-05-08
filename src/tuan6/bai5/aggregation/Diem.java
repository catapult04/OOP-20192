package tuan6.bai5.aggregation;

public class Diem {
	private int x;
	private int y;
	
	
	public Diem(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	
	public void in() {
		String open  = "{";
		String close = "}";
		String separate = "-";
		System.out.printf("%s%d %s %d%s\n", open, this.getX(), separate, this.getY(), close);
	}
}
