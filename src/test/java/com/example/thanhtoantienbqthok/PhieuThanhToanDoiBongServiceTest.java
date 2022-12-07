package com.example.thanhtoantienbqthok;

import com.example.thanhtoantienbqthok.BanToChuc.BanToChuc;
import com.example.thanhtoantienbqthok.DoiBong.DoiBong;
import com.example.thanhtoantienbqthok.PhieuThanhToanDoiBong.PhieuThanhToanDoiBong;
import com.example.thanhtoantienbqthok.PhieuThanhToanDoiBong.PhieuThanhToanDoiBongService;
import com.example.thanhtoantienbqthok.TranDau.TranDau;
import com.example.thanhtoantienbqthok.TranDau.TranDauService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest

public class PhieuThanhToanDoiBongServiceTest {
    @Autowired
    PhieuThanhToanDoiBongService phieuThanhToanDoiBongService;
    @Test
    void getTranDauByTranDauIdShouldSuccess(){
        Optional<PhieuThanhToanDoiBong> phieuThanhToanDoiBong = phieuThanhToanDoiBongService.getById(3);
        System.out.println(phieuThanhToanDoiBong);
        Assertions.assertTrue(phieuThanhToanDoiBong.get().getTen().equals("Thanh toán cho đội bóng FCB"));
    }
    @Test
    void getTranDauByTranDauIdShouldFailure(){
        Optional<PhieuThanhToanDoiBong> phieuThanhToanDoiBong = phieuThanhToanDoiBongService.getById(333);
        Assertions.assertTrue(phieuThanhToanDoiBong.isPresent() == false);
    }

    @Test
    void savePhieuThanhToanShouldSuccess(){
//        String ten = "test";
//        BanToChuc banToChuc = new BanToChuc(2,"atc","123456")
//        DoiBong db = new DoiBong("NgheAnVip","Vàng", "Nha Trang",1000,"enabled");
//
//        PhieuThanhToanDoiBong phieuThanhToanDoiBong = new PhieuThanhToanDoiBong(ten,banToChuc.get(), doiBong.get());
//        phieuThanhToanDoiBongService.save()
    }
}
