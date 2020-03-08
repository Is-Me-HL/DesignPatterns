package h.l.demo.command;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ��������ִ�в����Ľӿ�
 */
abstract class Command {
	protected CommandReceiver commandReceiver;
	protected String commandContent;

	// ��������ִ����
	public Command(CommandReceiver commandReceiver) {
		this.commandReceiver = commandReceiver;
	}

	// ������������
	public void setCommandContent(String commandContent) {
		this.commandContent = commandContent;
	}

	// ��ȡ��������
	public String getCommandContent() {
		return this.commandContent;
	}

	abstract public void Execute();
}

/**
 * ����������
 */
class ConcreteCommand extends Command {

	public ConcreteCommand(CommandReceiver commandReceiver) {
		super(commandReceiver);
	}

	@Override
	public void Execute() {
		commandReceiver.Action();
	}
}

/**
 * ����������2
 */
class ConcreteCommand2 extends Command {

	public ConcreteCommand2(CommandReceiver commandReceiver) {
		super(commandReceiver);
	}

	@Override
	public void Execute() {
		commandReceiver.Action2();
	}
}

/**
 * Invoker�࣬Ҫ�������ִ����������൱��������˺�����������м䴫����Ϣ���Ǹ��ˣ���ǰ����ǰ����������·������ִ�����ǡ�
 */
class Invoker {
	private List<Command> commands = new ArrayList<>();

	public void addCommand(Command command) {
		System.out.println("����������" + "\t" + command.getCommandContent()
				+ "\t" + new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		commands.add(command);
	}

	public void execute() {
		System.out.println("��ִ�������");
		for (Command command : commands) {
			command.Execute();
		}
	}
}

/**
 * ��������ߣ�������һϵ��ִ�еĶ���
 */
class CommandReceiver {
	public void Action() {
		System.out.println("��ִ�����" + "\t" + "��ÿ��֣�����");
	}

	public void Action2() {
		System.out.println("��ִ�����" + "\t" + "�����Ƭ������");
	}
}