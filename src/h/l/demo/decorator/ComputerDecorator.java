package h.l.demo.decorator;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��14��
 * @Description: װ����
 */
public class ComputerDecorator implements Computer {

	/**
	 * ComputerDecorator���췽���ǹؼ�����Ȼ����Ҳ�����ֶ�дsetComputer������
	 * ֻ������Ӧ�ĵط���Ҫ���ʵ��޸�
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
	
	// setComputer��ʽʵ��
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
