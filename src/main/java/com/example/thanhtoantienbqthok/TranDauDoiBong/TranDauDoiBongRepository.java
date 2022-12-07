package com.example.thanhtoantienbqthok.TranDauDoiBong;

import com.example.thanhtoantienbqthok.TranDau.TranDau;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface TranDauDoiBongRepository extends CrudRepository<TranDauDoiBong, Integer> {
    public Optional<List<TranDauDoiBong>> findTranDauDoiBongByDoiBongId(Integer id);

}