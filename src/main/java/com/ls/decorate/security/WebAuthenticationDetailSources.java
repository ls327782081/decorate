package com.ls.decorate.security;

import org.springframework.security.authentication.AuthenticationDetailsSource;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * 额外登录信息源
 * @author shuang.liang
 * @version 1.0, 2018-11-16
 */
@Component
public class WebAuthenticationDetailSources implements AuthenticationDetailsSource<HttpServletRequest, WebAuthenticationDetails> {
    @Override
    public WebAuthenticationDetails buildDetails(HttpServletRequest context) {
        return new AnotherWebAuthenticationDetails(context);
    }
}
