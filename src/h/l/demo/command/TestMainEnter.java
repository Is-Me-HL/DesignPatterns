package h.l.demo.command;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��14��
 * @Description: ����
 */
public class TestMainEnter {

	public static void main(String[] args) {
		// ����ִ����
        CommandReceiver commandReceiver = new CommandReceiver();
        // ����
        Command command = new ConcreteCommand(commandReceiver);
        command.setCommandContent("������һ�����֣�лл");
        // ����2
        Command command2 = new ConcreteCommand2(commandReceiver);
        command2.setCommandContent("������һ����Ƭ��лл");
        // �����м���
        Invoker invoker = new Invoker();
        invoker.addCommand(command);
        invoker.addCommand(command2);
        // ִ������
        invoker.execute();
	}

}
