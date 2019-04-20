package test;

import main.com.jiuqi.strategy.entity.User;
import main.com.jiuqi.strategy.login.Login;
import main.com.jiuqi.strategy.login.UserNameLogin;

public class LoginStrategyTest {
    public static void main(String[] args) {
        User user = new User();
        user.setName("admin");
        user.setPassword("hhhe");
        Login login = new UserNameLogin();
        System.out.println(login.login(user));
    }
}
