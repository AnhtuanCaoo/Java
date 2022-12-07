package com.example.thanhtoantienbqthok;

import com.example.thanhtoantienbqthok.Auth.AuthService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest

public class AuthServiceTest {
    @Autowired
    AuthService authService;
    @Test
    void testLoginSuccessShouldReturnTrue() {
        String username = "atc";
        String password = "123456";
        boolean isLogin = authService.authLogin(username, password);
        Assertions.assertEquals(isLogin, true);
    }
    @Test
    void testLoginFailureShouldReturnFalse() {
        String username = "atc";
        String password = "hehe";
        boolean isLogin = authService.authLogin(username, password);
        Assertions.assertEquals(isLogin, false);
    }
}
