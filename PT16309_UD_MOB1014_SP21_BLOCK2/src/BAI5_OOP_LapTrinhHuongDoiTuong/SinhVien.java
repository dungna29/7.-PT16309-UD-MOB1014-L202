/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI5_OOP_LapTrinhHuongDoiTuong;

/**
 *
 * @author Dungna29
 */
public class SinhVien {//PHải viết hoa chữ cái đầu của từ 
    //Phần 1: Khai báo tất cả các thuộc tính(Thông tin) mà đối tượng phải có

    private String ten;
    private String msv;
    private String sdt;
    private int ns;

    //Phần 2: Contructor - Hàm tạo: Là nơi chạy vào đầu tiên khi khởi tạo đối tượng
    //Phần 2.1 Contructor không tham số = alt + insert ->Contructor
    public SinhVien() {
        System.out.println("Đây là text in ra từ Contructor không tham số");
    }

    //Phần 2.2 Contructor có tham số = alt + insert --> Select ALL ->Contructor
    public SinhVien(String ten, String msv, String sdt, int ns) {
        this.ten = ten;
        this.msv = msv;
        this.sdt = sdt;
        this.ns = ns;
    }

    //Phần 3: Getter và Setter
    //Khi các thuộc tính private thì phải sử dụng Getter và Setter để lấy và gán giá trị
    //Alt + Insert --> Getter và Setter
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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getNs() {
        return ns;
    }

    public void setNs(int ns) {
        this.ns = ns;
    }

    //Phần 4: Các phương thức của đối tượng
    void inThongTinSinhVien() {
        System.out.printf("%s + %s + %s + %d FPOLY \n ", msv, ten, sdt, ns);
    }

}
