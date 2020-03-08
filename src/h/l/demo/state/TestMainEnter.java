package h.l.demo.state;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020Äê1ÔÂ31ÈÕ
 * @Description: ²âÊÔ
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
