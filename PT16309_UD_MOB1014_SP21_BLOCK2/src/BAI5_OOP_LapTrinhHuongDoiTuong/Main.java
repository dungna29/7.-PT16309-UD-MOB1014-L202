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
public class Main {
    public static void main(String[] args) {
        //Phần 1: Phương thức không trả về
        /*
        1.1 Cách sử dụng phương thức không trả về không tham số
            - Cần biết tên phương thức và nơi chứa phương thức.
            - Khi gọi phương thức kết thức ();
        */
        B2_Method_PhuongThucKhongTraVe b2 = new B2_Method_PhuongThucKhongTraVe();
        b2.tinhTong();
        
        /*
        1.2 Cách sử dụng phương thức không trả về có tham số
            - Truyền đủ tham số và đúng kiểu dữ liệu
            - Truyền đúng vị trí của tham số
            - Không được truyền thiếu tham số
        KHI SỬ DỤNG NẠP CHỒNG PHƯƠNG THỨC SỐ LƯỢNG THAM SỐ SẼ QUYẾT ĐỊNH VÀO PHƯƠNG THỨC NÀO
        */
        //b2.tinhTong(5);Không truyền đủ tham số
        b2.tinhTong(5,5);
        b2.tinhTong(5,5,5);

    }
}
