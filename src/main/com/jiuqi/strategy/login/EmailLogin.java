package main.com.jiuqi.strategy.login;

import main.com.jiuqi.strategy.entity.User;

/**
 * 邮箱验证
 */
public class EmailLogin implements Login {
    @Override
    public String login(User user) {
        return checkEmail(user.getEmail(),user.getPassword());
    }

    private String checkEmail(String email, String password) {
        if(email==null||password==null){
            return "邮箱或密码为空";
        }
        return "邮箱密码验证";
    }
}
