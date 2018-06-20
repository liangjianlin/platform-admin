package cn.com.ljl.platformadmin.web;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/auth")
public class AuthController {

    @RequestMapping(value = "/login")
    public JSONObject login() {
        JSONObject rs = new JSONObject();
        rs.put("user", "admin");
        return rs;
    }

    @RequestMapping(value = "/user")
    public JSONObject user() {
        JSONObject rs = new JSONObject();
        rs.put("user", "admin");
        return rs;
    }

    @RequestMapping(value = "/logout")
    public JSONObject logout() {
        JSONObject rs = new JSONObject();
        return rs;
    }
}
