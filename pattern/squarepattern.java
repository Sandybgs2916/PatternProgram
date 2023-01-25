package pattern;

import java.util.Scanner;

public class squarepattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		// outer loop
		for(int i = 1; i <= rows; i++) {
			// inner loop
		for(int j = 1; j <= cols; j++) { 
		System.out.print("* ");
		}
		System.out.println();
		}
	}
}