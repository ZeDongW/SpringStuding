package cn.zedongw.springstudy.h.jdbc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @ClassName UserDao
 * @Description: 模拟用户持久层
 * @Author ZeDongW
 * @Date 2020/4/13 0013 18:48
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class UserDao1 {
    private static Logger logger = LogManager.getLogger(UserDao1.class);
    public void save() {
        String sql = "insert into users(userName, age) values('张三',26)";
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            //注册数据库驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //从驱动管理类获取数据库连接
            conn = DriverManager.getConnection("jdbc:mysql:///test?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai","zedongw","ZeDongW@mysql553");

            pstmt = conn.prepareStatement("sql");

            pstmt.executeUpdate(sql);

            pstmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
