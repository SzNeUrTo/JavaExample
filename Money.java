import java.lang.Math.*;
import java.util.Scanner;

public class Money {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();

		System.out.println("[1000] = " + money / 1000);
		System.out.println("[500] = " + money % 1000 / 500);
		System.out.println("[100] = " + money % 1000 % 500 / 100);
		System.out.println("[50] = " + money % 1000 % 500 % 100 / 50);
		System.out.println("[20] = " + money % 1000 % 500 % 100 % 50 / 20);
		System.out.println("[10] = " + money % 1000 % 500 % 100 % 50 % 20 / 10);
		System.out.println("[5] = " + money % 1000 % 500 % 100 % 50 % 20 % 10 / 5);
		System.out.println("[2] = " + money % 1000 % 500 % 100 % 50 % 20 % 10 % 5 / 2);
		System.out.println("[1] = " + money % 1000 % 500 % 100 % 50 % 20 % 10 % 5 % 2);
	}
}
