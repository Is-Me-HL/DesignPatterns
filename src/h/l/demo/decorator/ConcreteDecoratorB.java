package h.l.demo.decorator;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��14��
 * @Description: �����װ����B����дװ�ε�����
 */
public class ConcreteDecoratorB extends ComputerDecorator {
	public ConcreteDecoratorB(Computer computer) {
		super(computer);
	}

	@Override
	public void work(){
		super.work();
		System.out.println("�Ҹ�Computerװ����B����");
	}
	
	// ��Ӧ�����setComputer��ʽʵ��

	/*@Override
	public void work(){
		super.work();
		System.out.println("�Ҹ�Computerװ����B����");
	}*/
}
