 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI2_ToanTu_CauLenhReNhanh;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class B8_ToanTuBaNgoi {

    /*
       Cách sử dụng:
        <Biểu thức> ? <Giá trị true> : <Giá trị false>;
        <Biểu thức>: Có thể có 1 hoặc nhiều biểu thức
        <Giá trị true>: Luôn nằm sau dấu ? và phụ thuộc vào kiểu dữ liệu của biến.
        <Giá trị false>: Luôn nằm sau dấu :    
     */
    public static void main(String[] args) {
        //Ví dụ 1 mệnh đề toán tử 3 ngôi
        if (5 == 3) {
            System.out.println("Đúng");
        } else {
            System.out.println("Sai");
        }
        String kq = (5 == 3) ? "Đúng" : "Đúng";
        int kq1 = (5 == 3) ? 1 : 0;
        boolean kq2 = (5 == 3) ? true : false;
        System.out.println(kq);
        //Trong toán tử 3 ngôi có thể có nhiều mệnh đề
        int nghi = 5;
        double diemThi = 5, gpa = 5;
        String result = (nghi <= 4 && diemThi >= 5 && gpa >= 5) ? "Qua môn" : "Toạch";
        System.out.printf(result);

        //Toán tử 3 ngôi so sánh với câu lệnh IF ELSE
        //Ví dụ nhập nam và nữ
        Scanner sc = new Scanner(System.in);
        String kqNamNu, input;
        System.out.println("Mời bạn nhập giưới Tính 0 NỮ - 1Nam");
        input = sc.nextLine();
        if (input.equals("1")) {
            System.out.println("Chào bạn nam");
        } else if (input.equals("0")) {
            System.out.println("Chào bạn nữ");
        } else {
            System.out.println("Chào bạn N/A");
        }

        //Cách giải bằng toán tử 3 ngôi
        kqNamNu = input.equals("1") ? "Chào bạn nam" : "Chào bạn nữ";
        System.out.println(kqNamNu);
    }
}
