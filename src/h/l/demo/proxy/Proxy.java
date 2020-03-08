package h.l.demo.proxy;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月15日
 * @Description: 代理类
 */
public class Proxy implements Subject {

	private RealSubject realSubject;

	@Override
	public void request() {
		if (realSubject == null) {
			realSubject = new RealSubject();
		}
		realSubject.request();
	}

}
