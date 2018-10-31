package cn.service.impl;

import cn.dao.UserInfoDao;
import cn.pojo.UserInfo;
import cn.service.UserInfoService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Service("usi")
public class UserInfoServiceImpl implements UserInfoService {
   @Autowired
    private UserInfoDao uid;

    public UserInfoDao getUid() {
        return uid;
    }

    public void setUid(UserInfoDao uid) {
        this.uid = uid;
    }

    @Override
    public String seluser() {
        List<UserInfo> sel = uid.seluser();

        return JSON.toJSONString(sel);
    }
}
