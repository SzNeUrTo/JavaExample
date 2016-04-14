import java.util.Scanner;

public class Array {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int size = 5;
		String array[] = new String [size];

		for (int i = 0; i < size; i++) {
			array[i] = sc.nextLine();
		}

		for (int i = 0; i < size; i++) {
			System.out.println("Hello, " + array[i]);
		}
	}
}
