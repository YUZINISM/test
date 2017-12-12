package p16;

public class Animal implements Action {

	public String name;
	public int age;
	public int length;

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", length=" + length + "]";
	}

	@Override
	public void eat() {
		System.out.println( name +"사료를 먹는다");

	}

	@Override
	public void sleep() {
		System.out.println(name +"잠을 잔다");

	}

	@Override
	public void walk() {
		System.out.println(name +"걷는다");

	}

}
