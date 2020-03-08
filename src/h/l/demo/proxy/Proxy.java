package h.l.demo.proxy;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��15��
 * @Description: ������
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
