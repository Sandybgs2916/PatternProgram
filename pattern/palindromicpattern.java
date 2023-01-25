package pattern;

import java.util.Scanner;

public class palindromicpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// space n-row no to 1
		// star 1 to 2 * row no - 1
		for(int i = 1; i <= n; i++) {
			// spaces
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			// first half number
		for(int j = i; j >= 1; j--) {
				System.out.print(j+" ");
			}
		// 2nd half number
		for(int j = 2; j <= i; j++) {
			System.out.print(j+" ");
		}
			System.out.println();
	}
	}
}