package cn.com.ljl.platformadmin.web;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "/login")
    public JSONObject login() {
        JSONObject rs = new JSONObject();
        rs.put("user", "test");
        return rs;
    }

}
