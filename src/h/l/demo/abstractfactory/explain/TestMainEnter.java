package h.l.demo.abstractfactory.explain;

import java.util.UUID;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月14日
 * @Description: 测试
 */
public class TestMainEnter {

	public static void main(String[] args) {
		// 使用mysql
		IFactory factory = new MysqlFactory();
		IUser user = factory.createUser();
		user.insertUser("userid", "helloWorld");
		user.deleteUser("userid");
		IDept dept = factory.createDept();
		dept.insertDept("deptid", "helloJava");
		dept.deleteDept("deptid");
		System.out.println("-------------------------------");
		// 使用SqlServer数据库  和上面mysql使用的代码就只有factorynew的对象换一下即可
		factory = new SqlserverFactory();
		user = factory.createUser();
		user.insertUser("userid", "helloWorld");
		user.deleteUser("userid");
		dept = factory.createDept();
		dept.insertDept("deptid", "helloJava");
		dept.deleteDept("deptid");
	}

}
