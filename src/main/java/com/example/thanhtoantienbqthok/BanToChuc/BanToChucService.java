package com.example.thanhtoantienbqthok.BanToChuc;

import com.example.thanhtoantienbqthok.DoiBong.DoiBong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BanToChucService {
    @Autowired BanToChucRepository banToChucRepository;
    public Optional<BanToChuc> getById(Integer id) {
        return banToChucRepository.findById(id);
    }
}
