package cn.boss.dao;

public interface IChangeDao {

	/**
	 * ���
	 * �޸�����
	 * @param password ����
	 * @param username �˻�
	 * @return
	 */

	int changPwd(String password, String username);

}
