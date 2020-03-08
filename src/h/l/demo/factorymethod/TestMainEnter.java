package h.l.demo.factorymethod;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020ƒÍ1‘¬31»’
 * @Description: ≤‚ ‘
 */
public class TestMainEnter {

	public static void main(String[] args) {
		SuperFactoryOrFactoryInterface superFactory = new SubFactoryOrFactoryImpl1();
		superFactory.getInstance().doSomeThings();
		System.out.println("---------------------");
		superFactory = new SubFactoryOrFactoryImpl2();
		superFactory.getInstance().doSomeThings();
	}

}
