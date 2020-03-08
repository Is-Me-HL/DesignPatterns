package h.l.demo.observer.explain_improved_version;

import java.lang.reflect.InvocationTargetException;
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
	public void notifyObservers(Object arg) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		for (Observer observer : observes) {
			observer.invoke(arg);
		}
	}
}
