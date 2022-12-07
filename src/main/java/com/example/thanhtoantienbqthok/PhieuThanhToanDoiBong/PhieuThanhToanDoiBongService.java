package com.example.thanhtoantienbqthok.PhieuThanhToanDoiBong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PhieuThanhToanDoiBongService {
    @Autowired PhieuThanhToanDoiBongRepository phieuThanhToanDoiBongRepository;
    public PhieuThanhToanDoiBong save(PhieuThanhToanDoiBong phieuThanhToanDoiBong){
        return phieuThanhToanDoiBongRepository.save(phieuThanhToanDoiBong);
    }

    public Optional<PhieuThanhToanDoiBong> getById(Integer id){
        return phieuThanhToanDoiBongRepository.findById(id);
    }
}
