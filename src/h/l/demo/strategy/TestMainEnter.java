package h.l.demo.strategy;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020ƒÍ2‘¬3»’
 * @Description: ≤‚ ‘
 */
public class TestMainEnter {

	public static void main(String[] args) {
		Context context = new Context("SubClassOrImplClass1");
		context.doSomeThings();
		System.out.println("-----------------------");
		context = new Context("SubClassOrImplClass2");
		context.doSomeThings();
	}

}
