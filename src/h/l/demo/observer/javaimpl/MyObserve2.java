package h.l.demo.observer.javaimpl;

import java.util.Observable;
import java.util.Observer;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��25��
 * @Description: �۲���ģʽҲ��Ϊ����������ģʽ�����۲�����2���൱�ڡ�����-���ġ�˵���еĶ�����
 */
public class MyObserve2 implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("�۲���󣨶��Ķ���" + this.getClass().getName() + ";");
		System.out.println("���۲���󣨷�������Ϊ����" + o + "�����ݵĲ���Ϊ��" + arg);
	}

}
