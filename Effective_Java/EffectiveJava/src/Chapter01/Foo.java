package Chapter01;
//static 정적 메서드 패턴

import java.util.Collections;
import java.util.EnumSet;

public class Foo {
	
	String name;
	String address;
	
	/*2.똑같은 시그니처를 줄 수 없다.(똑같은 생성자를 여러개 만들 수 없다.)*/
//	public Foo(String name) {
//		this.name = name;
//	}
//	
//	public Foo(String address) {
//		this.name = name;
//		this.age = age;
//	}
	
	public Foo() {
		
	}
	
	public static Foo withAddress(String address) {
		Foo foo = new Foo();
		foo.address = address;
		
		return foo;
	}
	
	public Foo(String name) {
		this.name = name;
	}
	
	
	/*1. 이름을 주어 구체화 할수있다.*/
	public static Foo withName(String name) {
		return new Foo(name);
	}
	
	/*3. 매번 같은 객체가 리턴된다(매번 새로운 객체가 생성되는 것 보단).*/
	private static final Foo GOOD_NIGHT = new Foo();
	
	public static Foo getFoo() {
		return GOOD_NIGHT;
	}
	
	/*4. 리턴타입에는 인터페이스만 노출하고 실제 리턴은 실 구현체를 리턴
	 * 클라이언트는 인터페이스를 가지고만 코딩을 할 수있다.(ex. Collections)
	 * 자바 9 부터는 private static 9부터 사용할 수 있다.
	 * */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foo foo = new Foo("최준우"); //이런 방법 말고(생성자)	
		Foo foo2  = Foo.withName("최준우"); //이름을 줄 수 있다.
		
		Foo foo0 = Foo.withAddress("서울시 송파구");
		
		System.out.println(foo0.address);
		Foo foo3 = Foo.getFoo();
		
		//세개를 EnumSet에 넣어준다.
		EnumSet<Color> colors = EnumSet.allOf(Color.class);
		//EnumSet<Color> bluewhite = EnumSet.of(BLUE,WHITE);
		//Enum의 갯수에 따라 RegularEnumSet , JumboEnumSet으로 구성된다.
	}
	
	/*5.다형성을 적용시켜 같은 객체를 리턴하는 것이 아닌 하위 객체를 리턴 할 수도 있다.*/
	static class BarFoo extends Foo{
		
	}
//	public static Foo getFoo(boolean flag) {
//		return flag ? new Foo() : new BarFoo();
//	}
	
	
	
	enum Color{
		RED,BLUE,WHITE
	}
	
	//private static 이 필요한 이유?
	//밖으로 노출될 필요가 없기때문에
	public void doSomething() {
		//TODO 청소를 한다.
		//TODO 애들이랑 놀아준다.
		//TODO 저녁 약속에 간다.
		//TODO 게임을 한다.
		//TODO 잔다.
		게임을하고잔다();
	}
	public void doSomethingTomorrow() {
		//TODO 게임을 한다.
		//TODO 잔다.
		게임을하고잔다();
	}
	private void 게임을하고잔다() {
		//TODO 게임을 한다.
		//TODO 잔다.
	}
	//private static 좀더 알아보기
	
	/*6.*/
	public static Foo getFoo(boolean flag) {
		Foo foo = new Foo();
		
		//TODO 어떤 특정 약속되어있는 텍스트파일에서 foo의 구현체의 FQCN을 읽어온다.
		//TODO FQCN에 해당하는 인스턴스를 생성한다.
		//TODO foo 변수를 해당 인스턴스를 가리키도록 수정한다.
				
	    return foo;
	}

}



