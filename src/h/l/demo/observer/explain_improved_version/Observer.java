package h.l.demo.observer.explain_improved_version;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Observer {

	// ������/�۲���
	private Object object;
	// ������/�۲��� �����õķ�����
	private String methodName;
	// ������/�۲��߷������õĲ���
	private Object[] args;
	// �������ô����������ÿ��������Ӧ����������
	private Class<?>[] argsTypes;

	public Observer(Object object, String methodName, Object... args) {
		this.object = object;
		this.methodName = methodName;
		this.args = args;
		if (this.args != null) {
			getArgsTypes(this.args);
		}
	}

	private void getArgsTypes(Object[] args) {
		this.argsTypes = new Class[args.length + 1];
		this.argsTypes[0] = new Object().getClass();
		for (int i = 1; i <= args.length; i++) {
			this.argsTypes[i] = args[i - 1].getClass();
		}
	}

	public void invoke(Object publishContext) throws NoSuchMethodException,
			SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		// �жϷ����Ƿ����
		Method method = this.object.getClass().getMethod(this.methodName,
				this.argsTypes);
		// ִ�з���
		Object[] newObjectArr = new Object[this.args.length + 1];
		newObjectArr[0] = publishContext;
		for (int i = 1; i <= this.args.length; i++) {
			newObjectArr[i] = this.args[i - 1];
		}
		method.invoke(this.object, newObjectArr);
	}
}

class Observer1 {
	public void observer1Update(Object publishContext, String arg) {
		System.out.println("SubjectContext:" + publishContext + ";"
				+ this.getClass().getName() + ";������Ϣ��" + arg);
	}

}

class Observer2 {
	public void observer2Update(Object publishContext, String arg) {
		System.out.println("SubjectContext:" + publishContext + ";"
				+ this.getClass().getName() + ";������Ϣ��" + arg);
	}

}