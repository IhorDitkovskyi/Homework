package coreHomework5;

public class Main {

	public static void main(String[] args) {
		//�������� 1
		Pet dog = new Dog();
		dog.voice();
		Pet cat = new Cat();
		cat.voice();
		Pet cow = new Cow();
		cow.voice();
		
		//�������� 2
		Salary sel = new Worker();
		sel.salary();
		Salary sel1 = new HourWorker();
		sel1.salary();		
	}

}
