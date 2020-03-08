package h.l.demo.abstractfactory.explain;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月28日
 * @Description: Dept接口
 */
public abstract class IDept {
	/**
	 * 插入一个用户
	 * 
	 * @param userId
	 *            用户id
	 * @param username
	 *            用户名
	 */
	public abstract void insertDept(String deptId, String deptName);

	/**
	 * 删除一个用户
	 * 
	 * @param userId
	 *            用户id
	 */
	public abstract void deleteDept(String deptId);
}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月27日
 * @Description: 模拟mysql数据库操作Dept类
 */
class MysqlDept extends IDept {

	@Override
	public void insertDept(String deptId, String deptName) {
		System.out.println("向MysqlDept插入部门数据：" + deptId + "-" + deptName);
	}

	@Override
	public void deleteDept(String deptId) {
		System.out.println("向MysqlDept删除部门数据：" + deptId);
	}

}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月27日
 * @Description: 模拟sqlserver数据库操作Dept类
 */
class SqlserverDept extends IDept {

	@Override
	public void insertDept(String deptId, String deptName) {
		System.out.println("向SqlserverDept插入部门数据：" + deptId + "-" + deptName);
	}

	@Override
	public void deleteDept(String deptId) {
		System.out.println("向SqlserverDept删除部门数据：" + deptId);
	}

}