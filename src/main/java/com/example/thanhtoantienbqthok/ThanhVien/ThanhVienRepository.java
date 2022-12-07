package com.example.thanhtoantienbqthok.ThanhVien;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ThanhVienRepository extends CrudRepository<ThanhVien, Integer> {
    public Optional<ThanhVien> findByUsername(String username);
}
