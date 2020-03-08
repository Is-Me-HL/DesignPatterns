package h.l.demo.strategy;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��3��
 * @Description: �򵥹����Ͳ���ģʽ�Ľ�� Context��������
 */
public class Context {
	SuperClassOrInterface si = null;
	/**
	 * ͨ��������ȡʵ��
	 * @param subType ������
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
