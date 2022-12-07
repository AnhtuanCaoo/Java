package com.example.thanhtoantienbqthok;

import com.example.thanhtoantienbqthok.DoiBong.DoiBong;
import com.example.thanhtoantienbqthok.TranDau.TranDau;
import com.example.thanhtoantienbqthok.TranDau.TranDauService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class TranDauServiceTest {
    @Autowired
    TranDauService tranDauService;
    @Test
    void getTranDauByTranDauIdShouldSuccess(){
        Optional<TranDau> tranDau = tranDauService.getById(1);
        System.out.println(tranDau);
        Assertions.assertTrue(tranDau.get().getTen().equals("Khai Mạc"));
    }
    @Test
    void getTranDauByTranDauIdShouldFailure(){
        Optional<TranDau> tranDau = tranDauService.getById(333);
        Assertions.assertTrue(tranDau.isPresent() == false);
    }
}

