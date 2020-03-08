package h.l.demo.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月20日
 * @Description: 原型模式-深拷贝示例
 * 深拷贝和浅拷贝的区别就是：浅拷贝所能完全拷贝的对象是其属性中只包含基本类型，不包含引用类型。
 * 深拷贝所拷贝的这个对象中的属性包含了引用类型（如对象、集合，ps：String为特殊的引用类型，不算在里面），
 * 那么要完全拷贝这样的对象就要使用深拷贝对这样的引用类型的属性进行特殊处理，如下所示：
 */
public class CopyOfPrototype implements Cloneable {

	private String name;
	private int age;
	private char garde;

	// 下述两个属性使用需要进行深拷贝
	// 处理方式，集合就在clone方法中添加一行克隆的语句，进行深拷贝。
	// 注意的是集合顶层接口如List是没有clone方法的，所以属性的类型需要具体的子类，如下述使用的ArrayList
	private ArrayList<String> list;
	// 和CopyOfPrototype实现 Cloneable接口，重写自己的clone方法即可
	private ClassDemo classDemo;

	public CopyOfPrototype(String name, int age, char garde,
			ArrayList<String> list, ClassDemo classDemo) {
		super();
		this.name = name;
		this.age = age;
		this.garde = garde;
		this.list = list;
		this.classDemo = classDemo;
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

	public List<String> getList() {
		return list;
	}

	public ClassDemo getClassDemo() {
		return classDemo;
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

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	public void setClassDemo(ClassDemo classDemo) {
		this.classDemo = classDemo;
	}

	@Override
	public String toString() {
		return "CopyOfPrototype [name=" + name + ", age=" + age + ", garde="
				+ garde + ", list=" + list + ", classDemo=" + classDemo + "]";
	}

	@Override
	protected Object clone() {
		CopyOfPrototype p = null;
		try {
			p = (CopyOfPrototype) super.clone();
			// 这里就是处理集合属性拷贝的语句。深拷贝
			p.list = (ArrayList<String>) this.list.clone();
			// 这里是处理对象拷贝的语句。深拷贝
			p.classDemo = (ClassDemo) this.classDemo.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}

	public static void main(String[] args) {
		ArrayList list = new ArrayList<String>();
		list.add("UJS");
		ClassDemo classDemo = new ClassDemo("HL");
		CopyOfPrototype p = new CopyOfPrototype("Is-Me-HL", 18, 'A', list,
				classDemo);
		System.out.println("p:" + p.toString());
		System.out.println("-----------------------");
		CopyOfPrototype p2 = (CopyOfPrototype) p.clone();
		p2.setName("Is-Me-HL2");
		p2.setAge(19);
		p2.setGarde('B');
		System.out.println("p2:" + p2.toString());
		System.out.println("-----------------------");
		System.out.println("p1==p2?" + (p == p2));
		p2.setName("JJJJJJJJ");
		p2.getList().add("IOT");
		p2.getClassDemo().setClassDemoName("HHHHHHHHHH");
		p.getClassDemo().setClassDemoName("LLLLLLLLLL");
		System.out.println("p:" + p.toString());
		System.out.println("p2:" + p2.toString());
	}
}

class ClassDemo implements Cloneable {
	private String ClassDemoName;

	public ClassDemo(String classDemoName) {
		super();
		ClassDemoName = classDemoName;
	}

	public String getClassDemoName() {
		return ClassDemoName;
	}

	public void setClassDemoName(String classDemoName) {
		ClassDemoName = classDemoName;
	}

	@Override
	public String toString() {
		return "ClassDemo [ClassDemoName=" + ClassDemoName + "]";
	}

	@Override
	protected Object clone() {
		ClassDemo p = null;
		try {
			p = (ClassDemo) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}

}