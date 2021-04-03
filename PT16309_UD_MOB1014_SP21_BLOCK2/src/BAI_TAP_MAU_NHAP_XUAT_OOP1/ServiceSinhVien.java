/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_NHAP_XUAT_OOP1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class ServiceSinhVien {

    SinhVien[] _arrSinhViens;
    Scanner _sc = new Scanner(System.in);
    List<SinhVien> _lstSinhViens = new ArrayList<>();
    SinhVien _sv;

    public ServiceSinhVien() {
    }

    //Bài 1: Tạo 2 đối tượng sinh viên bằng 2 cách COntructor có tham số và ngược lại
    void bai1Tao2DoiTuongSVBangContructor() {
        //Cách 1: Contrcutor có tham số
        SinhVien sv1 = new SinhVien("Long", "PH00111", 2000, 5.6);
        //Cách 2: Contructor không tham số
        SinhVien sv2 = new SinhVien();
        sv2.setTen("Hoàng");
        sv2.setMsv("Hoàng");
        sv2.setNamSinh(2001);
        sv2.setDiemJava(9.6);

        //In ra màn hình
        sv1.inRaManHinh();
        sv2.inRaManHinh();
    }

    //Bài 2: Tạo 1 đối tượng do người dùng nhập
    void bai2Tao1DoiTuongSvDoNguoiDungNhap() {
        SinhVien sv1 = new SinhVien();
        System.out.println("Mời bạn nhập Tên: ");
        sv1.setTen(_sc.nextLine());
        System.out.println("Mời bạn nhập Mã SV: ");
        sv1.setMsv(_sc.nextLine());
        System.out.println("Mời bạn nhập Năm Sinh: ");
        sv1.setNamSinh(Integer.parseInt(_sc.nextLine()));
        System.out.println("Mời bạn nhập Điểm: ");
        sv1.setDiemJava(Double.parseDouble(_sc.nextLine()));

        sv1.inRaManHinh();
    }

    //Bài 3: Sử dụng Array SinhVien
    void bai3Tao1MangSinhVien() {
        int size;
        System.out.println("Mời bạn nhập số lượng SV: ");
        size = Integer.parseInt(_sc.nextLine());
        //Khởi tạo mảng SinhVien sau khi người dùng nhập
        _arrSinhViens = new SinhVien[size];
        for (int i = 0; i < _arrSinhViens.length; i++) {
            _arrSinhViens[i] = new SinhVien();//Phải khởi tạo đối tượng trong mảng theo index
            System.out.println("Mời bạn nhập Tên: ");
            _arrSinhViens[i].setTen(_sc.nextLine());
            System.out.println("Mời bạn nhập Mã SV: ");
            _arrSinhViens[i].setMsv(_sc.nextLine());
            System.out.println("Mời bạn nhập Năm Sinh: ");
            _arrSinhViens[i].setNamSinh(Integer.parseInt(_sc.nextLine()));
            System.out.println("Mời bạn nhập Điểm: ");
            _arrSinhViens[i].setDiemJava(Double.parseDouble(_sc.nextLine()));
        }
    }

    void inRaManHinhArraySinhVien() {
        for (int i = 0; i < _arrSinhViens.length; i++) {
            _arrSinhViens[i].inRaManHinh();
        }
    }

    void themSinhVienList() {
        int size;
        System.out.println("Mời bạn nhập số lượng SV: ");
        size = Integer.parseInt(_sc.nextLine());
        for (int i = 0; i < size; i++) {
            _sv = new SinhVien();
            System.out.println("Mời bạn nhập Tên: ");
            _sv.setTen(_sc.nextLine());
            System.out.println("Mời bạn nhập Mã SV: ");
            _sv.setMsv(_sc.nextLine());
            System.out.println("Mời bạn nhập Năm Sinh: ");
            _sv.setNamSinh(Integer.parseInt(_sc.nextLine()));
            System.out.println("Mời bạn nhập Điểm: ");
            _sv.setDiemJava(Double.parseDouble(_sc.nextLine()));
            _lstSinhViens.add(_sv);//Thêm đối tượng sau vòng chạy vào trong List
        }
    }

    void themSinhVienList1() {
        int size;
        size = Integer.parseInt(getInputValue("số lượng: "));
        for (int i = 0; i < size; i++) {
            _sv = new SinhVien();
            _sv.setTen(getInputValue("nhập tên: "));
            _sv.setMsv(getInputValue("nhập mã: "));
            _sv.setNamSinh(Integer.parseInt(getInputValue("nhập ns: ")));
            _sv.setDiemJava(Double.parseDouble(getInputValue("nhập điểm: ")));
            _lstSinhViens.add(_sv);//Thêm đối tượng sau vòng chạy vào trong List
        }
    }
    //Đây là phương thức giúp các bạn lười trong lập trình
    String getInputValue(String text) {
        System.out.println("Mời bạn nhập " + text);
        return _sc.nextLine();
    }

    void getListSinhVien() {
        for (int i = 0; i < _lstSinhViens.size(); i++) {
            _lstSinhViens.get(i).inRaManHinh();
        }
    }
}
