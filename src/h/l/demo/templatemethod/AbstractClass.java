package h.l.demo.templatemethod;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��23��
 * @Description: ������
 */
public abstract class AbstractClass {
	public abstract void operation1();
	public abstract void operation2();
	
	public void TemplateMethod(){
		operation1();
		operation2();
		System.out.println("AbstractClass TemplateMethod...");
	}
}
