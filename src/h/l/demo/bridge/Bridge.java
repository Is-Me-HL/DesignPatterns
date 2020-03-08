package h.l.demo.bridge;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��3��8��
 * @Description: �Ž�ģʽ
 */
public class Bridge {
	public static void main(String[] args) {
		Abstraction abstraction = new ConcreteAbstraction();
		
		abstraction.setImplementor(new ConcreteImplementorA());
		abstraction.operation();
		
		System.out.println("-------------------");
		
		abstraction.setImplementor(new ConcreteImplementorB());
		abstraction.operation();
		
	}
}

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��3��8��
 * @Description: ��ά������Ϊ
 */
abstract class Abstraction{
	protected Implementor implementor;
	public void setImplementor(Implementor implementor){
		this.implementor = implementor;
	}
	public abstract void operation();
}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��3��8��
 * @Description: ���嵥ά������
 */
class ConcreteAbstraction extends Abstraction{

	@Override
	public void operation() {
		implementor.operation();
	}
	
}