package com.example.thanhtoantienbqthok.HopDongTruyenHinh;

import com.example.thanhtoantienbqthok.HopDongTranDau.HopDongTranDau;
import com.example.thanhtoantienbqthok.TranDauDoiBong.TranDauDoiBong;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tblhopdongtruyenhinh")
public class HopDongTruyenHinh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten", nullable = false)
    String ten;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "hopDongTruyenHinh",fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    Set<HopDongTranDau> listHopDongTranDau;
}
