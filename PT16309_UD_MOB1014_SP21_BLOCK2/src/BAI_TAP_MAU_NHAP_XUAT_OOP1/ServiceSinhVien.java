/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_NHAP_XUAT_OOP1;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class ServiceSinhVien {
    Scanner sc = new Scanner(System.in);
    SinhVien sv;
    public ServiceSinhVien() {
    }
    
    void tao2SVao(){
        //1. Tạo bằng contructor có tham số:
        SinhVien sv1 = new SinhVien("Thắng", "PH00555", 2000, 5.6);
        
        //2. Tạo bằng contructor không tham số
        SinhVien sv2 = new SinhVien();
        sv2.setTen("Hoàng");
        sv2.setMsv("PH00556");
        sv2.setNamSinh(2001);
        sv2.setDiemJava(7.6);
        
        //Sử dụng phương thức để in ra màn hình
        sv1.inRaManHinh();
        sv2.inRaManHinh();
    }
    
    void tao1SinhVienDoNguoiDung(){
        sv = new SinhVien();
        System.out.println("Mời bạn nhập tên: ");
        sv.setTen(sc.nextLine());
        System.out.println("Mời bạn nhập mã: ");
        sv.setMsv(sc.nextLine());
        System.out.println("Mời bạn nhập năm sinh: ");
        sv.setNamSinh(Integer.parseInt(sc.nextLine()));
        System.out.println("Mời bạn nhập điểm: ");
        sv.setDiemJava(Double.parseDouble(sc.nextLine()));
        sv.inRaManHinh();
    }
}
