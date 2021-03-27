/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_NHAP_XUAT_OOP1;

/**
 *
 * @author Dungna29
 */
public class SinhVien {
    private String ten;
    private String msv;
    private int namSinh;
    private double diemJava;

    public SinhVien() {
    }

    public SinhVien(String ten, String msv, int namSinh, double diemJava) {
        this.ten = ten;
        this.msv = msv;
        this.namSinh = namSinh;
        this.diemJava = diemJava;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }


    void inRaManHinh(){
        System.out.printf("Tên: %s Mã SV: %s Tuổi: %d Điểm: %f \n",ten,msv,2021 - namSinh,diemJava);
    }
}
