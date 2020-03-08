package h.l.demo.abstractfactory.explain;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月27日
 * @Description: User接口
 */
public interface IUser {
	/**
	 * 插入一个用户
	 * @param userId 用户id
	 * @param username 用户名
	 */
	public void insertUser(String userId, String username);
	/**
	 * 删除一个用户
	 * @param userId 用户id
	 */
	public void deleteUser(String userId);
}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月27日
 * @Description: 模拟mysql数据库操作User类
 */
class MysqlUser implements IUser {

	@Override
	public void insertUser(String userId, String username) {
		System.out.println("向MysqlUser插入用户数据：" + userId + "-" + username);
	}

	@Override
	public void deleteUser(String userId) {
		System.out.println("向MysqlUser删除用户数据：" + userId);
	}

}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月27日
 * @Description: 模拟sqlserver数据库操作User类
 */
class SqlserverUser implements IUser {

	@Override
	public void insertUser(String userId, String username) {
		System.out.println("向SqlserverUser插入用户数据：" + userId + "-" + username);
	}

	@Override
	public void deleteUser(String userId) {
		System.out.println("向SqlserverUser删除用户数据：" + userId);
	}

}