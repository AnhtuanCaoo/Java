package com.example.thanhtoantienbqthok.SanDau;

import com.example.thanhtoantienbqthok.BanToChuc.BanToChuc;
import com.example.thanhtoantienbqthok.TranDauDoiBong.TranDauDoiBong;

import javax.persistence.*;

@Entity
@Table(name = "tblsandau")
public class SanDau {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten", nullable = false)
    String ten;

    @Column(name = "suc_chua", nullable = false)
    String sucChua;

    @Column(name = "dia_chi", nullable = false)
    String diaChi;

    public String getTen() {
        return ten;
    }
}
