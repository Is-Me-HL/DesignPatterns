package h.l.demo.templatemethod;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月23日
 * @Description: 抽象类
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
