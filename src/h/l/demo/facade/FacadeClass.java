package h.l.demo.facade;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��23��
 * @Description: ����ࣺ��Ҫ�˽�������ϵͳ�ķ��������ԣ���������Ա�������
 */
public class FacadeClass {
	// ��ϵͳһ
	SubSystemOne subSystemOne;
	// ��ϵͳ��
	SubSystemTwo subSystemTwo;
	// ��ϵͳ��
	SubSystemThree subSystemThree;
	// ��ϵͳ��
	SubSystemFour subSystemFour;
	
	public FacadeClass(){
		subSystemOne = new SubSystemOne();
		subSystemTwo = new SubSystemTwo();
		subSystemThree = new SubSystemThree();
		subSystemFour = new SubSystemFour();
	}
	
	// �����ýӿ�һ
	public void methodA(){
		System.out.println("������A():");
		subSystemOne.methodOne();
		subSystemTwo.methodTwo();
	}
	// �����ýӿڶ�
	public void methodB(){
		System.out.println("������B():");
		subSystemThree.methodThree();
		subSystemFour.methodFour();
	}
	
	public static void main(String[] args) {
		new FacadeClass().methodA();
		System.out.println("----------------------");
		new FacadeClass().methodB();
	}

}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��23��
 * @Description: ��ϵͳһ
 */
class SubSystemOne{
	public void methodOne(){
		System.out.println("��ϵͳ����һ");
	}
}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��23��
 * @Description: ��ϵͳ��
 */
class SubSystemTwo{
	public void methodTwo(){
		System.out.println("��ϵͳ������");
	}
}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��23��
 * @Description: ��ϵͳ��
 */
class SubSystemThree{
	public void methodThree(){
		System.out.println("��ϵͳ������");
	}
}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��23��
 * @Description: ��ϵͳ��
 */
class SubSystemFour{
	public void methodFour(){
		System.out.println("��ϵͳ������");
	}
}