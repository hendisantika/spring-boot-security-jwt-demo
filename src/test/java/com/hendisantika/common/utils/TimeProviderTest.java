package com.hendisantika.common.utils;

import org.junit.Test;

import java.util.Date;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-security-jwt-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/18/17
 * Time: 6:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class TimeProviderTest {
    @Test
    public void now() throws Exception {
        assertThat(new TimeProvider().now()).isCloseTo(new Date(), 1000);
    }

}