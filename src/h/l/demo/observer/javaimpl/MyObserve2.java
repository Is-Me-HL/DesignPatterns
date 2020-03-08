package h.l.demo.observer.javaimpl;

import java.util.Observable;
import java.util.Observer;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月25日
 * @Description: 观察者模式也称为“发布订阅模式”。观察者类2：相当于“发布-订阅”说法中的订阅者
 */
public class MyObserve2 implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("观察对象（订阅对象）" + this.getClass().getName() + ";");
		System.out.println("被观察对象（发布对象为）：" + o + "，传递的参数为：" + arg);
	}

}
