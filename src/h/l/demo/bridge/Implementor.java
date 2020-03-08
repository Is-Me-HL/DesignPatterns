package h.l.demo.bridge;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年3月8日
 * @Description: 单维度行为
 */
public abstract class Implementor {
	public abstract void operation();
}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年3月8日
 * @Description: 具体实现类A
 */
class ConcreteImplementorA extends Implementor{

	@Override
	public void operation() {
		System.out.println("具体实现A的方法");
	}
	
}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年3月8日
 * @Description: 具体实现类B
 */
class ConcreteImplementorB extends Implementor{

	@Override
	public void operation() {
		System.out.println("具体实现B的方法");
	}
	
}