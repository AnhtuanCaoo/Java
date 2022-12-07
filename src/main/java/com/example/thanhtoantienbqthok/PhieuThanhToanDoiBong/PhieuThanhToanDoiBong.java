package com.example.thanhtoantienbqthok.PhieuThanhToanDoiBong;

import com.example.thanhtoantienbqthok.BanToChuc.BanToChuc;
import com.example.thanhtoantienbqthok.DoiBong.DoiBong;
import com.example.thanhtoantienbqthok.TranDauDoiBong.TranDauDoiBong;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tblphieuthanhtoandoibong")
public class PhieuThanhToanDoiBong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten", nullable = false)
    String ten;

    @Column(name = "ngay_thanh_toan", nullable = false)
    String ngayThanhToan;
    @ManyToOne
    @JoinColumn(name = "tbl_ban_to_chuc_id")
    BanToChuc banToChuc;

    @ManyToOne
    @JoinColumn(name = "doi_bong_id")
    DoiBong doiBong;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "phieuThanhToanDoiBong",fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    Set<TranDauDoiBong> listTranDauDoiBong;

    public PhieuThanhToanDoiBong() {

    }

    public BanToChuc getBanToChuc() {
        return banToChuc;
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

    public DoiBong getDoiBong() {
        return doiBong;
    }

    public void setDoiBong(DoiBong doiBong) {
        this.doiBong = doiBong;
    }

    public PhieuThanhToanDoiBong(String ten, BanToChuc banToChuc, DoiBong doiBong ,String ngayThanhToan) {
        this.ten = ten;
        this.banToChuc = banToChuc;
        this.doiBong = doiBong;
        this.ngayThanhToan = ngayThanhToan;
    }


    public void setBanToChuc(BanToChuc banToChuc) {
        this.banToChuc = banToChuc;
    }
}
