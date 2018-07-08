package cn.com.ljl.platformadmin.config;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;

public class InterceptorConfig implements HandlerInterceptor {

    @Value("${clients}")
    private String clients;

    private static final Logger logger = Logger.getLogger("OP");

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String signature = request.getParameter("signature");
        String client = request.getParameter("client");
        String nonce = request.getParameter("nonce");
        String timestamp = request.getParameter("timestamp");
        String[] tmp = clients.split(",");
        String clientToken;
        String newSignature;
        boolean result = false;
        for (int i = 0; i < tmp.length; i++) {
            if (client.equals(tmp[i].split(":")[0])) {
                clientToken = tmp[i].split(":")[1];
                ArrayList<String> arr = new ArrayList<>();
                arr.add(clientToken);
                arr.add(nonce);
                arr.add(timestamp);
                Collections.sort(arr);
                newSignature = DigestUtils.sha1Hex(StringUtils.join(arr, ','));
                if (newSignature.equals(signature)) {
                    result = true;
                }
            }
        }
        if (!result){
            throw new RuntimeException("access deny");
        }
        return result;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

}
