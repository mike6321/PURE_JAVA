package test1;

public class Client {
	public static void main(String[] args) {
		Robot robotA = new RobotA("RobotA");
		Robot robotB = new RobotB("RobotB");
		
		//System.out.println("My name is " + robotA.getName());
		robotA.move();
		robotA.attack();

	    System.out.println();
	    //System.out.println("My name is " + robotB.getName());
	    robotB.move();
	    robotB.attack();

	}
}
