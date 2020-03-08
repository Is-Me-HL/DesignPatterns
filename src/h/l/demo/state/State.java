package h.l.demo.state;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月29日
 * @Description: 抽象状态类
 */
public abstract class State {
	// 处理行为
	public abstract void handle(Context context); 
}
