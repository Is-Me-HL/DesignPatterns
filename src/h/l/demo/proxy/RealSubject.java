package h.l.demo.proxy;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��15��
 * @Description: ��������࣬ʵ���˹����Ľӿ�
 */
public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("�����������Ϊ...");
	}

}
