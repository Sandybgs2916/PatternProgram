package pattern;

import java.util.Scanner;

public class invertedpyramidwithnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// rows : 1 to n; cols : n+1-rows no
		for(int i = 1; i <= n; i++) {
		for(int j = 1; j <= (n+1)-i; j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
}