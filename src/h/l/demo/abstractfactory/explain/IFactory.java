package h.l.demo.abstractfactory.explain;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��27��
 * @Description: ���󹤳�/�ӿ�
 */
public abstract class IFactory {

	/**
	 * ����IUserʵ��
	 * @return
	 */
	public abstract IUser createUser();
	/**
	 * ����IDeptʵ��
	 * @return
	 */
	public abstract IDept createDept();
}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��27��
 * @Description: mysql���ݿ��������
 */
class MysqlFactory extends IFactory{

	@Override
	public IUser createUser() {
		System.out.println("MysqlFactory ����IUserʵ����"+new SimpleDateFormat().format(new Date()));
		return new MysqlUser();
	}

	@Override
	public IDept createDept() {
		System.out.println("MysqlFactory ����IDeptʵ����"+new SimpleDateFormat().format(new Date()));
		return new MysqlDept();
	}
	
}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��27��
 * @Description: sqlserver���ݿ��������
 */
class SqlserverFactory extends IFactory{

	@Override
	public IUser createUser() {
		System.out.println("SqlserverFactory ����IUserʵ����"+new SimpleDateFormat().format(new Date()));
		return new SqlserverUser();
	}

	@Override
	public IDept createDept() {
		System.out.println("SqlserverFactory ����IDeptʵ����"+new SimpleDateFormat().format(new Date()));
		return new SqlserverDept();
	}
	
}