package h.l.demo.proxy;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月15日
 * @Description: 被代理的类，实现了公共的接口
 */
public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("被代理类的行为...");
	}

}
