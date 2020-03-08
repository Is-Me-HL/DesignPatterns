package h.l.demo.factorymethod;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年1月31日
 * @Description: 子类1：继承或实现
 */
/*public class SubClassOrImplClass1 extends SuperClassOrInterface {

	*//**
	 * 实现抽象方法
	 *//*
	@Override
	public void doSomeThings() {
		// TODO Auto-generated method stub
		System.out.println("SubClassOrImplClass1：doSomeThings...");
	}
	*//**
	 * 子类重写父类方法
	 * @Override 可以校验该方法是不是在父类（超类）中存在
	 *//*
	@Override
	public void doThings(){
		System.out.println("SubClassOrImplClass1：doThings...");
	}
}*/
public class SubClassOrImplClass1 implements SuperClassOrInterface {

	/**
	 * 实现接口中指定的行为
	 */
	@Override
	public void doSomeThings() {
		// TODO Auto-generated method stub
		System.out.println("SubClassOrImplClass1：doSomeThings...");
	}
}
