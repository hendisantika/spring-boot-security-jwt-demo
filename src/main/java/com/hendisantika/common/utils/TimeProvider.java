package com.hendisantika.common.utils;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : cspring-boot-security-jwt-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/16/17
 * Time: 7:06 PM
 * To change this template use File | Settings | File Templates.
 */

@Component
public class TimeProvider implements Serializable {

    private static final long serialVersionUID = -3301695478208950415L;

    public Date now() {
        return new Date();
    }
}
