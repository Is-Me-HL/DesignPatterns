package h.l.demo.abstractfactory.explain_improved_version;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月27日
 * @Description: 使用简单工厂取代IFactory、MysqlFactory、SqlserverFactory三个类
 */
public class DataAccess {

	/**
	 * 根据数据库返回对应的数据库User操作类
	 * 
	 * @param db
	 *            数据库
	 * @return
	 */
	/*
	 * public static IUser createUser(String db) { IUser result = null; switch
	 * (db) { case "Mysql": result = new MysqlUser(); break; case "Sqlserver":
	 * result = new SqlserverUser(); break; } return result; }
	 *//**
	 * 根据数据库返回对应的数据库Dept操作类
	 * 
	 * @param db
	 *            数据库
	 * @return
	 */
	/*
	 * public static IDept createDept(String db) { IDept result = null; switch
	 * (db) { case "Mysql": result = new MysqlDept(); break; case "Sqlserver":
	 * result = new SqlserverDept(); break; } return result; }
	 */

	// 上述代码是没有使用反射的代码，仅仅是简单工厂的应用，对于诸如pgsql新的数据库加入还得
	// 修改该简单工厂，所以现在使用反射来解决

	private static String dbClassName;
	static {
		// 加载指定的数据库操作类，类路径，如：
		// h.l.demo.abstractfactory.explain_improved_version.Mysql+User
		Properties properties = new Properties();
		try {
			// 访问的src同级目录下的properties写法
			// properties.load(new FileInputStream(new File("./dbConfig.properties")));
			// 访问相对于当前类来说的properties写法
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
	 * 生产指定的数据库User操作类实例
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
	 * 生产指定的数据库Dept操作类实例
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
