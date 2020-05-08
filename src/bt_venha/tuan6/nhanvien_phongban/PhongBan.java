package tuan6;
import java.util.*;

public class PhongBan {
	private final byte SO_NV_MAX = 100;
	private String tenPhongBan;
	private byte soNhanVien;
	private NhanVien [] dsnv;
	
	public PhongBan(String tenPhongBan, byte soNhanVien) {
		super();
		this.tenPhongBan = tenPhongBan;
		this.soNhanVien = soNhanVien;
	}

	public boolean themNhanVien (NhanVien nv) {
		if (soNhanVien < SO_NV_MAX) {
			dsnv[soNhanVien] = nv;
			soNhanVien ++;
			return true;
		} else return false;
	}
	
	public NhanVien xoaNhanVien () {
		if(soNhanVien > 0) {
			NhanVien tmp = dsnv[soNhanVien - 1];
			dsnv[soNhanVien - 1] = null;
			soNhanVien --;
			return tmp;
		} else return null;
	}
	
	public double tongLuong() {
		double tong = 0;
		for (int i=0; i<soNhanVien; i++) {
			tong += dsnv[i].tinhLuong();
		}
		return tong;
	}
	
	public void inTTin() {
		System.out.println("Ten phong: " + tenPhongBan);
		System.out.println("So Nhan Vien: " + soNhanVien);
		System.out.println("Danh sach nhan vien:");
		for(int i=0; i < soNhanVien; i++) {
			System.out.println("- Nhan Vien " + (i+1) + ":");
			dsnv[i].inTTin();
			
		}
	}
	
	
	public static void main (String args []) {
		PhongBan p = new PhongBan("Phong Nhan Su", (byte) 0);
		
		Scanner input = new Scanner (System.in);
		
		try {
			for(byte i=0; i<5; i++) {
				System.out.println("Nhan vien " + (i+1));
				System.out.print("Ten: ");
				String name = input.nextLine();
				System.out.print("He So Luong: ");				
				double heSoLuong = Double.parseDouble(input.nextLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		input.close();
		
		p.inTTin();
		
	}
}