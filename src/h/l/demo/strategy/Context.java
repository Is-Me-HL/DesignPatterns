package h.l.demo.strategy;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月3日
 * @Description: 简单工厂和策略模式的结合 Context上下文类
 */
public class Context {
	SuperClassOrInterface si = null;
	/**
	 * 通过工厂获取实例
	 * @param subType 子类型
	 * @return
	 */
	public Context(String subType) {
		switch (subType) {
		case "SubClassOrImplClass1":
			si = new SubClassOrImplClass1();
			break;
		case "SubClassOrImplClass2":
			si = new SubClassOrImplClass2();
			break;
		}
	}
	
	public void doSomeThings(){
		si.doSomeThings();
	}
}
