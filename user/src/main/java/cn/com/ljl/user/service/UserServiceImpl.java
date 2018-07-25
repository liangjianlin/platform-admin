package cn.com.ljl.user.service;

import cn.com.ljl.commonservicefacade.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
@org.springframework.stereotype.Service
public class UserServiceImpl implements UserService {

    @Override
    public String login(String name) {
        return name;
    }

}
