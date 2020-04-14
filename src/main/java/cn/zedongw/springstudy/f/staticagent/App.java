package cn.zedongw.springstudy.f.staticagent;

/**
 * @ClassName App
 * @Description: 静态代理
 * @Author ZeDongW
 * @Date 2020/4/14 0014 10:56
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class App {
    public static void main(String[] args) {
        UserDaoProxy proxy = new UserDaoProxy(new UserDaoImpl());
        proxy.save();
    }
}
