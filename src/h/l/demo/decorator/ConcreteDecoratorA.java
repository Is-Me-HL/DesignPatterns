package h.l.demo.decorator;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��14��
 * @Description: �����װ����A����дװ�ε�����
 */
public class ConcreteDecoratorA extends ComputerDecorator {
	public ConcreteDecoratorA(Computer computer) {
		super(computer);
	}

	@Override
	public void work(){
		super.work();
		System.out.println("�Ҹ�Computerװ����A����");
	}
	
	// ��Ӧ�����setComputer��ʽʵ��

	/*@Override
	public void work(){
		super.work();
		System.out.println("�Ҹ�Computerװ����A����");
	}*/
}
