package com.neusoft.service.dao;

import com.neusoft.po.Elmeuser;

public interface ElmeuserService {
    //浏览用户信息的业务
    public Elmeuser queryUser(String userId);
    // 实现用户注册的业务
    public boolean regUser(Elmeuser elmeuser);
    // 实现用户登陆的业务
    public boolean loginUser(Elmeuser elmeuser);
}
