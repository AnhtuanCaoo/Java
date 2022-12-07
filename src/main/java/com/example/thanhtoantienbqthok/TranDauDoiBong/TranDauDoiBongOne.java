package com.example.thanhtoantienbqthok.TranDauDoiBong;

public class TranDauDoiBongOne {
    private Integer id;

    String ten;

    String ngayThanhToan;
    float sotien;

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

    public float getSotien() {
        return sotien;
    }

    public void setSotien(float sotien) {
        this.sotien = sotien;
    }
    public TranDauDoiBongOne(Integer id, String ten,String ngayThanhToan, float sotien) {
        this.id = id;
        this.ten = ten;
        this.ngayThanhToan = ngayThanhToan;
        this.sotien = sotien;
    }
    @Override
    public String toString() {
        return "TranDauDoiBongOne{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", sotien='" + sotien + '\'' +
                '}';
    }
}
