package h.l.demo.builder;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020Äê2ÔÂ14ÈÕ
 * @Description: ²âÊÔ
 */
public class TestMainEnter {

	public static void main(String[] args) {
		Director director = new Director();
		ConcreteBuilder1 concreteBuilder1 = new ConcreteBuilder1();
		director.Construct(concreteBuilder1);
		Product p1 = concreteBuilder1.getProduct();
		p1.show();
		System.out.println("---------------------");
		ConcreteBuilder2 concreteBuilder2 = new ConcreteBuilder2();
		director.Construct(concreteBuilder2);
		Product p2 = concreteBuilder2.getProduct();
		p2.show();
		
	}

}
