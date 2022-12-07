package com.example.thanhtoantienbqthok;

import com.example.thanhtoantienbqthok.SanDau.SanDau;
import com.example.thanhtoantienbqthok.SanDau.SanDauService;
import com.example.thanhtoantienbqthok.TranDau.TranDau;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest

public class SanDauServiceTest {
    @Autowired
    SanDauService sanDauService;

    @Test
    void getTranDauByTranDauIdShouldFailure(){
        Optional<SanDau> sanDau = sanDauService.getById(333);
        Assertions.assertTrue(sanDau.isPresent() == false);
    }
    @Test
    void getTranDauByTranDauIdShouldSuccess(){
        Optional<SanDau> sanDau = sanDauService.getById(1);
        Assertions.assertTrue(sanDau.get().getTen().equals("Mỹ Đình 1"));
    }

}
