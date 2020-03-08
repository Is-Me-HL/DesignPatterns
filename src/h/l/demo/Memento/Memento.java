package h.l.demo.Memento;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年3月1日
 * @Description: 备忘录模式Demo
 */
public class Memento {

	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setStateA("内部状态A");
		originator.setStateB("内部状态B");

		System.out.println("当前对象内部状态：" + originator);

		// 对当前状态进行备份
		MementoClass mementoClass = originator.createMementoClass();

		// 改变当前状态
		originator.setStateA("内部状态AA");
		originator.setStateB("内部状态BB");

		// 当前状态
		System.out.println("修改当前状态：" + originator);

		// 对当前状态进行还原
		originator.revert(mementoClass);

		// 还原后的状态
		System.out.println("还原后状态：" + originator);

	}
}

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年3月1日
 * @Description: 发起人，负责创建一个备忘录Memento，用于记录当前时刻它的状态，并可使用备忘录模式恢复状态
 *               该类可以决定Memento备忘录对象存放哪些内部状态信息
 */
class Originator {
	// 内部状态A
	private String stateA;
	// 内部状态B
	private String stateB;

	// 创建一个当前时刻副本
	public MementoClass createMementoClass() {
		return new MementoClass(stateA, stateB);
	}

	// 恢复指定副本
	public void revert(MementoClass mementoClass) {
		this.stateA = mementoClass.getStateA();
		this.stateB = mementoClass.getStateB();
	}

	public void setStateA(String stateA) {
		this.stateA = stateA;
	}

	public void setStateB(String stateB) {
		this.stateB = stateB;
	}

	@Override
	public String toString() {
		return "Originator [stateA=" + stateA + ", stateB=" + stateB + "]";
	}

}

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年3月1日
 * @Description: 备忘录：可以保存一些想要保存的信息
 */
class MementoClass {
	// 保存状态A
	private String stateA;
	// 保存状态B
	private String stateB;

	public MementoClass(String stateA, String stateB) {
		this.stateA = stateA;
		this.stateB = stateB;
	}

	@Override
	public String toString() {
		return "MementoClass [stateA=" + stateA + ", stateB=" + stateB + "]";
	}

	public String getStateA() {
		return stateA;
	}

	public String getStateB() {
		return stateB;
	}

}
