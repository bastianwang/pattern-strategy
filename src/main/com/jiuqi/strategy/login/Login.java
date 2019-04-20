package main.com.jiuqi.strategy.login;

import main.com.jiuqi.strategy.entity.User;

/**
 * 登录
 */
public interface Login {
    /**
     * 登录
     * @param user
     * @return
     */
    String login(User user);

}
