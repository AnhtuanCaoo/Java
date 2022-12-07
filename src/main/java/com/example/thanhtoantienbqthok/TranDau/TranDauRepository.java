package com.example.thanhtoantienbqthok.TranDau;
import com.example.thanhtoantienbqthok.HopDongTranDau.HopDongTranDau;
import com.example.thanhtoantienbqthok.TranDauDoiBong.TranDauDoiBong;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TranDauRepository extends CrudRepository<TranDau, Integer> {
    public Optional<TranDau> getById(Integer id);

}