package h.l.demo.state;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月29日
 * @Description: 具体实现类		具体状态
 */
public class ConcreteStateB extends State {

	@Override
	public void handle(Context context) {
		context.setState(new ConcreteStateA());
	}

}
