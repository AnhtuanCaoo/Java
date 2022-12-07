package com.example.thanhtoantienbqthok.ThanhVien;


import com.example.thanhtoantienbqthok.BanToChuc.BanToChuc;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tblthanhvien")
public class ThanhVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username", nullable = false)
    String username;

    @Column(name = "password", nullable = false)
    String password;

    @Column(name = "sdt")
    String sdt;

    @Column(name = "ho_ten")
    String hoTen;

    @Column(name = "dia_chi")
    String diaChi;

    @OneToOne(mappedBy = "thanhVien", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private BanToChuc banToChuc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public BanToChuc getBanToChuc() {
        return banToChuc;
    }

    public void setBanToChuc(BanToChuc banToChuc) {
        this.banToChuc = banToChuc;
    }
}
