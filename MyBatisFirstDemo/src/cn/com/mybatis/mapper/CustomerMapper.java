package cn.com.mybatis.mapper;

import cn.com.mybatis.po.Customer;

public interface CustomerMapper {
    //����Id��ѯ�û���Ϣ
    public Customer findCustomerById(int id) throws Exception;

    //����û���Ϣ  
    public void insertCustomer(Customer customer) throws Exception;

    //ɾ���û���Ϣ  
    public void deleteCustomer(int id) throws Exception;

    //�޸��û���Ϣ  
    public void updateCustomerAcNo(Customer customer) throws Exception;
}
