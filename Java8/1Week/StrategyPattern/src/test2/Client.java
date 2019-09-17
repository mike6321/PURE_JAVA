package test2;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robotA = new RobotA("최준우");
		Robot robotB = new RobotB("최준우2");
		
		robotA.setAttackStrategy(new MissileStrategy());
		robotB.setMovingStrategy(new FlyingStrategy());
		
		
	}

}
