package h.l.demo.factorymethod;

public class SubFactoryOrFactoryImpl2 extends SuperFactoryOrFactoryInterface {

	@Override
	public SuperClassOrInterface getInstance() {
		// TODO Auto-generated method stub
		System.out.println("���幤��2ʵ����-->�������2...");
		return new SubClassOrImplClass2();
	}

}
