package h.l.demo.observer.javaimpl;

import java.util.Observable;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��25��
 * @Description: ���۲���/������
 */
public class MyObservable extends Observable {

	public static void main(String[] args) {
		MyObservable myObservable = new MyObservable();
		myObservable.addObserver(new MyObserve1());
		myObservable.addObserver(new MyObserve2());
		
		// ������Ϣ
		myObservable.setChanged();
		myObservable.notifyObservers();
		
		// ��������������Ϣ
		myObservable.setChanged();
		myObservable.notifyObservers("���Ƿ����ߣ�������֪ͨ����");
		
	}

}
