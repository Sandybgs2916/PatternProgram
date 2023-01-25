package pattern;

import java.util.Scanner;

public class oddstardecreases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// space n-row no to 1
		// star 1 to 2 * row no - 1
		for(int i = n; i >= 1; i--) {
			for(int j = i; j <= n-1; j++) {
				System.out.print(" ");
			}
		for(int j = 1; j <= (2*i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
	}
	}
}