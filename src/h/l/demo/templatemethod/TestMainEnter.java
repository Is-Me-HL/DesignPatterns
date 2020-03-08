package h.l.demo.templatemethod;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020Äê2ÔÂ3ÈÕ
 * @Description: ²âÊÔ
 */
public class TestMainEnter {

	public static void main(String[] args) {
		AbstractClass abstractClass = new ConcreteClassA();
		abstractClass.TemplateMethod();
		System.out.println("-------------------------");
		abstractClass = new ConcreteClassB();
		abstractClass.TemplateMethod();
	}

}
