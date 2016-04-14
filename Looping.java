import java.lang.Math.*;
import java.util.Scanner;

public class Looping {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					System.out.println("i = " + i + " j = " + j + " k = " + k);
				}
			}
		}
	}
}
