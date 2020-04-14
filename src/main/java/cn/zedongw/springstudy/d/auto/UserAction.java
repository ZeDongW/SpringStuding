package cn.zedongw.springstudy.d.auto;

/**
 * @ClassName UserAction
 * @Description: 模拟用户控制层
 * @Author ZeDongW
 * @Date 2020/4/13 0013 18:51
 * @Version 1.0
 * @Modified By:
 * @Modified Time:
 **/
public class UserAction {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String execute() {
        this.userService.save();
        return null;
    }
}
