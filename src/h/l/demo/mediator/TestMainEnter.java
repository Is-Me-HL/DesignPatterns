package h.l.demo.mediator;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020ƒÍ2‘¬14»’
 * @Description: ≤‚ ‘
 */
public class TestMainEnter {

	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);

        mediator.setConcreteColleague1(colleague1);
        mediator.setConcreteColleague2(colleague2);

        colleague1.send("Hi,Boy!");
        colleague2.send("HaLo,Girl!");
	}

}
