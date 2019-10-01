package test1;
public class RobotA extends Robot{
	private String name;
	
	public RobotA(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		//변경이 있을 때 코드 자체를 수정하는 것은 OCP 원칙에 위배되는 행위이다.
		//인터페이스로 크게 싸서 코드를 수정하기 보다는 새롭게 만드는 방식이 훨씬 효율적
		System.out.println("나는 미사일을 가지고 있다.");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("나는 걷기 밖에 못해.");
	}
	
	
}
