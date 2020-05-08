package tuan2;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		System.out.print("Enter elements: ");
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		
		sort(a, n);
		for(int i = 0; i < n; i++) {
			System.out.printf("%d ", a[i]);
		}
	}
	
	public static void sort(int[] a, int n) {
		int i,j,temp;
		for(i=0; i<n-1; i++)
			for(j=i+1; j<n; j++) {
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
	}
}
