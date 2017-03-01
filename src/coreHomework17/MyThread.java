package coreHomework17;

import java.util.Scanner;

public class MyThread extends Thread {

	public MyThread() {
		start();
	}

	@Override
	public void run() {
		fibo();
	}

	public void fibo() {
		int a = 1;
		int b = 1;
		int n;
		int sum_fib;
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть к≥льк≥сть чисел, €к≥ потр≥бно вивеси");
		n = sc.nextInt();
		try {
			Thread.sleep(1000);
			for (int i = 0; i < n; i++) {
				sum_fib = a + b;
				a = b;
				b = sum_fib;
				System.out.print(sum_fib + " ");
			}
			sc.close();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
