package com.hendisantika.security.repository;

import com.hendisantika.model.security.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-security-jwt-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/16/17
 * Time: 7:06 PM
 * To change this template use File | Settings | File Templates.
 */

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
