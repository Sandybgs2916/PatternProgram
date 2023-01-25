package pattern;

import java.util.Scanner;

public class zero_nd_onepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
		for(int j = 1; j <= i; j++) {
			// if rows no + col no = even, then print 1
			// if rows no + col no = odd, then print 0
			if((i+j)%2==0) {
				System.out.print("1 ");
			}
			else {
				System.out.print("0 ");
			}
		}
			System.out.println();
	}
}
}  