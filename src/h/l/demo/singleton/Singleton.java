package h.l.demo.singleton;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��3��7��
 * @Description: ����ģʽ������
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
 * @date: 2020��3��3��
 * @Description: ����ģʽ����Ҫһ���ǹ��캯��˽�У����޷�ͨ��new�ķ�ʽ��������ʵ���������ṩΨһ���෽���������߷���
 * 
 *               ����ʽ��ָ���ǵ���Ҫ��ȡ��ʵ��ʱ��ȥ�ж�ʵ���Ƿ���ڣ��������ٴ�����
 *               ����ʽ��ָ����һ��ʼ�Ҿ͸�ʵ�����ã���Ҫ��ʱ���Ҿ�ֱ�Ӹ��㡣
 * 
 *               ���߱Ƚϸ�����ȱ�㣺����ʽһ��ʼ��ʵ����ռ�ڴ棬��������ʽ�е���Ҫʱ�ٴ�������ĺá�������ʽҲ�������⣬��ȡʵ�������ʱ��
 *               ����ڶ��̻߳�����
 *               �����ܴ����̰߳�ȫ��׼ȷ˵���ܶ���߳�ͬʱ��ȥ��ȡ��ʵ��������û�и�ʵ������ͬʱȥ������һ��ʵ���������Ͳ��ǵ���
 *               ���ˣ���Ҫʹ��˫�������ķ�ʽ���ܱ��⣬������ڶ���ʽ������Щ���衣
 */
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��3��4��
 * @Description: ����ģʽ-����ʽ-���̻߳���
 */
class Instance {
	private static Instance instance;

	// �����캯��˽�У�������ͨ��new�ķ�ʽ��������
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
 * @date: 2020��3��4��
 * @Description: ����ģʽ-����ʽ-���̻߳���
 */
class Instance2 {
	private volatile static Instance2 instance2;

	// ����һ��������
	private static Object obj = new Object();

	// �����캯��˽�У�������ͨ��new�ķ�ʽ��������
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
 * @date: 2020��3��4��
 * @Description: ����ģʽ-����ʽ
 */
class Instance3 {
	private static Instance3 instance3 = new Instance3();

	// �����캯��˽�У�������ͨ��new�ķ�ʽ��������
	private Instance3() {
	}

	public static Instance3 getInstance3() {
		return instance3;
	}
}