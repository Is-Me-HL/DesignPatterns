package h.l.demo.abstractfactory.explain;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月27日
 * @Description: 抽象工厂/接口
 */
public abstract class IFactory {

	/**
	 * 创建IUser实例
	 * @return
	 */
	public abstract IUser createUser();
	/**
	 * 创建IDept实例
	 * @return
	 */
	public abstract IDept createDept();
}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月27日
 * @Description: mysql数据库操作工厂
 */
class MysqlFactory extends IFactory{

	@Override
	public IUser createUser() {
		System.out.println("MysqlFactory 创建IUser实例："+new SimpleDateFormat().format(new Date()));
		return new MysqlUser();
	}

	@Override
	public IDept createDept() {
		System.out.println("MysqlFactory 创建IDept实例："+new SimpleDateFormat().format(new Date()));
		return new MysqlDept();
	}
	
}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月27日
 * @Description: sqlserver数据库操作工厂
 */
class SqlserverFactory extends IFactory{

	@Override
	public IUser createUser() {
		System.out.println("SqlserverFactory 创建IUser实例："+new SimpleDateFormat().format(new Date()));
		return new SqlserverUser();
	}

	@Override
	public IDept createDept() {
		System.out.println("SqlserverFactory 创建IDept实例："+new SimpleDateFormat().format(new Date()));
		return new SqlserverDept();
	}
	
}