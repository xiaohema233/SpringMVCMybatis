package cn.com.mybatis.test;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

public class DateTypeHandler implements TypeHandler<Date> {

    //ת���������͵ĸ�����
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public void setParameter(PreparedStatement ps, int i, Date parameter,
                             JdbcType jdbcType) throws SQLException {
        //ָ�������Java������ӦJDBC�е����ݿ�����
        System.out.println("�����߼�");
        ps.setDate(i, parameter);
        System.out.println("�����߼�");
    }

    @Override
    public Date getResult(ResultSet rs, String columnName) throws SQLException {
        System.out.println("�����߼�");
        return rs.getDate(columnName);
    }

    @Override
    public Date getResult(ResultSet rs, int columnIndex) throws SQLException {
        System.out.println("�����߼�");
        return rs.getDate(columnIndex);
    }

    @Override
    public Date getResult(CallableStatement cs, int columnIndex) throws SQLException {
        System.out.println("�����߼�");
        return cs.getDate(columnIndex);
    }
}
