/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI6_OOP_KeThua;

/**
 *
 * @author Dungna29
 *
 */
/*
    1. Đưa thuộc tính chung lên lớp cha
    2. Lớp cha cũng là 1 lớp đối tượng thông thường
 */
public class Person {

    private String ho;
    private String tenDem;
    private String ten;
    private String namSinh;

    public Person() {
    }

    public Person(String ho, String tenDem, String ten, String namSinh) {
        this.ho = ho;
        this.tenDem = tenDem;
        this.ten = ten;
        this.namSinh = namSinh;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTenDem() {
        return tenDem;
    }

    public void setTenDem(String tenDem) {
        this.tenDem = tenDem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    void inRaManHinh() {
        System.out.println("Đây là phương thức inRaManHinh() ở Class Person");
    }
}
