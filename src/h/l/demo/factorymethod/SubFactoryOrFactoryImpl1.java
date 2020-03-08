package h.l.demo.factorymethod;

public class SubFactoryOrFactoryImpl1 extends SuperFactoryOrFactoryInterface {

	@Override
	public SuperClassOrInterface getInstance() {
		// TODO Auto-generated method stub
		System.out.println("具体工厂1实例化-->具体对象1...");
		return new SubClassOrImplClass1();
	}

}
