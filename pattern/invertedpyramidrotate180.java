package pattern;

import java.util.Scanner;

public class invertedpyramidrotate180 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// outer loop
		for(int i = 1; i <= n; i++) {
			// inner loop -> space print
		for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
		// inner loop -> star print
		for(int j = 1; j <=i; j++) {
			System.out.print("*"); // no space here else wrong output gets print
		}
			System.out.println();
		}
	}
}