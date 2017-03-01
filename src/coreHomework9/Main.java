package coreHomework9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import coreHomework8.Car;
import coreHomework8.Body;
import coreHomework8.Drive;
import coreHomework8.Helm;
import coreHomework8.Wheel;


public class Main {

	private static final List<Car> list = new ArrayList<>();
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		list.add(new Car(new Helm(1), new Wheel(1.32, 3.25), new Body(1, 1, "green"), new Drive(1)));
		list.add(new Car(new Helm(2), new Wheel(1.32, 3.25), new Body(1, 1, "red"), new Drive(1)));
		list.add(new Car(new Helm(3), new Wheel(1.32, 3.25), new Body(1, 1, "blue"), new Drive(1)));
		list.add(new Car(new Helm(4), new Wheel(1.32, 3.25), new Body(1, 1, "red"), new Drive(0)));
		list.add(new Car(new Helm(5), new Wheel(1.32, 3.25), new Body(1, 1, "black"), new Drive(1)));
		list.add(new Car(new Helm(6), new Wheel(1.32, 3.25), new Body(1, 1, "green"), new Drive(0)));
		list.add(new Car(new Helm(7), new Wheel(1.32, 3.25), new Body(1, 1, "red"), new Drive(0)));
		list.add(new Car(new Helm(8), new Wheel(1.32, 3.25), new Body(1, 1, "pinck"), new Drive(1)));
		list.add(new Car(new Helm(9), new Wheel(1.32, 3.25), new Body(1, 1, "gray"), new Drive(0)));
		list.add(new Car(new Helm(10), new Wheel(1.32, 3.25), new Body(1, 1, "blue"), new Drive(1)));
		while (true) {
			System.out.println("������� 1, ��� ������ ������ �� �������� ������");
			System.out.println("������� 2, ��� �������� ������ �� �������� ������");
			System.out.println("������� 3, ��� ������ ���� ������ � �������� �������� ����");
			System.out.println("������� 4, ��� �������� �� ������, �� ����� �������� ��� ������ �� �������� ������� ������� �����");
			System.out.println("������� 5, ��� �����'����� ������� �����, �� ����� �������� ��� ������");

			switch (sc.next()) {

			case "1":
				findByBody(sc, list);
				break;
			
			case "2":
				deleteByColor();
				break;
				
			case "3":
				changeTyres();
				break;

			case "4":
				deleteByColorAndHelm();
				break;
				
			case "5":
				findIndexes();
				break;

			default:
				sc.close();
				return;
			}
		}
	}
	
	static void changeTyres() {
		System.out.println("������ ��������� ������ ����");
		int min = sc.nextInt();
		System.out.println("������ ����������� ������ ����");
		int max = sc.nextInt();
		for (Car car : list) {
			if(car.getRadius() > min && car.getRadius() < max){
				System.out.println("� ���� ������"+car + "���������� ����� ����");
			}
		}
		
	}
	

	static void findIndexes() {
		System.out.println("Enter letter");
		String letter = sc.next();
		ListIterator<Car> iter = list.listIterator();
		List<Integer> list = new ArrayList<>();
		while (iter.hasNext()) {
			Car car = iter.next();
			if (car.getColor().contains(letter)) {
				list.add(iter.nextIndex() - 1);
			}
		}
		System.out.println(list);
	}
	
//������� �� ���� ������
	static void deleteByColorAndHelm() {
		System.out.println("������ ����");
		String color = sc.next();
		System.out.println("������ ������ �����");
		int radius = sc.nextInt();
		Iterator<Car> iter = list.iterator();
		while (iter.hasNext()) {
			Car car = iter.next();
			if (car.getColor().equals(color) && car.getHelm().equals(radius)) {
				iter.remove();
			}
		}
		list.forEach(System.out::println);
	}

	static void deleteByColor() {
		System.out.println("������ �����");
		String letter = sc.next();
		Iterator<Car> iter = list.iterator();
		while (iter.hasNext()) {
			Car car = iter.next();
			if (car.getColor().startsWith(letter)) {
				iter.remove();
			}
		}
		list.forEach(System.out::println);
	}

	static void findByBody(Scanner a, List<Car> list) {
		System.out.println("������ ���� ������");
		String color = a.next();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getColor().contains(color)) {
				System.out.println(list.get(i));
			}
		}
	}
}
