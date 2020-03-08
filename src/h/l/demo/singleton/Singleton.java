package h.l.demo.singleton;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年3月7日
 * @Description: 单例模式测试类
 */
public class Singleton {

	public static void main(String[] args) {
		Instance instance = Instance.getInstance();
		Instance instance2 = Instance.getInstance();
		System.out.println("instance == instance2 result :"
				+ (instance == instance2));

		Instance3 instance3 = Instance3.getInstance3();
		Instance3 instance4 = Instance3.getInstance3();
		System.out.println("instance3 == instance4 result :"
				+ (instance3 == instance4));
	}
}

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年3月3日
 * @Description: 单例模式：重要一点是构造函数私有，即无法通过new的方式创建对象实例，对外提供唯一的类方法供调用者访问
 * 
 *               懒汉式，指的是当需要获取该实例时才去判断实例是否存在，不存在再创建。
 *               饿汉式：指的是一开始我就给实例化好，需要的时候我就直接给你。
 * 
 *               两者比较各有优缺点：饿汉式一开始就实例，占内存，不如懒汉式中等需要时再创建对象的好。但懒汉式也存在问题，获取实例对象的时候
 *               如果在多线程环境中
 *               ，可能存在线程安全，准确说可能多个线程同时都去获取了实例，发现没有该实例，又同时去创建了一个实例，这样就不是单例
 *               的了，需要使用双层锁定的方式才能避免，这相对于饿汉式多了这些步骤。
 */
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年3月4日
 * @Description: 单例模式-懒汉式-单线程环境
 */
class Instance {
	private static Instance instance;

	// 将构造函数私有，不允许通过new的方式创建对象
	private Instance() {
	}

	public static Instance getInstance() {
		if (instance == null) {
			instance = new Instance();
		}
		return instance;
	}
}

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年3月4日
 * @Description: 单例模式-懒汉式-多线程环境
 */
class Instance2 {
	private volatile static Instance2 instance2;

	// 创建一个锁对象
	private static Object obj = new Object();

	// 将构造函数私有，不允许通过new的方式创建对象
	private Instance2() {
	}

	public static Instance2 getInstance2() {
		if (instance2 == null) {
			synchronized (obj) {
				if (instance2 == null) {
					instance2 = new Instance2();
				}
			}

		}
		return instance2;
	}
}

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年3月4日
 * @Description: 单例模式-饿汉式
 */
class Instance3 {
	private static Instance3 instance3 = new Instance3();

	// 将构造函数私有，不允许通过new的方式创建对象
	private Instance3() {
	}

	public static Instance3 getInstance3() {
		return instance3;
	}
}