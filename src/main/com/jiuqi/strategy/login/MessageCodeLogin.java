package main.com.jiuqi.strategy.login;

import main.com.jiuqi.strategy.entity.User;

/**
 * 手机验证码登录
 */
public class MessageCodeLogin implements Login {
    @Override
    public String login(User user) {
        return checkTelphoneCode(user.getTelphone(),user.getCheckCode());
    }

    private String checkTelphoneCode(String telphone, String checkCode) {
        if(telphone==null||checkCode==null){
            return "手机号或验证码为空";
        }
        return "手机号验证码认证";
    }
}
