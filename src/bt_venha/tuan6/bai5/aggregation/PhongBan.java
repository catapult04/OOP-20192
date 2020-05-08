package bt_venha.tuan6.bai5.aggregation;

public class PhongBan {
	public static final int SO_NV_MAX = 100;
	private String tenPhongBan;
	private byte soNhanVien;
	private NhanVien[] dsnv;

	public PhongBan(String tenPB, byte soNV) {
		tenPhongBan = tenPB;
		soNhanVien = soNV;
		dsnv = new NhanVien[SO_NV_MAX];
	}

	public boolean themNhanVien(NhanVien nv) {
		if (soNhanVien < SO_NV_MAX) {
			dsnv[soNhanVien] = nv;
			soNhanVien++;
			return true;
		} else
			return false;
	}

	public NhanVien xoaNhanVien() {
		if (soNhanVien > 0) {
			NhanVien tmp = dsnv[soNhanVien - 1];
			dsnv[soNhanVien - 1] = null;
			soNhanVien--;
			return tmp;
		} else
			return null;
	}

	public double tongLuong() {
		double tong = 0.0;
		for (int i = 0; i < soNhanVien; i++)
			tong += dsnv[i].tinhLuong();
		return tong;
	}

	public void inTTin() {
		System.out.println("Ten phong: " + tenPhongBan);
		System.out.println("So NV	 : " + soNhanVien);
		System.out.println("Thong tin cac NV...");
		for (int i = 0; i < soNhanVien; i++)
			dsnv[i].inTTin();
	}
}