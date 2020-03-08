package h.l.demo.observer.explain;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��25��
 * @Description: ������/����֪ͨ�ߡ�������
 */
public class Subject {
	// �����߼���
	private List<Observer> observes = new ArrayList<>();

	// ��Ӷ�����
	public void addObserve(Observer observer) {
		observes.add(observer);
	}

	// �Ƴ�������
	public void removeObserver(Observer observer) {
		observes.remove(observer);
	}

	// ֪ͨ���еĶ����ߣ���������Ϣ
	public void notifyObservers(Object arg) {
		for (Observer observer : observes) {
			observer.update(this,arg);
		}
	}
}
