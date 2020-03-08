package h.l.demo.simplefactory;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020ƒÍ1‘¬31»’
 * @Description: ≤‚ ‘
 */
public class TestMainEnter {

	public static void main(String[] args) {
		SuperClassOrInterface si = SimpleFactory.getInstance("SubClassOrImplClass1");
		si.doSomeThings();
		// si.doThings();
		System.out.println("-----------------------");
		si = SimpleFactory.getInstance("SubClassOrImplClass2");
		si.doSomeThings();
		// si.doThings();
	}

}
