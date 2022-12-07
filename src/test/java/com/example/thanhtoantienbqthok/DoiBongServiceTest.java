package com.example.thanhtoantienbqthok;

import com.example.thanhtoantienbqthok.Auth.AuthService;
import com.example.thanhtoantienbqthok.BanToChuc.BanToChuc;
import com.example.thanhtoantienbqthok.DoiBong.DoiBong;
import com.example.thanhtoantienbqthok.DoiBong.DoiBongService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest

public class DoiBongServiceTest {
    @Autowired
    DoiBongService doiBongService;
    @Test
    void getDoiBongByIdShouldSuccess() {
        Optional<DoiBong> doiBong = doiBongService.getById(1);
        System.out.println(doiBong);
        Assertions.assertTrue(doiBong.get().getTen().equals("FCB"));
    }
    @Test
    void getAllDoiBongShouldSuccess() {
        Iterable<DoiBong> listDoiBong = doiBongService.getAll();
        Assertions.assertNotNull(listDoiBong);
    }

    @Test
    void getDoiBongByIdShouldFailure() {
        Optional<DoiBong> doiBong = doiBongService.getById(122);
        Assertions.assertTrue(doiBong.isPresent() == false);
    }
}
