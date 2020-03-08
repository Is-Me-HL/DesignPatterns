package h.l.demo.factorymethod;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月15日
 * @Description: 抽象工厂或接口工厂
 */
public abstract class SuperFactoryOrFactoryInterface {
	// 此处以抽象类为例，接口方式类似
	// 获取实例
	public abstract SuperClassOrInterface getInstance();
}
