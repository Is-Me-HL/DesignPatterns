package h.l.demo.simplefactory;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��1��31��
 * @Description: ������
 */
public class SimpleFactory {
	/**
	 * ͨ��������ȡʵ��
	 * @param subType ������
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
