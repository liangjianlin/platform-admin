package cn.com.ljl.user.service;

import cn.com.ljl.commonservicefacade.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public String login(String name) {
        return name;
    }

}
