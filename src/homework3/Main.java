package homework3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		one(4, 5);
		System.out.println(two());
		three();
		System.out.println(four());
		five();
		nine();
		ten();
		eleven();
		twelve();
		thirteen();
		//fourteen();
		//fifteen();
		//sixteen();
		seventeen();
		eighteen();
		nineteen();
		twenty();

	}

	static int one(int a, int b) {
		int i = a + b;
		return i;
	}

	static int two() {

		int c = one(1, 9) + one(1, 4);
		return c;
	}

	static void three() {
		System.out.println("метод 3");
		System.out.println("Hello");
	}

	static int four() {
		/* Обчислення факторіала */
		System.out.println("метод 4");
		int b = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть число");
		int a = sc.nextInt();
		for (int i = a; i > 0; i--) {
			b *= i;
		}
		return b;

	}

	static int five() {
		System.out.println("метод 5");
		int c = one(1, 9) + two();
		System.out.println(c);
		return c;

	}

	static int six(int a, int b) {
		int c = a + b;
		return c;
	}

	static int seven(int a, int b) {
		int c = a * b;
		return c;
	}

	/*
	 * static int eight() { static int subMetod1 (int a, int b) { int c= six(1 ,
	 * 2) + seven(3, 4); return c; } static int subMetod2(int a, int b){ int c =
	 * seven(5, 6) - six(5, 6); return c; }
	 * 
	 * return 0; }
	 */

	static void nine() {
		System.out.println("метод 9");
		System.out.println(two());

	}

	static void ten() {
		System.out.println("Накрутив з попередніми методами, " + "в наступних будуть просто якісь "
				+ "задачкиииииииииииииииииииии");

	}

	static void eleven() {
		System.out.println();
		System.out.println("Ця програма допоможе вирахувати вашу вагу на Місяці ;-)");
		System.out.println("");
		System.out.println("Отже, почнімо!");

		Scanner keyboard = new Scanner(System.in);
		System.out.println();
		System.out.print("Чому дорівнює ваша вага на Землі ? - ");
		double weightPeopleEarth = keyboard.nextInt();
		double weightPeopleMoon = weightPeopleEarth * 0.17;
		System.out.println("");
		System.out.println("Ваша вага на Місяці дорівнює " + weightPeopleMoon + " кг.");

	}

	static void twelve() {
		String s = "Ах ти ж бяка";
		String s2 = s.replaceAll("бяка", "гарний хлопчик");
		System.out.println(s2);

	}

	static void thirteen() {
		int a = 1500;
		float b;
		float c;
		System.out.println();
		System.out.println("Щоб вирахувати відстань від блискавки");
		System.out.println("введіть час після спалаху ");
		Scanner scn = new Scanner(System.in);
		b = scn.nextInt();
		c = b * a;
		System.out.println("Відстань від блискавки = " + c + "метрів");
	}

	/*static void fourteen() {
		/*Гра "Вгадай букву"
		Scanner sc = new Scanner(System.in);
		
		char ch = (char)('A' + new Random().nextInt(26));

		System.out.println(ch);
		System.out.println("Hello, try to guesse the letter!");

		for(char i = 0; i < 26;i ++){ 
			char s = sc.next().charAt(0);

			if(ch==s) {
				System.out.println("Congratulations! You win this time!");
				break;
			} else {
				System.out.println("Sorry, but you didn't guess, try again!");

				if(Character.getNumericValue(ch)>Character.getNumericValue(s)) {
					System.out.println("I give you a hint! You are too low!");
				} else if(Character.getNumericValue(ch)<Character.getNumericValue(s)){ 
					System.out.println("I give you a hint! You are too high!");
				}
			}
		}
		
	}*/

	/*static void fifteen() {
	    String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
	    int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };

	    int first = sixteen(times);
	    System.out.println(names[first]);
		
	}

	static int sixteen() {
	    int num = array[0];
	    int ind = 0;
	    for (int i = 0; i < array.length; i++) {
	        if (array[i] < num) {
	            num = array[i];
	            ind = i;
	        }
	    }
	    return ind;
		
	}*/

	static int seventeen() {
		int a = 2;
		for (int i = 1; i <= 20; i++, a = a * 2) {
			System.out.println(a);
		}
		return a;
		
		
	}

	static int eighteen() {
		int a = 90;
		for (int i = 17; i >= 0; i--, a = a - 5) {
			System.out.println(a);
		}
		return a;
		
	}

	static int nineteen() {
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

	static int twenty() {
		int a = 1;
		for (int i = 1; i <= 55; i++, a = a + 2) {
			System.out.println(a);
		}

		return a;
		
	}

}
