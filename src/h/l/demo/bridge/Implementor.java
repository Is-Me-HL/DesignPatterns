package h.l.demo.bridge;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��3��8��
 * @Description: ��ά����Ϊ
 */
public abstract class Implementor {
	public abstract void operation();
}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��3��8��
 * @Description: ����ʵ����A
 */
class ConcreteImplementorA extends Implementor{

	@Override
	public void operation() {
		System.out.println("����ʵ��A�ķ���");
	}
	
}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��3��8��
 * @Description: ����ʵ����B
 */
class ConcreteImplementorB extends Implementor{

	@Override
	public void operation() {
		System.out.println("����ʵ��B�ķ���");
	}
	
}