package h.l.demo.observer.explain;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月25日
 * @Description: 抽象观察者
 */
public abstract class Observer {
	public abstract void update(Subject subject, Object arg);
}

class Observer1 extends Observer {

	@Override
	public void update(Subject subject, Object arg) {
		System.out.println(this.getClass().getName()+"：发布者：" + subject + ";发布消息：" + arg);
	}

}
class Observer2 extends Observer {

	@Override
	public void update(Subject subject, Object arg) {
		System.out.println(this.getClass().getName()+"：发布者：" + subject + ";发布消息：" + arg);
	}

}