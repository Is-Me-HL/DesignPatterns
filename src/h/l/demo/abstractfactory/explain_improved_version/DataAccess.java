package h.l.demo.abstractfactory.explain_improved_version;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��27��
 * @Description: ʹ�ü򵥹���ȡ��IFactory��MysqlFactory��SqlserverFactory������
 */
public class DataAccess {

	/**
	 * �������ݿⷵ�ض�Ӧ�����ݿ�User������
	 * 
	 * @param db
	 *            ���ݿ�
	 * @return
	 */
	/*
	 * public static IUser createUser(String db) { IUser result = null; switch
	 * (db) { case "Mysql": result = new MysqlUser(); break; case "Sqlserver":
	 * result = new SqlserverUser(); break; } return result; }
	 *//**
	 * �������ݿⷵ�ض�Ӧ�����ݿ�Dept������
	 * 
	 * @param db
	 *            ���ݿ�
	 * @return
	 */
	/*
	 * public static IDept createDept(String db) { IDept result = null; switch
	 * (db) { case "Mysql": result = new MysqlDept(); break; case "Sqlserver":
	 * result = new SqlserverDept(); break; } return result; }
	 */

	// ����������û��ʹ�÷���Ĵ��룬�����Ǽ򵥹�����Ӧ�ã���������pgsql�µ����ݿ���뻹��
	// �޸ĸü򵥹�������������ʹ�÷��������

	private static String dbClassName;
	static {
		// ����ָ�������ݿ�����࣬��·�����磺
		// h.l.demo.abstractfactory.explain_improved_version.Mysql+User
		Properties properties = new Properties();
		try {
			// ���ʵ�srcͬ��Ŀ¼�µ�propertiesд��
			// properties.load(new FileInputStream(new File("./dbConfig.properties")));
			// ��������ڵ�ǰ����˵��propertiesд��
			String path = DataAccess.class.getResource("dbConfig.properties").getPath();
			System.out.println(path);
			properties.load(new FileInputStream(new File(path)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		dbClassName = properties.getProperty("dbClassName");
		System.out.println(dbClassName);
	}

	/**
	 * ����ָ�������ݿ�User������ʵ��
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	public static IUser createUser()
			throws ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		Class<?> clazz = Class.forName(dbClassName + "User");
		return (IUser) clazz.newInstance();
	}
	/**
	 * ����ָ�������ݿ�Dept������ʵ��
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	public static IDept createDept()
			throws ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		Class<?> clazz = Class.forName(dbClassName + "Dept");
		return (IDept) clazz.newInstance();
	}
}
