package h.l.demo.factorymethod;

public class SubFactoryOrFactoryImpl1 extends SuperFactoryOrFactoryInterface {

	@Override
	public SuperClassOrInterface getInstance() {
		// TODO Auto-generated method stub
		System.out.println("���幤��1ʵ����-->�������1...");
		return new SubClassOrImplClass1();
	}

}
