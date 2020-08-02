package cn.com.sm.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.sm.dao.UserDao;
import cn.com.sm.po.User;

public class UserServiceTest {
    private ApplicationContext applicationContext;

    //��ִ�в��Է���֮ǰ���Ȼ�Spring�����ļ�����
    //ע��Before����ִ�б������в��Է���֮ǰ�ȵ����������  
    @Before
    public void setup() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    }

    @Test
    public void testFindUserById() throws Exception {
        //ͨ��������Դ�����ȡuserDao����
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        //����UserDao�ķ���  
        User user = userDao.findUserById(1);
        //����û���Ϣ  
        System.out.println(user.getId() + ":" + user.getUsername());
    }
}  