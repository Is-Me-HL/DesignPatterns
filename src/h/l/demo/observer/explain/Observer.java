package h.l.demo.observer.explain;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��25��
 * @Description: ����۲���
 */
public abstract class Observer {
	public abstract void update(Subject subject, Object arg);
}

class Observer1 extends Observer {

	@Override
	public void update(Subject subject, Object arg) {
		System.out.println(this.getClass().getName()+"�������ߣ�" + subject + ";������Ϣ��" + arg);
	}

}
class Observer2 extends Observer {

	@Override
	public void update(Subject subject, Object arg) {
		System.out.println(this.getClass().getName()+"�������ߣ�" + subject + ";������Ϣ��" + arg);
	}

}