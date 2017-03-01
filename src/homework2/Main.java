package homework2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Задача 1");
		System.out.println(one(1000));
		System.out.println("");

		System.out.println("Задача 2");
		System.out.println(two());
		System.out.println("");

		System.out.println("Задача 3");
		System.out.println(three());
		System.out.println("");
		
		System.out.println("Задача 4");
		System.out.println(four());
		System.out.println("");
		
		System.out.println("Задача 5");
		System.out.println(five());
		System.out.println("");
		
		System.out.println("Задача 6");
		System.out.println(six());
		System.out.println("");
		
		System.out.println("Задача 7");
		System.out.println(seven());
		System.out.println("");
		
		System.out.println("Задача 8");
		System.out.println(eight());
		System.out.println("");
	}

	static int one(int i) {
		for (i = 1000; i <= 1015;) {
			System.out.println(i);
			i = i + 3;
		}
		return i;
	}

	static int two() {
		int a = 1;
		for (int i = 1; i <= 55; i++, a = a + 2) {
			System.out.println(a);
		}

		return a;
	}

	static int three() {
		int a = 90;
		for (int i = 17; i >= 0; i--, a = a - 5) {
			System.out.println(a);
		}
		return a;
	}

	static int four() {
		int a = 2;
		for (int i = 1; i <= 20; i++, a = a * 2) {
			System.out.println(a);
		}
		return a;
	}

	static int five() {
		int a = 2;
		for (; a < 10000; a = 2 * a - 1) {
			System.out.println(a);
		}
		return 0;
	}

	static int six() {
		int a = -166;
		for (; a < 100; a = 2 * a + 200) {
			if (a > 0) {
				System.out.println(a);
			}
		}
		return 0;
	}

	static int seven() {
		int b=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть число");
		int a = sc.nextInt();
		for (int i=a; i>0; i--){
			b*=i;
		}
		return b;
	}

	static int eight() {
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть число");
		int a = sc.nextInt();
		for(int i=a; i>0; i--){
			b=a%i;
			if(b==0)
			System.out.println(i);
		}
		return 0;
	}

}
