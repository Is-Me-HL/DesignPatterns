package h.l.demo.decorator;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月14日
 * @Description: 装饰类
 */
public class ComputerDecorator implements Computer {

	/**
	 * ComputerDecorator构造方法是关键，当然这里也可以手动写setComputer方法，
	 * 只不过相应的地方需要做适当修改
	 */
	private Computer computer;

	public ComputerDecorator(Computer computer) {
		this.computer = computer;
	}
	
	@Override
	public void work() {
		if (this.computer != null) {
			this.computer.work();
		}
	}
	
	// setComputer方式实现
	/*private Computer computer;

	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	@Override
	public void work() {
		if (this.computer != null) {
			this.computer.work();
		}
	}*/
}
