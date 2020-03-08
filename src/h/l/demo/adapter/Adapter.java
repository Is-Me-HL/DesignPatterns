package h.l.demo.adapter;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��3��1��
 * @Description: ������ģʽDemo
 */
public class Adapter {

	public static void main(String[] args) {
		// ǰ��
		Player fp = new Forwards("�͵ٶ�");
		fp.attack();
		fp.defense();
		
		// ����
		Player gp = new Guards("��˸��׵�");
		gp.attack();
		gp.defense();
		
		// �з棺����Ӣ�İ��
		/*Player cp = new Center("Ҧ��");
		cp.attack();
		cp.defense();*/
		
		Player cp = new LanguageTranslator("Ҧ��");
		cp.attack();
		cp.defense();
	}
}

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��3��1��
 * @Description: �˶�Ա������
 */
abstract class Player {
	// �˶�Ա����
	protected String name;

	public Player(String name) {
		this.name = name;
	}

	// ����
	public abstract void attack();

	// ����
	public abstract void defense();
}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��3��1��
 * @Description: ǰ���˶�Ա
 */
class Forwards extends Player {

	public Forwards(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("ǰ�桾" + super.name + "������");

	}

	@Override
	public void defense() {
		System.out.println("ǰ�桾" + super.name + "������");
	}

}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��3��1��
 * @Description: �з��˶�Ա
 */
class Center extends Player {

	public Center(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("�з桾" + super.name + "������");

	}

	@Override
	public void defense() {
		System.out.println("�з桾" + super.name + "������");
	}

}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��3��1��
 * @Description: �����˶�Ա
 */
class Guards extends Player {

	public Guards(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("������" + super.name + "������");

	}

	@Override
	public void defense() {
		System.out.println("������" + super.name + "������");
	}

}

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��3��1��
 * @Description: �⼮�з�
 */
class ForeignCenter{
	
	public void ����(String name) {
		System.out.println("�⼮�з桾" + name + "������");
	}

	public void ����(String name) {
		System.out.println("�⼮�з桾" + name + "������");
	}
	
}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��3��1��
 * @Description: ���룺������
 */
class LanguageTranslator extends Player {
	
	private ForeignCenter fc = new ForeignCenter();

	public LanguageTranslator(String name) {
		super(name);
	}

	@Override
	public void attack() {
		fc.����(super.name);

	}

	@Override
	public void defense() {
		fc.����(super.name);
	}

}