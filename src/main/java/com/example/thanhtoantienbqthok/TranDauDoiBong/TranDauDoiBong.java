package com.example.thanhtoantienbqthok.TranDauDoiBong;

import com.example.thanhtoantienbqthok.DoiBong.DoiBong;
import com.example.thanhtoantienbqthok.PhieuThanhToanDoiBong.PhieuThanhToanDoiBong;
import com.example.thanhtoantienbqthok.SanDau.SanDau;
import com.example.thanhtoantienbqthok.ThanhVien.ThanhVien;
import com.example.thanhtoantienbqthok.TranDau.TranDau;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "tbltrandaudoibong")
public class TranDauDoiBong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "thoi_gian", nullable = false)
    Date thoiGian;

    @Column(name = "so_luong_khan_gia", nullable = false)
    Integer soLuongKhanGia;

    @ManyToOne
    @JoinColumn(name = "tbl_phieu_thanh_toan_doi_bong_id")
    PhieuThanhToanDoiBong phieuThanhToanDoiBong;

    @ManyToOne
    @JoinColumn(name = "tbl_tran_dau_id")
    public
    TranDau tranDau;

    @ManyToOne
    @JoinColumn(name = "tbl_doi_bong_id")
    DoiBong doiBong;

    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "tbl_san_dau_id")

    private SanDau sanDau;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Date thoiGian) {
        this.thoiGian = thoiGian;
    }

    public Integer getSoLuongKhanGia() {
        return soLuongKhanGia;
    }

    public void setSoLuongKhanGia(Integer soLuongKhanGia) {
        this.soLuongKhanGia = soLuongKhanGia;
    }

    public PhieuThanhToanDoiBong getPhieuThanhToanDoiBong() {
        return phieuThanhToanDoiBong;
    }

    public void setPhieuThanhToanDoiBong(PhieuThanhToanDoiBong phieuThanhToanDoiBong) {
        this.phieuThanhToanDoiBong = phieuThanhToanDoiBong;
    }

    public TranDau getTranDau() {
        return tranDau;
    }

    public void setTranDau(TranDau tranDau) {
        this.tranDau = tranDau;
    }

    public DoiBong getDoiBong() {
        return doiBong;
    }

    public void setDoiBong(DoiBong doiBong) {
        this.doiBong = doiBong;
    }

    public SanDau getSanDau() {
        return sanDau;
    }

    public void setSanDau(SanDau sanDau) {
        this.sanDau = sanDau;
    }
}
