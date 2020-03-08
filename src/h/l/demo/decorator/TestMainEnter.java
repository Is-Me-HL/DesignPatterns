package h.l.demo.decorator;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��14��
 * @Description: ����
 */
public class TestMainEnter {

	public static void main(String[] args) {
		// ���Ի�������
		BasicFuncComputer bfComputer = new BasicFuncComputer();
		bfComputer.work();
		System.out.println("-----------");
		// �������ܻ����ϣ���̬װ�ι���A
		ComputerDecorator conA = new ConcreteDecoratorA(bfComputer);
		conA.work();
		System.out.println("-----------");
		// �������ܻ����ϣ���̬װ�ι���B
		ComputerDecorator conB = new ConcreteDecoratorB(bfComputer);
		conB.work();
		System.out.println("-----------");
		// �������ܼ�װ��A��Ҳװ��B
		ComputerDecorator conC = new ConcreteDecoratorB(new ConcreteDecoratorA(new BasicFuncComputer()));
		conC.work();
		
		// ��ӦsetComputerʵ��
		// ���Ի�������
		/*BasicFuncComputer bfComputer = new BasicFuncComputer();
		bfComputer.work();
		System.out.println("-----------");
		// �������ܻ����ϣ���̬װ�ι���A
		ComputerDecorator conA = new ConcreteDecoratorA();
		conA.setComputer(bfComputer);
		conA.work();
		System.out.println("-----------");
		// �������ܻ����ϣ���̬װ�ι���B
		ComputerDecorator conB = new ConcreteDecoratorB();
		conB.setComputer(bfComputer);
		conB.work();
		System.out.println("-----------");
		// �������ܼ�װ��A��Ҳװ��B
		ComputerDecorator conC = new ConcreteDecoratorB();
		conC.setComputer(conA);
		conC.work();*/
	}

}
