package cn.com.sm.dao;

import cn.com.sm.po.User;

//�û������Dao�ӿ�
public interface UserDao {
    //����Id��ѯ�û���Ϣ
    public User findUserById(int id) throws Exception;
}  