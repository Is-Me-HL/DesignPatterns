package h.l.demo.command;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月14日
 * @Description: 测试
 */
public class TestMainEnter {

	public static void main(String[] args) {
		// 命令执行人
        CommandReceiver commandReceiver = new CommandReceiver();
        // 命令
        Command command = new ConcreteCommand(commandReceiver);
        command.setCommandContent("帮我买一个可乐，谢谢");
        // 命令2
        Command command2 = new ConcreteCommand2(commandReceiver);
        command2.setCommandContent("帮我买一包薯片，谢谢");
        // 命令中间人
        Invoker invoker = new Invoker();
        invoker.addCommand(command);
        invoker.addCommand(command2);
        // 执行命令
        invoker.execute();
	}

}
