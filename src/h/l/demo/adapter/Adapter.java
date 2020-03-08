package h.l.demo.adapter;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年3月1日
 * @Description: 适配器模式Demo
 */
public class Adapter {

	public static void main(String[] args) {
		// 前锋
		Player fp = new Forwards("巴蒂尔");
		fp.attack();
		fp.defense();
		
		// 后卫
		Player gp = new Guards("麦克格雷迪");
		gp.attack();
		gp.defense();
		
		// 中锋：听到英文版的
		/*Player cp = new Center("姚明");
		cp.attack();
		cp.defense();*/
		
		Player cp = new LanguageTranslator("姚明");
		cp.attack();
		cp.defense();
	}
}

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年3月1日
 * @Description: 运动员抽象类
 */
abstract class Player {
	// 运动员姓名
	protected String name;

	public Player(String name) {
		this.name = name;
	}

	// 进攻
	public abstract void attack();

	// 防御
	public abstract void defense();
}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年3月1日
 * @Description: 前锋运动员
 */
class Forwards extends Player {

	public Forwards(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("前锋【" + super.name + "】进攻");

	}

	@Override
	public void defense() {
		System.out.println("前锋【" + super.name + "】防御");
	}

}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年3月1日
 * @Description: 中锋运动员
 */
class Center extends Player {

	public Center(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("中锋【" + super.name + "】进攻");

	}

	@Override
	public void defense() {
		System.out.println("中锋【" + super.name + "】防御");
	}

}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年3月1日
 * @Description: 后卫运动员
 */
class Guards extends Player {

	public Guards(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("后卫【" + super.name + "】进攻");

	}

	@Override
	public void defense() {
		System.out.println("后卫【" + super.name + "】防御");
	}

}

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年3月1日
 * @Description: 外籍中锋
 */
class ForeignCenter{
	
	public void 进攻(String name) {
		System.out.println("外籍中锋【" + name + "】进攻");
	}

	public void 防御(String name) {
		System.out.println("外籍中锋【" + name + "】防御");
	}
	
}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年3月1日
 * @Description: 翻译：适配类
 */
class LanguageTranslator extends Player {
	
	private ForeignCenter fc = new ForeignCenter();

	public LanguageTranslator(String name) {
		super(name);
	}

	@Override
	public void attack() {
		fc.进攻(super.name);

	}

	@Override
	public void defense() {
		fc.防御(super.name);
	}

}