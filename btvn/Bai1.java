package oop.btvn;
import java.util.Scanner;
public class Bai1 {
	public static void main(String[]args) {
		println("Nhap vao 2 so:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		println("Tong:   "+ (a+b));
		println("Hieu:   "+ (a-b));
		println("Tich:   "+ (a*b));
		if(b==0) 
			println("So thu hai = 0");
		else
			println("Thuong: "+ (a+b));
		sc.close();
	}
	
	public static void println(String content) {
		System.out.println(content);
	}
}
