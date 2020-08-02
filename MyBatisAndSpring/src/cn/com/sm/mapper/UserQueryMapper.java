package cn.com.sm.mapper;

import cn.com.sm.po.User;

public interface UserQueryMapper {
    //����Id��ѯ�û���Ϣ
    public User findUserById(int id) throws Exception;
}
