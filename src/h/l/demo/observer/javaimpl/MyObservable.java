package h.l.demo.observer.javaimpl;

import java.util.Observable;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月25日
 * @Description: 被观察者/发布者
 */
public class MyObservable extends Observable {

	public static void main(String[] args) {
		MyObservable myObservable = new MyObservable();
		myObservable.addObserver(new MyObserve1());
		myObservable.addObserver(new MyObserve2());
		
		// 发布消息
		myObservable.setChanged();
		myObservable.notifyObservers();
		
		// 发布带参数的消息
		myObservable.setChanged();
		myObservable.notifyObservers("我是发布者，我现在通知你们");
		
	}

}
