package cn.zedongw.springstudy.h.jdbc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName UserDao
 * @Description: 模拟用户持久层
 * @Author ZeDongW
 * @Date 2020/4/13 0013 18:48
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class UserDao3 {
    private static Logger logger = LogManager.getLogger(UserDao3.class);
    
    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public void save() {
        String sql = "insert into users(userName, age) values('李四', 27);";
        jdbcTemplate.update(sql);
    }

    public User findById(int id) {
        String sql = "select * from users where id=?";
        List<User> list = jdbcTemplate.query(sql,new MyResult(), id);
        return (list!=null && list.size()>0) ? list.get(0) : null;
    }

    public List<User> getAll() {
        String sql = "select * from users";
        List<User> list = jdbcTemplate.query(sql, new MyResult());
        return list;
    }




    class MyResult implements RowMapper<User> {

        // 如何封装一行记录
        @Override
        public User mapRow(ResultSet rs, int index) throws SQLException {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setUserName(rs.getString("userName"));
            user.setAge(rs.getInt("age"));
            return user;
        }

    }
}
