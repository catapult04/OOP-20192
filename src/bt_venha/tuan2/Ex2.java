package bt_venha.tuan2;
import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {
		// nhập kích thước
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Nhap vao kich thuoc: ");
			n = sc.nextInt();
		} while((n<3) || (n>8));
		sc.close();
		
		// tạo ma trận xoắn ốc
		int[][] spiral = new int[n][n];
		int rMin = 0, cMin = 0, rMax = n-1, cMax = n-1; // r: row,  c: column
		int iter = 1;
		int r = 0, c = 0;
		while(iter < n*n) {
			while(c < cMax) 
				spiral[r][c++] = iter++;
			rMin++; // làm gần xong đư�?ng bao trên, rMin phải dịch xuống 1 hàng
			
			while(r < rMax)
				spiral[r++][c] = iter++;
			cMax--; // làm gần xong đư�?ng bao phải, cMax phải dịch trái 1 cột
			
			while(c > cMin)
				spiral[r][c--] = iter++;
			rMax--; // làm gần xong đư�?ng bao dưới, rMax phải dịch lên 1 hàng
			
			while(r > rMin)
				spiral[r--][c] = iter++;
			cMin++; // làm gần xong đư�?ng bao trái, cMin phải dịch phải 1 cột
		}
		spiral[r][c] = iter;
		
		// in kết quả
		for(r=0; r<n; r++) {
			for(c=0; c<n; c++) {
				System.out.printf("%-3d", spiral[r][c]);
			}
			System.out.println();
		}		
	}
}
