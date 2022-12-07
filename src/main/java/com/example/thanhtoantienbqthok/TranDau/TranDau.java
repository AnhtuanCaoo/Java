package com.example.thanhtoantienbqthok.TranDau;

import com.example.thanhtoantienbqthok.HopDongTranDau.HopDongTranDau;
import com.example.thanhtoantienbqthok.PhieuThanhToanDoiBong.PhieuThanhToanDoiBong;
import com.example.thanhtoantienbqthok.TranDauDoiBong.TranDauDoiBong;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tbltrandau")
public class TranDau {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten", nullable = false)
    public
    String ten;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "tranDau",fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    Set<TranDauDoiBong> listTranDauDoiBong;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "tranDau",fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    public
    Set<HopDongTranDau> listHopDongTranDau;
}
