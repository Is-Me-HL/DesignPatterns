package h.l.demo.abstractfactory.explain;

import java.util.UUID;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��14��
 * @Description: ����
 */
public class TestMainEnter {

	public static void main(String[] args) {
		// ʹ��mysql
		IFactory factory = new MysqlFactory();
		IUser user = factory.createUser();
		user.insertUser("userid", "helloWorld");
		user.deleteUser("userid");
		IDept dept = factory.createDept();
		dept.insertDept("deptid", "helloJava");
		dept.deleteDept("deptid");
		System.out.println("-------------------------------");
		// ʹ��SqlServer���ݿ�  ������mysqlʹ�õĴ����ֻ��factorynew�Ķ���һ�¼���
		factory = new SqlserverFactory();
		user = factory.createUser();
		user.insertUser("userid", "helloWorld");
		user.deleteUser("userid");
		dept = factory.createDept();
		dept.insertDept("deptid", "helloJava");
		dept.deleteDept("deptid");
	}

}
