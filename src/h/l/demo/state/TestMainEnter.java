package h.l.demo.state;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��1��31��
 * @Description: ����
 */
public class TestMainEnter {

	public static void main(String[] args) {
		Context context =new Context();
		context.setState(new ConcreteStateA());
		context.request();
		context.request();
		context.request();
		context.request();
		context.request();
		context.request();
		context.request();
	}

}
