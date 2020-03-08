package h.l.demo.factorymethod;

public class SubFactoryOrFactoryImpl2 extends SuperFactoryOrFactoryInterface {

	@Override
	public SuperClassOrInterface getInstance() {
		// TODO Auto-generated method stub
		System.out.println("具体工厂2实例化-->具体对象2...");
		return new SubClassOrImplClass2();
	}

}
