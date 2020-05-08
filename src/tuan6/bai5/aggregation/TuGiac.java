package tuan6.bai5.aggregation;

public class TuGiac {
	private Diem d1, d2, d3, d4;

	public TuGiac(Diem d1, Diem d2, Diem d3, Diem d4) {
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
		this.d4 = d4;
	}
	
	public void in() {
		d1.in();
		d2.in();
		d3.in();
		d4.in();
	}
}
