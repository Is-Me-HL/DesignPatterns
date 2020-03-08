package h.l.demo.abstractfactory.explain;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��28��
 * @Description: Dept�ӿ�
 */
public abstract class IDept {
	/**
	 * ����һ���û�
	 * 
	 * @param userId
	 *            �û�id
	 * @param username
	 *            �û���
	 */
	public abstract void insertDept(String deptId, String deptName);

	/**
	 * ɾ��һ���û�
	 * 
	 * @param userId
	 *            �û�id
	 */
	public abstract void deleteDept(String deptId);
}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��27��
 * @Description: ģ��mysql���ݿ����Dept��
 */
class MysqlDept extends IDept {

	@Override
	public void insertDept(String deptId, String deptName) {
		System.out.println("��MysqlDept���벿�����ݣ�" + deptId + "-" + deptName);
	}

	@Override
	public void deleteDept(String deptId) {
		System.out.println("��MysqlDeptɾ���������ݣ�" + deptId);
	}

}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��27��
 * @Description: ģ��sqlserver���ݿ����Dept��
 */
class SqlserverDept extends IDept {

	@Override
	public void insertDept(String deptId, String deptName) {
		System.out.println("��SqlserverDept���벿�����ݣ�" + deptId + "-" + deptName);
	}

	@Override
	public void deleteDept(String deptId) {
		System.out.println("��SqlserverDeptɾ���������ݣ�" + deptId);
	}

}