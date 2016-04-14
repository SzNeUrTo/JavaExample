import java.lang.Math.*;
import java.util.Scanner;

public class MathIF {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double result;
		if (x >= 1) {
			result = Math.pow(Math.E, Math.PI) + x * Math.sin(8 * x + 2);
		}
		else if (x > -1) {
			result = (2 * Math.sqrt(Math.pow(x, 10) + 5) + 16) / 25;
		}
		else {
			result = 3.0 / 2 + Math.pow(7 * Math.log(Math.abs(x)), Math.PI);
		}
		System.out.println(result);
	}
}
