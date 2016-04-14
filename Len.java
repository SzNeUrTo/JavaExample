import java.lang.Math.*;
import java.util.Scanner;

public class Len {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		/*
		int len = sc.nextLine().length();
		System.out.println(len);
		*/

		String text = sc.nextLine();
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		text = text.toLowerCase();
		System.out.println(text);

	}
}
