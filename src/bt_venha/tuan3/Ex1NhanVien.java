package tuan3;

public class Ex1NhanVien {
	private String tenNhanVien;
	private double luongCoBan;
	private double heSoLuong;
	public final double LUONG_MAX;
		
	//constructor
	public Ex1NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong, double LUONG_MAX) {
		this.setTenNhanVien(tenNhanVien);
		this.setLuongCoBan(luongCoBan);
		this.setHeSoLuong(heSoLuong);
		this.LUONG_MAX = LUONG_MAX;
	}
	
	//setters and getters
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public double getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	
	//other methods
	public boolean tangLuong(double delta) {
		delta += this.getHeSoLuong();
		if(delta * this.getLuongCoBan() > this.LUONG_MAX) {
			System.out.println("Exceed LUONG_MAX");
			return false;
		} else {
			this.setHeSoLuong(delta);
			return true;
		}
	}
	
	public double tinhLuong() {
		return this.getHeSoLuong()*this.getLuongCoBan();
	}
	
	public void inTTin() {
		System.out.println("Ten Nhan Vien: " + this.getTenNhanVien());
		System.out.println("Tong Thu Nhap: " + this.tinhLuong());
		System.out.println("Luong Toi Da : " + this.LUONG_MAX);
		System.out.println();
	}
		
	//main method
	public static void main(String[] args) {
		Ex1NhanVien nv1 = new Ex1NhanVien("Nguyen Thanh Dat", 1000, 1.25, 2000);
		Ex1NhanVien nv2 = new Ex1NhanVien("Nguyen Thanh Tien", 1000, 1.25, 2500);
		
		nv1.inTTin();
		nv2.inTTin();
	}
}
