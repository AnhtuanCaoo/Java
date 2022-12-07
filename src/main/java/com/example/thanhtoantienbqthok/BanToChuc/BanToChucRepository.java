package com.example.thanhtoantienbqthok.BanToChuc;

import com.example.thanhtoantienbqthok.TranDauDoiBong.TranDauDoiBong;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BanToChucRepository extends CrudRepository<BanToChuc, Integer> {

}
