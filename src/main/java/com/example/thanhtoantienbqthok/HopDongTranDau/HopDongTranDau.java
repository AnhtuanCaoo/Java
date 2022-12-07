package com.example.thanhtoantienbqthok.HopDongTranDau;

import com.example.thanhtoantienbqthok.BanToChuc.BanToChuc;
import com.example.thanhtoantienbqthok.HopDongTruyenHinh.HopDongTruyenHinh;
import com.example.thanhtoantienbqthok.PhieuThanhToanDoiBong.PhieuThanhToanDoiBong;
import com.example.thanhtoantienbqthok.TranDau.TranDau;

import javax.persistence.*;

@Entity
@Table(name = "tblhopdongtrandau")
public class HopDongTranDau {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "gia_tien", nullable = false)
    public
    Float giaTien;

    @Column(name = "ngay_thanh_toan", nullable = false)
    public
    String ngayThanhToan;

    public Float getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(Float giaTien) {
        this.giaTien = giaTien;
    }

    @ManyToOne
    @JoinColumn(name = "tbl_tran_dau_id")
    TranDau tranDau;

    @ManyToOne
    @JoinColumn(name = "tbl_hop_dong_truyen_hinh_id")
    HopDongTruyenHinh hopDongTruyenHinh;

    @ManyToOne
    @JoinColumn(name = "tbl_phieu_thanh_toan_doi_bong_id")
    PhieuThanhToanDoiBong phieuThanhToanDoiBong;
}
