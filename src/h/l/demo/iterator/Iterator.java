package h.l.demo.iterator;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��3��6��
 * @Description: ������ģʽ
 */
public class Iterator {
	public static void main(String[] args) {
		MyCollection myCollection = new MyCollection(10);
		myCollection.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:dd")
				.format(new Date()));
		myCollection.add(new Integer(1503));
		myCollection.add("�Զ��������");

		MyIterator iterator = myCollection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("------------------------------");

		List<Object> systemCollection = new ArrayList<>(10);
		systemCollection.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:dd")
				.format(new Date()));
		systemCollection.add(new Integer(1503));
		systemCollection.add("ϵͳ������");

		java.util.Iterator<Object> listIterator = systemCollection.iterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	}
}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��3��7��
 * @Description: �Զ���������ӿ�
 */
interface MyIterator {

	public abstract boolean hasNext();

	public abstract Object next();
}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��3��7��
 * @Description: ���������
 */
class ConcreteIterator implements MyIterator {

	private int current;

	private MyCollection myCollection;

	public ConcreteIterator(MyCollection myCollection) {
		this.myCollection = myCollection;
	}

	@Override
	public boolean hasNext() {
		return current < myCollection.size();
	}

	@Override
	public Object next() {
		return myCollection.get(current++);
	}
}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��3��7��
 * @Description: �Զ��弯��
 */
class MyCollection {

	private int last = 0;

	private Object[] obj;

	public MyCollection(int size) {
		this.obj = new Object[size];
	}

	public void add(Object object) {
		this.obj[last++] = object;
	}

	public Object get(int index) {
		return this.obj[index];
	}

	public int size() {
		return last;
	}

	public ConcreteIterator iterator() {
		return new ConcreteIterator(this);
	}
}