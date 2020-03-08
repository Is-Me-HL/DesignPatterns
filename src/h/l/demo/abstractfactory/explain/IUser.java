package h.l.demo.abstractfactory.explain;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��27��
 * @Description: User�ӿ�
 */
public interface IUser {
	/**
	 * ����һ���û�
	 * @param userId �û�id
	 * @param username �û���
	 */
	public void insertUser(String userId, String username);
	/**
	 * ɾ��һ���û�
	 * @param userId �û�id
	 */
	public void deleteUser(String userId);
}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��27��
 * @Description: ģ��mysql���ݿ����User��
 */
class MysqlUser implements IUser {

	@Override
	public void insertUser(String userId, String username) {
		System.out.println("��MysqlUser�����û����ݣ�" + userId + "-" + username);
	}

	@Override
	public void deleteUser(String userId) {
		System.out.println("��MysqlUserɾ���û����ݣ�" + userId);
	}

}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��27��
 * @Description: ģ��sqlserver���ݿ����User��
 */
class SqlserverUser implements IUser {

	@Override
	public void insertUser(String userId, String username) {
		System.out.println("��SqlserverUser�����û����ݣ�" + userId + "-" + username);
	}

	@Override
	public void deleteUser(String userId) {
		System.out.println("��SqlserverUserɾ���û����ݣ�" + userId);
	}

}