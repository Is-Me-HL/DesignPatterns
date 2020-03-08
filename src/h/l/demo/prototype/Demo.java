package h.l.demo.prototype;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月20日
 * @Description: 引用类型的赋值示例
 */
public class Demo {

	private String name;
	private int age;
	private char garde;

	public Demo(String name, int age, char garde) {
		super();
		this.name = name;
		this.age = age;
		this.garde = garde;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGarde() {
		return garde;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGarde(char garde) {
		this.garde = garde;
	}

	@Override
	public String toString() {
		return "Demo [name=" + name + ", age=" + age + ", garde=" + garde
				+ "]";
	}

	public static void main(String[] args) {
		Demo p = new Demo("Is-Me-HL", 18, 'A');
		System.out.println("p:" + p.toString());
		System.out.println("-----------------------");
		Demo p2 = p;
		p2.setName("Is-Me-HL2");
		p2.setAge(19);
		p2.setGarde('B');
		System.out.println("p2:" + p2.toString());
		System.out.println("-----------------------");
		System.out.println("p1==p2?"+(p==p2));
		p2.setName("hehehehe");
		System.out.println("p:" + p.toString());
		System.out.println("p2:" + p2.toString());
	}

}
