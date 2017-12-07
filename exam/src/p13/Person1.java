package p13;

public class Person1 extends TestPerson {

	private String name;
	private Integer age;

	public String toString() {
		return "이름은 :" + name + ", 나이는 :" + age + "살";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
