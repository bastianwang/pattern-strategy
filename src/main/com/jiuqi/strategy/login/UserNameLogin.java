package main.com.jiuqi.strategy.login;


import main.com.jiuqi.strategy.entity.User;

/**
 * 用户名登录
 */
public class UserNameLogin implements Login{
    @Override
    public String login(User user) {
        return checkUserName(user.getName(),user.getPassword());
    }

    private String checkUserName(String name, String password) {
        if(name==null||password==null){
            return  "用户名或密码为空";
        }
        return "用户名密码验证";
    }
}
