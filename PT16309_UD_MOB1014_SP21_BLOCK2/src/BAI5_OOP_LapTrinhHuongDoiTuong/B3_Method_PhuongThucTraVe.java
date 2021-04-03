package BAI5_OOP_LapTrinhHuongDoiTuong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dungna29
 */
public class B3_Method_PhuongThucTraVe {

    /*
         * Method trả về công thức và định nghĩa ở bên B2
         *
         * Định nghĩa: Hàm trả về bắt buộc phải trả về 1 giá trị hoặc 1 tập giá trị, 
           đối tượng.... tương ứng với kiểu dữ liệu của hàm.
     */
    Scanner _sc = new Scanner(System.in);

    //Phường thức trả về không tham số
    public int tinhTong() {
        int a, b;
        System.out.println("Mời bạn nhập số thứ 1: ");
        a = Integer.parseInt(_sc.nextLine());
        System.out.println("Mời bạn nhập số thứ 2: ");
        b = Integer.parseInt(_sc.nextLine());
       return a + b;//Phải trả về đsung kiểu dữ liệu
    }
    
    //Phương thức trả về dạng mảng
    public String[] getYears(){
        //Tạo 1 mảng 200 năm dạng String để in ra màn hình từ năm 1900
        String[] arrYears = new String[200];
        int temp = 1900;
        for (int i = 0; i <= arrYears.length; i++) {
            arrYears[i] = String.valueOf(temp);// String.valueOf đưa số nguyên về String
            temp++;
        }    
        return arrYears;
    }
    //Phương thức trả về dạng đối tượng
    public SinhVien getSV(){
        SinhVien sv = new SinhVien("Long", "PH0000", "0123456", 9);
        return sv;
    }
    //Phường thức trả về có tham số tương tự như bên void
}
