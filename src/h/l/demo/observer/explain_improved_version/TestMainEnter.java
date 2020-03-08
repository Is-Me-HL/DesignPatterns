package h.l.demo.observer.explain_improved_version;

import java.lang.reflect.InvocationTargetException;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年1月31日
 * @Description: 测试
 */
public class TestMainEnter {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Subject subject = new Subject();
		subject.addObserve(new Observer(new Observer1(), "observer1Update", "hello,observer1Update"));
		subject.addObserve(new Observer(new Observer2(), "observer2Update", "hello,observer2Update"));
		subject.notifyObservers("I am subject，是我给你们发布的通知");
		System.out.println("---------------");
		subject.notifyObservers(null);
		System.out.println("---------------");
		Subject subject2 = new Subject();
		subject2.addObserve(new Observer(new Observer1(), "observer1Update", ""));
		subject2.addObserve(new Observer(new Observer2(), "observer2Update", ""));
		subject2.notifyObservers(null);
	}
}
