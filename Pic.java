import java.lang.Math.*;
import java.util.Scanner;

public class Pic {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = n-1; i >= 0; i--) {
			for (int j = -n+1; j <= n-1; j++) {
				if (i >= Math.abs(j)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 1; i <= n-1; i++) {
			for (int j = -n+1; j <= n-1; j++) {
				if (i >= Math.abs(j)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
