package coreHomework8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Car> list = new ArrayList<>();
		list.add(new Car(new Helm(1), new Wheel(1.32, 3.25), new Body(1, 1, "green"), new Drive(1)));
		list.add(new Car(new Helm(2), new Wheel(1.32, 3.25), new Body(1, 1, "red"), new Drive(1)));
		list.add(new Car(new Helm(3), new Wheel(1.32, 3.25), new Body(1, 1, "blue"), new Drive(1)));
		list.add(new Car(new Helm(4), new Wheel(1.32, 3.25), new Body(1, 1, "red"), new Drive(0)));
		list.add(new Car(new Helm(5), new Wheel(1.32, 3.25), new Body(1, 1, "black"), new Drive(1)));
		list.add(new Car(new Helm(6), new Wheel(1.32, 3.25), new Body(1, 1, "green"), new Drive(0)));
		list.add(new Car(new Helm(7), new Wheel(1.32, 3.25), new Body(1, 1, "red"), new Drive(0)));
		list.add(new Car(new Helm(1), new Wheel(1.32, 3.25), new Body(1, 1, "pinck"), new Drive(1)));
		list.add(new Car(new Helm(9), new Wheel(1.32, 3.25), new Body(1, 1, "gray"), new Drive(0)));
		list.add(new Car(new Helm(10), new Wheel(1.32, 3.25), new Body(1, 1, "blue"), new Drive(1)));
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("������ 1, ��� ������ ������, �� ����� �������� ������ ����");

			System.out.println("������ 2, ��� ������ ������, �� ����� �������� ������ ����, " + "�� ���� ������");

			System.out.println(
					"������ 3, ��� ������� � ��� �������, " + "�� ����� �������� ���� ������, ����� �� ����");

			System.out.println("������ 4, ��� �������� ������ ���� �����," + " ���� ����� �� ��������");

			System.out.println("������ 5, ��� ������� �� ������, "
					+ "�� ����� ������ �������� ����� �� ������� ��������, �� ���� ������");

			switch (sc.next()) {

			case "1":
				diametrMetod1(sc, list);
				break;

			case "2":
				RadiusColorMetod2(sc, list);
				break;

			case "3":
				SetDriveMetod3(sc, list);
				break;

			case "4":
				x2DiametrMetod4(list);
				break;

			case "5":
				SetWeelsMetod5(sc, list);
				break;
			default:
				sc.close();
				return;
			}
		}

	}

	public static void diametrMetod1(Scanner a, List<Car> list) {
		System.out.println("������ ������ ����");
		int b = a.nextInt();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getRadius() == b)
				System.out.println("car" + i + " ~" + list.get(i));
		}
	}

	public static void RadiusColorMetod2(Scanner a, List<Car> list) {
		System.out.println("������ ������ ���� �� ���� ������");
		int b = a.nextInt();
		String c = a.next();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getRadius() == b && list.get(i).getColor().equals(c)) {
				System.out.println("car" + i + " ~" + list.get(i));
			}
		}
	}

	public static void SetDriveMetod3(Scanner a, List<Car> list) {
		int CountOfButter = a.nextInt();
		Drive drive = new Drive(CountOfButter);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getColor().equals("red")) {
				System.out.print("car" + i + " ~" + list.get(i));
				list.get(i).setDrive(drive);
				System.out.println("�����->car" + i + " ~" + list.get(i));
			}

		}
	}

	public static void x2DiametrMetod4(List<Car> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getDrive().getCountOfButter() != 0) {
				System.out.print("car" + i + " ~" + list.get(i));
				list.get(i).setRadius(list.get(i).getRadius() * 2);
				System.out.println("�����->car" + i + " ~" + list.get(i));
			}

		}

	}

	public static void SetWeelsMetod5(Scanner a, List<Car> list) {
		int b = a.nextInt();
		int radius = a.nextInt();
		double speed = a.nextDouble();
		double time = a.nextDouble();
		int weight = a.nextInt();
		int height = a.nextInt();
		String color = a.next();
		int countOfButter = a.nextInt();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getRadius() < b) {
				Car car = new Car(new Helm(radius), new Wheel(speed, time), new Body(weight, height, color),
						new Drive(countOfButter));
				System.out.print("car" + i + " ~" + list.get(i));
				list.set(i, car);
				System.out.println("�����->car" + i + " ~" + list.get(i));
			}

		}
	}
}
