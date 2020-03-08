package h.l.demo.bridge;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年3月8日
 * @Description: 桥接模式
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
 * @date: 2020年3月8日
 * @Description: 单维度主行为
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
 * @date: 2020年3月8日
 * @Description: 具体单维度主类
 */
class ConcreteAbstraction extends Abstraction{

	@Override
	public void operation() {
		implementor.operation();
	}
	
}