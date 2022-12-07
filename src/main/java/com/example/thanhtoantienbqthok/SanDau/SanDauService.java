package com.example.thanhtoantienbqthok.SanDau;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SanDauService {
    @Autowired SanDauRepository sanDauRepository;
    public Optional<SanDau> getById(Integer id){
        return sanDauRepository.findById(id);
    }
}
