package h.l.demo.command;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 用来声明执行操作的接口
 */
abstract class Command {
	protected CommandReceiver commandReceiver;
	protected String commandContent;

	// 设置命令执行者
	public Command(CommandReceiver commandReceiver) {
		this.commandReceiver = commandReceiver;
	}

	// 设置命令内容
	public void setCommandContent(String commandContent) {
		this.commandContent = commandContent;
	}

	// 获取命令内容
	public String getCommandContent() {
		return this.commandContent;
	}

	abstract public void Execute();
}

/**
 * 具体命令类
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
 * 具体命令类2
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
 * Invoker类，要求该命令执行这个请求，相当于命令发起人和命令接收人中间传递消息的那个人，承前启后，前接收命令，后下发命令道执行者那。
 */
class Invoker {
	private List<Command> commands = new ArrayList<>();

	public void addCommand(Command command) {
		System.out.println("【添加命令】：" + "\t" + command.getCommandContent()
				+ "\t" + new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		commands.add(command);
	}

	public void execute() {
		System.out.println("【执行命令】：");
		for (Command command : commands) {
			command.Execute();
		}
	}
}

/**
 * 命令接收者：里面有一系列执行的动作
 */
class CommandReceiver {
	public void Action() {
		System.out.println("【执行命令】" + "\t" + "买好可乐，给你");
	}

	public void Action2() {
		System.out.println("【执行命令】" + "\t" + "买好薯片，给你");
	}
}