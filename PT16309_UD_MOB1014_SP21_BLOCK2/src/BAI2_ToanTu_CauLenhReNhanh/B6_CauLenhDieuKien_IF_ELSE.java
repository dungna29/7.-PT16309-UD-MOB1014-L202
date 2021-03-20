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
public class B6_CauLenhDieuKien_IF_ELSE {

    /*
        Bài số 6: Câu lệnh điều kiện IF ELSE (NẾU THÌ)
        Định nghĩa: Thực hiện 1 hành động khi thỏa mãn IF(TRUE) và nếu không thỏa mãn IF
        thì sẽ luôn vào ELSE.
        if (true) {
            Thực hiện 1 hành động nếu thỏa mãn điều kiện của IF
        }else{
            Tất cả các trường hợp không thỏa mãn IF sẽ vào ELSE
            Thực hiện 1 hành động nào đó.
        }
    
     */
    public static void main(String[] args) {
        //Bước 1: Xác định thư viện dùng và biến cần khai báo
//        Scanner sc = new Scanner(System.in);
//        byte nghi;
//        //Bước 2: Lấy dữ liệu từ bàn phím
//        System.out.print("Mời bạn nhập số buổi nghỉ vào: ");
//        nghi = sc.nextByte();//Gán giá trị cho biến được khởi tạo ở trên
        //Bước 3: Xử lý nghiệp vụ
//        if (nghi <= 4) {
//            System.out.println("Chúc mừng bạn nên nghỉ thêm");
//        } else {
//            System.out.println("Chúc mừng đã mất 700");
//        }


        /*
            Viết 1 chương trình cho phép nhập điểm THI JAVA
            9 - 10 = Xuất sắc
            8 - 9 = Giỏi
            7 - 8 = khá
            5 - 7 = trung bình
            0 - 5 = Học lại
        Không sử dụng If thường, Không dùng return, Không Esle IF.
        Chỉ được dùng IF ELSE
         */
        Scanner sc = new Scanner(System.in);
        double diemJava;
        System.out.print("Mời bạn nhập điểm: ");
        diemJava = Double.parseDouble(sc.nextLine());
        if (diemJava >= 9 && diemJava <= 10) {
            System.out.println("Xuất sắc");
        } else {
            if (diemJava >= 8 && diemJava < 9) {
                System.out.println("Giỏi");
            } else {
                if (diemJava >= 7 && diemJava < 8) {
                    System.out.println("Khá");
                } else {
                    if (diemJava >= 5 && diemJava < 7) {
                        System.out.println("Trung bình");
                    } else {
                        System.out.println("Học lại");
                    }
                }
            }
        }

    }

}
