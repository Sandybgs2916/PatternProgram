package pattern;

import java.util.Scanner;

public class butterflypattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// for upper part & lower part: space = (2*n)-(2*i)
		// for upper part: rows 1 to n // lower part: n to 1
		for(int i = 1; i <= n; i++) {
		for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
		int space = (2*n)-(2*i);
		for(int j = 1; j <= space; j++) {
			System.out.print(" ");
		}
		for(int j = 1; j <= i; j++) {
			System.out.print("*");
		}
			System.out.println();
		}
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			int space = (2*n)-(2*i);
			for(int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
				System.out.println();
			}
	}
}