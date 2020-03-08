package h.l.demo.decorator;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月14日
 * @Description: 具体的装饰类A，重写装饰的内容
 */
public class ConcreteDecoratorA extends ComputerDecorator {
	public ConcreteDecoratorA(Computer computer) {
		super(computer);
	}

	@Override
	public void work(){
		super.work();
		System.out.println("我给Computer装饰了A功能");
	}
	
	// 对应父类的setComputer方式实现

	/*@Override
	public void work(){
		super.work();
		System.out.println("我给Computer装饰了A功能");
	}*/
}
