package com.example.thanhtoantienbqthok.TranDau;

import com.example.thanhtoantienbqthok.DoiBong.DoiBong;
import com.example.thanhtoantienbqthok.HopDongTranDau.HopDongTranDau;
import com.example.thanhtoantienbqthok.PhieuThanhToanDoiBong.PhieuThanhToanDoiBong;
import com.example.thanhtoantienbqthok.PhieuThanhToanDoiBong.PhieuThanhToanDoiBongRepository;
import com.example.thanhtoantienbqthok.TranDauDoiBong.TranDauDoiBong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TranDauService {
    @Autowired
    TranDauRepository tranDauRepository;
    public Optional<TranDau> getById(Integer id) {
        return tranDauRepository.findById(id);
    }
}
