package homework1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������ ����� �� ����� ������� ��������� ����������");
		int i = in.nextInt();
		System.out.println("������ ����� �");
		int a = in.nextInt();
		System.out.println("������ ����� B");
		int b = in.nextInt();
		int c = i - a;
		int d = i - b;

		if (c == d) {
			System.out.println("����� �����������");
		} else if (c < d) {
			System.out.println("����� " +a+ " ������ �� " +i);
		} else  {
			System.out.println("����� " +b+ " ������ �� " +i);
		}
	
	}

}