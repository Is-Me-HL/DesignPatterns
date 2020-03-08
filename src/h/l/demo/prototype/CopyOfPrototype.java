package h.l.demo.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��20��
 * @Description: ԭ��ģʽ-���ʾ��
 * �����ǳ������������ǣ�ǳ����������ȫ�����Ķ�������������ֻ�����������ͣ��������������͡�
 * �������������������е����԰������������ͣ�����󡢼��ϣ�ps��StringΪ������������ͣ����������棩��
 * ��ôҪ��ȫ���������Ķ����Ҫʹ��������������������͵����Խ������⴦��������ʾ��
 */
public class CopyOfPrototype implements Cloneable {

	private String name;
	private int age;
	private char garde;

	// ������������ʹ����Ҫ�������
	// ����ʽ�����Ͼ���clone���������һ�п�¡����䣬���������
	// ע����Ǽ��϶���ӿ���List��û��clone�����ģ��������Ե�������Ҫ��������࣬������ʹ�õ�ArrayList
	private ArrayList<String> list;
	// ��CopyOfPrototypeʵ�� Cloneable�ӿڣ���д�Լ���clone��������
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
			// ������Ǵ��������Կ�������䡣���
			p.list = (ArrayList<String>) this.list.clone();
			// �����Ǵ�����󿽱�����䡣���
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