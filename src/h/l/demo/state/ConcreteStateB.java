package h.l.demo.state;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��29��
 * @Description: ����ʵ����		����״̬
 */
public class ConcreteStateB extends State {

	@Override
	public void handle(Context context) {
		context.setState(new ConcreteStateA());
	}

}
