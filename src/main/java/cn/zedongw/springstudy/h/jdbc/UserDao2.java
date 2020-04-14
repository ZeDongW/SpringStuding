package cn.zedongw.springstudy.h.jdbc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.sql.DataSource;
import java.sql.Connection;
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
public class UserDao2 {
    private static Logger logger = LogManager.getLogger(UserDao2.class);

    /**
     * IOC容器注入
     */
    private DataSource dataSource;
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void save() {
        String sql = "insert into users(userName, age) values('张三',26)";
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            //从驱动管理类获取数据库连接
            conn = dataSource.getConnection();

            pstmt = conn.prepareStatement("sql");

            pstmt.executeUpdate(sql);

            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
