package h.l.demo.state;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月29日
 * @Description: 维护一个ConcreteState子类的实例，这个实例定义当前的状态
 */
public class Context {

	private State state;
	public void setState(State state) {
		this.state = state;
		System.out.println("当前state来自：" + state.getClass().getName());
	}
	
	public void request(){
		state.handle(this);
	}
}