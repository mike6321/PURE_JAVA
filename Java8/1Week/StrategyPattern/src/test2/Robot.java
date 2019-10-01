package test2;

public abstract class Robot {
	private String name;
	//인터페이스 추가
	private AttackStrategy attackStrategy;
	private MovingStrategy movingStrategy;
	//인터페이스 추가
	
    public Robot(String name) { this.name = name; }
    public String getName() { return name; }
  
    // 추상 메서드
//    public abstract void attack();
//    public abstract void move();
    public void attact() {
    	attackStrategy.attack();
    }
    public void move() {
    	movingStrategy.move();
    }
    
	 // 집약 관계, 전체 객체가 메모리에서 사라진다 해도 부분 객체는 사라지지 않는다.
	 // setter 메서드
	 public void setAttackStrategy(AttackStrategy attackStrategy) {
	   this.attackStrategy = attackStrategy; }
	 public void setMovingStrategy(MovingStrategy movingStrategy) {
	   this.movingStrategy = movingStrategy; }
}
