package com.example.thanhtoantienbqthok.DoiBong;

import com.example.thanhtoantienbqthok.TranDauDoiBong.TranDauDoiBong;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tbldoibong")
public class DoiBong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten", nullable = false)
    String ten;

    @Column(name = "trang_phuc", nullable = false)
    String trangPhuc;

    @Column(name = "dia_chi", nullable = false)
    String diaChi;

    @Column(name = "diem", nullable = false)
    Integer diem;

    @Column(name = "trang_thai", nullable = false)
    String trangThai;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "doiBong",fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    Set<TranDauDoiBong> listTranDauDoiBong;

    public Integer getId() {
        return id;
    }

    public DoiBong() {
    }

    public DoiBong(String ten, String trangPhuc, String diaChi, Integer diem, String trangThai) {
        this.ten = ten;
        this.trangPhuc = trangPhuc;
        this.diaChi = diaChi;
        this.diem = diem;
        this.trangThai = trangThai;
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

    public String getTrangPhuc() {
        return trangPhuc;
    }

    public void setTrangPhuc(String trangPhuc) {
        this.trangPhuc = trangPhuc;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Integer getDiem() {
        return diem;
    }

    public void setDiem(Integer diem) {
        this.diem = diem;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public Set<TranDauDoiBong> getListTranDauDoiBong() {
        return listTranDauDoiBong;
    }

    public void setListTranDauDoiBong(Set<TranDauDoiBong> listTranDauDoiBong) {
        this.listTranDauDoiBong = listTranDauDoiBong;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}
