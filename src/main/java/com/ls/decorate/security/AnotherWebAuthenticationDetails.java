package com.ls.decorate.security;

import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * 其余登录信息
 * @author shuang.liang
 * @version 1.0, 2018-11-16
 */
public class AnotherWebAuthenticationDetails extends WebAuthenticationDetails {

    public AnotherWebAuthenticationDetails(HttpServletRequest request) {
        super(request);
    }
}
