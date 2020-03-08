package h.l.demo.facade;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月23日
 * @Description: 外观类：需要了解所有子系统的方法或属性，进行组合以备外界调用
 */
public class FacadeClass {
	// 子系统一
	SubSystemOne subSystemOne;
	// 子系统二
	SubSystemTwo subSystemTwo;
	// 子系统三
	SubSystemThree subSystemThree;
	// 子系统四
	SubSystemFour subSystemFour;
	
	public FacadeClass(){
		subSystemOne = new SubSystemOne();
		subSystemTwo = new SubSystemTwo();
		subSystemThree = new SubSystemThree();
		subSystemFour = new SubSystemFour();
	}
	
	// 外界调用接口一
	public void methodA(){
		System.out.println("方法组A():");
		subSystemOne.methodOne();
		subSystemTwo.methodTwo();
	}
	// 外界调用接口二
	public void methodB(){
		System.out.println("方法组B():");
		subSystemThree.methodThree();
		subSystemFour.methodFour();
	}
	
	public static void main(String[] args) {
		new FacadeClass().methodA();
		System.out.println("----------------------");
		new FacadeClass().methodB();
	}

}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月23日
 * @Description: 子系统一
 */
class SubSystemOne{
	public void methodOne(){
		System.out.println("子系统方法一");
	}
}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月23日
 * @Description: 子系统二
 */
class SubSystemTwo{
	public void methodTwo(){
		System.out.println("子系统方法二");
	}
}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月23日
 * @Description: 子系统三
 */
class SubSystemThree{
	public void methodThree(){
		System.out.println("子系统方法三");
	}
}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月23日
 * @Description: 子系统四
 */
class SubSystemFour{
	public void methodFour(){
		System.out.println("子系统方法四");
	}
}