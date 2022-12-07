package com.example.thanhtoantienbqthok.HopDongTranDau;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HopDongTranDauRepository extends CrudRepository<HopDongTranDau, Integer> {

    @Query(value = "select sum(t.giaTien) from HopDongTranDau t join TranDau td on t.tranDau.id = td.id join TranDauDoiBong tddb on td.id = tddb.tranDau.id join DoiBong db on db.id = tddb.doiBong.id where db.id = ?1 group by db.id")
    Float findGiaTienByDoiBongId(Integer doiBongId);

    @Query(value = "select sum(t.giaTien) from HopDongTranDau t join TranDau td on t.tranDau.id = td.id join TranDauDoiBong tddb on td.id = tddb.tranDau.id where tddb.id = ?1 group by tddb.id")
    Float sumGiaTienByTDDBId(Integer id);
}
