package h.l.demo.state;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��29��
 * @Description: ά��һ��ConcreteState�����ʵ�������ʵ�����嵱ǰ��״̬
 */
public class Context {

	private State state;
	public void setState(State state) {
		this.state = state;
		System.out.println("��ǰstate���ԣ�" + state.getClass().getName());
	}
	
	public void request(){
		state.handle(this);
	}
}