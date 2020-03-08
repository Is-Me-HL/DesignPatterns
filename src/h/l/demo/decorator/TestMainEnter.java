package h.l.demo.decorator;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月14日
 * @Description: 测试
 */
public class TestMainEnter {

	public static void main(String[] args) {
		// 电脑基本功能
		BasicFuncComputer bfComputer = new BasicFuncComputer();
		bfComputer.work();
		System.out.println("-----------");
		// 基本功能基础上，动态装饰功能A
		ComputerDecorator conA = new ConcreteDecoratorA(bfComputer);
		conA.work();
		System.out.println("-----------");
		// 基本功能基础上，动态装饰功能B
		ComputerDecorator conB = new ConcreteDecoratorB(bfComputer);
		conB.work();
		System.out.println("-----------");
		// 基本功能既装饰A。也装饰B
		ComputerDecorator conC = new ConcreteDecoratorB(new ConcreteDecoratorA(new BasicFuncComputer()));
		conC.work();
		
		// 对应setComputer实现
		// 电脑基本功能
		/*BasicFuncComputer bfComputer = new BasicFuncComputer();
		bfComputer.work();
		System.out.println("-----------");
		// 基本功能基础上，动态装饰功能A
		ComputerDecorator conA = new ConcreteDecoratorA();
		conA.setComputer(bfComputer);
		conA.work();
		System.out.println("-----------");
		// 基本功能基础上，动态装饰功能B
		ComputerDecorator conB = new ConcreteDecoratorB();
		conB.setComputer(bfComputer);
		conB.work();
		System.out.println("-----------");
		// 基本功能既装饰A。也装饰B
		ComputerDecorator conC = new ConcreteDecoratorB();
		conC.setComputer(conA);
		conC.work();*/
	}

}
