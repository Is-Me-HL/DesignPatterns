package h.l.demo.templatemethod;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��3��
 * @Description: ����
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
