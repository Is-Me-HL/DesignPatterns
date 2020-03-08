package h.l.demo.flyweight;

import java.util.HashMap;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��3��8��
 * @Description: �������о�����Ԫ��ĳ�����߽ӿڣ�ͨ������ӿڣ�FlyWeight���Խ��ղ��������ⲿ״̬
 */
public abstract class FlyWeight {
	/**
	 * @param extrinsicState
	 *            �ⲿ״̬
	 */
	public abstract void operation(int extrinsicState);
}

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��3��8��
 * @Description: ������Ԫ��
 */
class ConcreteFlyWeight extends FlyWeight {

	@Override
	public void operation(int extrinsicState) {
		System.out.println("����FlyWeight��" + extrinsicState);
	}

}

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��3��8��
 * @Description: ������ľ�����Ԫ��
 */
class UnSharedConcreteFlyWeight extends FlyWeight {

	@Override
	public void operation(int extrinsicState) {
		System.out.println("������ľ���FlyWeight��" + extrinsicState);
	}

}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��3��8��
 * @Description: ��Ԫ���������������͹���FlyWeight���ܷ�������Ҫ����ʱ����ȷ������Ĺ���FlyWeight
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