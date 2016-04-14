import java.lang.Math.*;
import java.util.Scanner;

public class Cost {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int fac = 1;
		for (int i = 1; i <= n; i++) {
			fac *= i;
		}
		System.out.println(fac);
	}
}
