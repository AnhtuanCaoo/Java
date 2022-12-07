package com.example.thanhtoantienbqthok;

import com.example.thanhtoantienbqthok.HopDongTranDau.HopDongTranDau;
import com.example.thanhtoantienbqthok.HopDongTranDau.HopDongTranDauService;
import com.example.thanhtoantienbqthok.SanDau.SanDau;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest

public class HopDongTranDauServiceTest {
    @Autowired
    HopDongTranDauService hopDongTranDauService;

    @Test
    void getHopDongTranDauByIdShouldFailure(){
        Optional<HopDongTranDau> hopDongTranDau = hopDongTranDauService.getById(333);
        Assertions.assertTrue(hopDongTranDau.isPresent() == false);
    }
    @Test
    void getHopDongTranDauByIdShouldSuccess(){
        Optional<HopDongTranDau> hopDongTranDau = hopDongTranDauService.getById(1);
        Assertions.assertTrue(hopDongTranDau.get().getGiaTien() == 50000);
    }
}
