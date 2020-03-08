package h.l.demo.observer.explain;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月25日
 * @Description: 主题类/抽象通知者、发布者
 */
public class Subject {
	// 订阅者集合
	private List<Observer> observes = new ArrayList<>();

	// 添加订阅者
	public void addObserve(Observer observer) {
		observes.add(observer);
	}

	// 移除订阅者
	public void removeObserver(Observer observer) {
		observes.remove(observer);
	}

	// 通知所有的订阅者，即发布消息
	public void notifyObservers(Object arg) {
		for (Observer observer : observes) {
			observer.update(this,arg);
		}
	}
}
