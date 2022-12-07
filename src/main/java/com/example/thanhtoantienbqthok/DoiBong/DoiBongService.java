package com.example.thanhtoantienbqthok.DoiBong;

import com.example.thanhtoantienbqthok.HopDongTranDau.HopDongTranDauRepository;
import com.example.thanhtoantienbqthok.PhieuThanhToanDoiBong.PhieuThanhToanDoiBongRepository;
import com.example.thanhtoantienbqthok.TranDauDoiBong.TranDauDoiBong;
import com.example.thanhtoantienbqthok.TranDauDoiBong.TranDauDoiBongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DoiBongService {
    @Autowired DoiBongRepository doiBongRepository;

    @Autowired
    HopDongTranDauRepository hopDongTranDauRepository;

    public Iterable<DoiBong> getAll (){
        return doiBongRepository.findAll();
    }

    public List<DoiBong> listAll() {
        return (List<DoiBong>) doiBongRepository.findAll();
    }
    public Optional<DoiBong> getById(Integer id) {
        return doiBongRepository.findById(id);
    }

    public Float getGiaTienByDoiBongId(Integer id) {
        return hopDongTranDauRepository.findGiaTienByDoiBongId(id);
    }
//    public float getAllTranDauDoiBongByDoiBongId(Integer id){
//        return tranDauDoiBongRepository.findAllById(id);
//    }

}
