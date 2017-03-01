package coreHomework3;



public class Main {

	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.work();
		CoffeRobot crobot = new CoffeRobot();
		crobot.work();
		RobotDancer drobot = new RobotDancer();
		drobot.work();
		RobotCoocker coockRobot = new RobotCoocker();
		coockRobot.work();
	}

}
