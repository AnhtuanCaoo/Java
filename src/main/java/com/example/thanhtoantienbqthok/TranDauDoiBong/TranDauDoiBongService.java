package com.example.thanhtoantienbqthok.TranDauDoiBong;

import com.example.thanhtoantienbqthok.DoiBong.DoiBong;
import com.example.thanhtoantienbqthok.TranDau.TranDau;
import com.example.thanhtoantienbqthok.TranDau.TranDauRepository;
import com.example.thanhtoantienbqthok.TranDauDoiBong.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TranDauDoiBongService {
    @Autowired TranDauDoiBongRepository tranDauDoiBongRepository;
    public Optional<List<TranDauDoiBong>> getByDoiBongId(Integer id) {
        return tranDauDoiBongRepository.findTranDauDoiBongByDoiBongId(id);
    }


}
