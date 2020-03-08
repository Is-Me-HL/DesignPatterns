package h.l.demo.flyweight;

import java.util.HashMap;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年3月8日
 * @Description: 它是所有具体享元类的超类或者接口，通过这个接口，FlyWeight可以接收并作用于外部状态
 */
public abstract class FlyWeight {
	/**
	 * @param extrinsicState
	 *            外部状态
	 */
	public abstract void operation(int extrinsicState);
}

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年3月8日
 * @Description: 具体享元类
 */
class ConcreteFlyWeight extends FlyWeight {

	@Override
	public void operation(int extrinsicState) {
		System.out.println("具体FlyWeight：" + extrinsicState);
	}

}

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年3月8日
 * @Description: 不共享的具体享元类
 */
class UnSharedConcreteFlyWeight extends FlyWeight {

	@Override
	public void operation(int extrinsicState) {
		System.out.println("不共享的具体FlyWeight：" + extrinsicState);
	}

}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年3月8日
 * @Description: 享元工厂：用来创建和管理FlyWeight对宪法，它主要作用时用来确保合理的共享FlyWeight
 */
class FlyWeightFactory {
	private HashMap<String, FlyWeight> map = new HashMap<>();

	public FlyWeightFactory(){
		map.put("X", new ConcreteFlyWeight());
		map.put("Y", new ConcreteFlyWeight());
		map.put("Z", new ConcreteFlyWeight());
	}
	public FlyWeight getFlyWeight(String key){
		if(map.get(key) == null){
			map.put(key, new ConcreteFlyWeight());
		}
		return map.get(key);
	}
}