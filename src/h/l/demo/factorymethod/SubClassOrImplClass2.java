package h.l.demo.factorymethod;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��1��31��
 * @Description: ����2���̳л�ʵ��
 */
/*public class SubClassOrImplClass2 extends SuperClassOrInterface {
	*//**
	 * ʵ�ֳ��󷽷�
	 *//*
	@Override
	public void doSomeThings() {
		// TODO Auto-generated method stub
		System.out.println("SubClassOrImplClass2��doSomeThings...");
	}
	*//**
	 * ������д���෽��
	 * @Override ����У��÷����ǲ����ڸ��ࣨ���ࣩ�д���
	 *//*
	@Override
	public void doThings(){
		System.out.println("SubClassOrImplClass2��doThings...");
	}
}*/
public class SubClassOrImplClass2 implements SuperClassOrInterface {

	/**
	 * ʵ�ֽӿ���ָ������Ϊ
	 */
	@Override
	public void doSomeThings() {
		// TODO Auto-generated method stub
		System.out.println("SubClassOrImplClass2��doSomeThings...");
	}
}
