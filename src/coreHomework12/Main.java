package coreHomework12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(Mull(1, 100));
		System.out.println(Add(100, 0));
		System.out.println(Sub(0, 20));
		System.out.println(Div(100, 20));
		System.out.println(MyException(0, 0));
	}

	public static int Mull(int a, int b) {
		if (a < 0 || b < 0)
			throw new IllegalArgumentException("����� ������ ���� ����� �� 0");
		return a * b;
	}
	
	public static int Add(int a, int b) {
		if (a == 0 || b != 0)
			throw new ArithmeticException("������ a �� 0, b 0");
		return a + b;
	}
	
	public static int Sub(int a, int b) {
		if (a != 0 || b == 0)
			throw new ArithmeticException("������ a  0, b �� 0");
		return a - b;
	}
	
	//����������
	public static int Div(int a, int b) {
		if (a == 0 || b == 0)
			throw new ArithmeticException("������ a �� 0, b 0");
		return a / b;
	}
	
	//��������
	public static int MyException(int a, int b) {
		if (a > 0 || b > 0)
			throw new MyException();
		return a + b;
	}
	

}
