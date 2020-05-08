package tuan6.bai5.aggregation;

public class NhanVien {
	public static final double LUONG_CO_BAN = 750000;
	public static final double LUONG_MAX = 20000000;
	private String tenNhanVien;
	private double heSoLuong;

	
	public NhanVien(String tenNhanVien, double heSoLuong) {
		this.setTenNhanVien(tenNhanVien);
		this.setHeSoLuong(heSoLuong);
	}

	
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	
	public boolean tangLuong(double plus) {
		if(this.tinhLuong() + plus > LUONG_MAX)
			return false;
		else 
			return true;
	}
	
	public double tinhLuong() {
		return LUONG_CO_BAN * this.getHeSoLuong();
	}

	public void inTTin() {
		System.out.println("Ten nhan vien: " + this.getTenNhanVien());
		System.out.println("Tong thu nhap: " + this.tinhLuong());
	}
}
