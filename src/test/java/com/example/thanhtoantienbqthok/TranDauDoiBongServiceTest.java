package com.example.thanhtoantienbqthok;

import com.example.thanhtoantienbqthok.DoiBong.DoiBong;
import com.example.thanhtoantienbqthok.TranDauDoiBong.TranDauDoiBong;
import com.example.thanhtoantienbqthok.TranDauDoiBong.TranDauDoiBongService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class TranDauDoiBongServiceTest {
    @Autowired
    TranDauDoiBongService tranDauDoiBongService;
    @Test
    void getAllTranDauDoiBongByDoiBongIdShouldSuccess() {
        Optional<List<TranDauDoiBong>> tranDauDoiBong = tranDauDoiBongService.getByDoiBongId(1);
        Assertions.assertNotNull(tranDauDoiBong);
    }
    @Test
    void getAllTranDauDoiBongByDoiBongIdShouldFailure() {
        Optional<List<TranDauDoiBong>> tranDauDoiBong = tranDauDoiBongService.getByDoiBongId(333);
        Assertions.assertNotNull(tranDauDoiBong);
    }

}
