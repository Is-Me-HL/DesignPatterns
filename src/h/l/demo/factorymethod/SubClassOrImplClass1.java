package h.l.demo.factorymethod;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��1��31��
 * @Description: ����1���̳л�ʵ��
 */
/*public class SubClassOrImplClass1 extends SuperClassOrInterface {

	*//**
	 * ʵ�ֳ��󷽷�
	 *//*
	@Override
	public void doSomeThings() {
		// TODO Auto-generated method stub
		System.out.println("SubClassOrImplClass1��doSomeThings...");
	}
	*//**
	 * ������д���෽��
	 * @Override ����У��÷����ǲ����ڸ��ࣨ���ࣩ�д���
	 *//*
	@Override
	public void doThings(){
		System.out.println("SubClassOrImplClass1��doThings...");
	}
}*/
public class SubClassOrImplClass1 implements SuperClassOrInterface {

	/**
	 * ʵ�ֽӿ���ָ������Ϊ
	 */
	@Override
	public void doSomeThings() {
		// TODO Auto-generated method stub
		System.out.println("SubClassOrImplClass1��doSomeThings...");
	}
}
