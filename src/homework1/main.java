package homework1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введіть число до якого потрібно перевірити віддаленість");
		int i = in.nextInt();
		System.out.println("введіть число А");
		int a = in.nextInt();
		System.out.println("введіть число B");
		int b = in.nextInt();
		int c = i - a;
		int d = i - b;

		if (c == d) {
			System.out.println("Числа рівновіддалені");
		} else if (c < d) {
			System.out.println("Число " +a+ " ближче до " +i);
		} else  {
			System.out.println("Число " +b+ " ближче до " +i);
		}
	
	}

}