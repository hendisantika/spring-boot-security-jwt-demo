package com.hendisantika.security.service;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-security-jwt-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/19/17
 * Time: 5:46 PM
 * To change this template use File | Settings | File Templates.
 */

public class JwtAuthenticationResponse implements Serializable {

    private static final long serialVersionUID = 1250166508152483573L;

    private final String token;

    public JwtAuthenticationResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}
