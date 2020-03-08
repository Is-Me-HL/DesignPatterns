package h.l.demo.observer.explain;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020Äê1ÔÂ31ÈÕ
 * @Description: ²âÊÔ
 */
public class TestMainEnter {

	public static void main(String[] args) {
		Subject subject = new Subject();
		subject.addObserve(new Observer1());
		subject.addObserve(new Observer2());

		subject.notifyObservers(null);
		System.out.println("-----------------");
		subject.notifyObservers("Is-Me-HL,Fighting!!!");
	}

}
