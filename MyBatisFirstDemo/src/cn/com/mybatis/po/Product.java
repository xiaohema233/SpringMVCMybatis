package cn.com.mybatis.po;

import java.util.List;

public class Product {
    //��Ʒid
    private int pid;
    //��Ʒ����
    private String pname;
    //����Ʒ���޵��û�
    private List<User> users;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

}
