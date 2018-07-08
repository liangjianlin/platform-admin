package cn.com.ljl.platformadmin.web;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/auth")
public class AuthController {

    private static final Logger logger = Logger.getLogger("OP");

    @RequestMapping(value = "/login")
    public JSONObject login(@RequestBody JSONObject params) {
        JSONObject rs = new JSONObject();
        rs.put("user", "admin");
        return rs;
    }

    @RequestMapping(value = "/user")
    public JSONObject user(@RequestParam("userId") String userId) {
        JSONObject rs = new JSONObject();
        rs.put("user", "admin");
        return rs;
    }

    @RequestMapping(value = "/logout")
    public JSONObject logout(@RequestBody JSONObject params) {
        JSONObject rs = new JSONObject();
        return rs;
    }
}
