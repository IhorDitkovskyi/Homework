package coreHomework7;

import java.util.Scanner;

import coreHomework7.Cars;

public class Main {

	public static void main(String[] args) {

		Cars[] cars = Cars.values();
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter 1 to show ñars by color");
			System.out.println("Enter 2 to show cars by techmology");
			System.out.println("Enter 3 to show cars by price");
			
			switch (sc.next()) {
			
			case "1":
				System.out.println("Enter color's name");
				String res = sc.next();
				for (int i = 0; i < cars.length; i++) {
					if(cars[i].getColor()==Colors.valueOf(res.toUpperCase())){
						System.out.println(cars[i]);
					} 
				}
				break;
						
			case "2":
				System.out.println("Enter technology");
				String res1 = sc.next();
				for (int i = 0; i < cars.length; i++) {
					if(cars[i].getTechnology()==Technology.valueOf(res1.toUpperCase())){
						System.out.println(cars[i]);
					} 
				}
				break;
				
			/*case "3":
				System.out.println("Enter price");
				int res3 = sc.nextInt();
				for (int i = 0; i < cars.length; i++) {
					if(res3==cars[i].getPrice()){
						System.out.println(cars[i]);
					}
				}
				break;*/
				
			case "3":
				System.out.println("Enter price");
				int res4 = sc.nextInt();
				for (int i = 0; i < cars.length; i++) {
					if(res4==cars[i].getPrice()){
						System.out.println(cars[i]);
					}
				}
				break;
								
			default:
				sc.close();
				return;
			}
		}

	}
		
}

