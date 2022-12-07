package com.example.thanhtoantienbqthok.DoiBong;

public class DoiBongOne {
    private Integer id;

    String ten;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    float total;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    public DoiBongOne(Integer id, String ten, float total) {
        this.id = id;
        this.ten = ten;
        this.total = total;

    }
    @Override
    public String toString() {
        return "DoiBongOne{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", total='" + total + '\'' +
                '}';
    }
}
