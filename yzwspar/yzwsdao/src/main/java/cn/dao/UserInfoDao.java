package cn.dao;

import cn.pojo.UserInfo;

import java.util.List;

public interface UserInfoDao {
    /**
     *查找所有用户名
     * @return
     */
    List<UserInfo> seluser();
}
