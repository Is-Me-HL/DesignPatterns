package h.l.demo.Memento;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��3��1��
 * @Description: ����¼ģʽDemo
 */
public class Memento {

	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setStateA("�ڲ�״̬A");
		originator.setStateB("�ڲ�״̬B");

		System.out.println("��ǰ�����ڲ�״̬��" + originator);

		// �Ե�ǰ״̬���б���
		MementoClass mementoClass = originator.createMementoClass();

		// �ı䵱ǰ״̬
		originator.setStateA("�ڲ�״̬AA");
		originator.setStateB("�ڲ�״̬BB");

		// ��ǰ״̬
		System.out.println("�޸ĵ�ǰ״̬��" + originator);

		// �Ե�ǰ״̬���л�ԭ
		originator.revert(mementoClass);

		// ��ԭ���״̬
		System.out.println("��ԭ��״̬��" + originator);

	}
}

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��3��1��
 * @Description: �����ˣ����𴴽�һ������¼Memento�����ڼ�¼��ǰʱ������״̬������ʹ�ñ���¼ģʽ�ָ�״̬
 *               ������Ծ���Memento����¼��������Щ�ڲ�״̬��Ϣ
 */
class Originator {
	// �ڲ�״̬A
	private String stateA;
	// �ڲ�״̬B
	private String stateB;

	// ����һ����ǰʱ�̸���
	public MementoClass createMementoClass() {
		return new MementoClass(stateA, stateB);
	}

	// �ָ�ָ������
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
 * @date: 2020��3��1��
 * @Description: ����¼�����Ա���һЩ��Ҫ�������Ϣ
 */
class MementoClass {
	// ����״̬A
	private String stateA;
	// ����״̬B
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
