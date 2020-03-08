package h.l.demo.simplefactory;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年1月31日
 * @Description: 工厂类
 */
public class SimpleFactory {
	/**
	 * 通过工厂获取实例
	 * @param subType 子类型
	 * @return
	 */
	public static SuperClassOrInterface getInstance(String subType) {
		SuperClassOrInterface si = null;
		switch (subType) {
		case "SubClassOrImplClass1":
			si = new SubClassOrImplClass1();
			break;
		case "SubClassOrImplClass2":
			si = new SubClassOrImplClass2();
			break;
		}
		return si;
	}
}
