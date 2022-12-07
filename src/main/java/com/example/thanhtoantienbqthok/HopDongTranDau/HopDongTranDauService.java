package com.example.thanhtoantienbqthok.HopDongTranDau;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HopDongTranDauService {
    @Autowired HopDongTranDauRepository hopDongTranDauRepository;

    public Optional<HopDongTranDau> getById(Integer id){
        return hopDongTranDauRepository.findById(id);
    }
}
