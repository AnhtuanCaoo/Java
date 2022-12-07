package com.example.thanhtoantienbqthok.BanToChuc;

import com.example.thanhtoantienbqthok.PhieuThanhToanDoiBong.PhieuThanhToanDoiBong;
import com.example.thanhtoantienbqthok.ThanhVien.ThanhVien;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tblbantochuc")
public class BanToChuc {
    @Id
    @Column(name = "tbl_thanh_vien_id")
    private Integer id;

    @Column(name = "ten", nullable = false)
    String ten;
    @Column(name = "mo_ta", nullable = false)
    String moTa;

    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @MapsId
    @JoinColumn(name = "tbl_thanh_vien_id")
    private ThanhVien thanhVien;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "banToChuc",fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    Set<PhieuThanhToanDoiBong> listPhieuThanhToanDoiBong;

    public Set<PhieuThanhToanDoiBong> getListPhieuThanhToanDoiBong() {
        return listPhieuThanhToanDoiBong;
    }

    public void setListPhieuThanhToanDoiBong(Set<PhieuThanhToanDoiBong> listPhieuThanhToanDoiBong) {
        this.listPhieuThanhToanDoiBong = listPhieuThanhToanDoiBong;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public ThanhVien getThanhVien() {
        return thanhVien;
    }

    public void setThanhVien(ThanhVien thanhVien) {
        this.thanhVien = thanhVien;
    }

//    public BanToChuc(Integer id, String ten, String moTa, ThanhVien thanhVien) {
//        this.id = id;
//        this.ten = ten;
//        this.moTa = moTa;
//        this.thanhVien = thanhVien;
//    }
}
