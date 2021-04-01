/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI5_OOP_LapTrinhHuongDoiTuong;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class B2_Method_PhuongThucKhongTraVe {

    Scanner _sc = new Scanner(System.in);

    /*
         *  Bài Phương thức - Method
         *  Định nghĩa: 1 tập các câu lệnh cùng nhau thực hiện 1 tác vụ nào đó.
         *  LỢI ÍCH: - Giúp quản lý code tốt hơn
         *           - Tái sử dụng
         *
         *  Công thức chung:
         *  <Phạm vi truy cập> <Kiểu trả về> <Tên phương thức> (<Danh sách tham số>)
         *  {
         *          Body code
         *  }
         * <Phạm vi truy cập> - Access Modifier:Public,Private,Protected, Default
         *
         * <Kiểu trả về> : có 2 kiểu trả về và không trả về
         *          - Kiểu không trả về: void
         *          - Kiểu trả về: là giá trị(int,string,double....) hoặc tập giá trị(Array,List.....) 
                    hoặc đối tượng(class) và còn nhiều kiểu khác.
         *
         * <Tên phương thức>: Tên động từ viết thường + tên hàm viết hóa chữ cái đầu của từ
         * <Danh sách tham số>: Phương thức có thể có tham hoặc không tham số và lưu ý khi sử dụng tham số 
           thì khi gọi phương thức thì phải truyền đúng vị trí của tham số.
     */
    //Phần 1: Phương thức không trả về không tham số
    public void tinhTong() {//() không tham số
        int a, b;
        System.out.println("Mời bạn nhập số thứ 1: ");
        a = Integer.parseInt(_sc.nextLine());
        System.out.println("Mời bạn nhập số thứ 2: ");
        b = Integer.parseInt(_sc.nextLine());
        System.out.println("Tổng 2 số: " + (a + b));
    }
    //Phần 2: Phương thức không trả về có tham số
    //Không được đặt tên phương thức trùng với tên phương thức khác và kiểu phương thức
    //    public void tinhTong(){
    //        
    //    }

    //ĐỌC TÍNH ĐA HÌNH --> NẠP CHỒNG PHƯƠNG THỨC
    public void tinhTong(int a, int b) {
        System.out.println("Tổng 2 số: " + (a + b));
    }

    public void tinhTong(int a, int b, int c) {
        System.out.println("Tổng 3 số: " + (a + b + c));
    }

    public void tinhTong(int a, int b, int c, int d) {
        System.out.println("Tổng 3 số: " + (a + b + c + d));
    }
    
    //Có thể truyền rất nhiều kiểu dữ liệu khác nhau vào phương thức
    public void method1(int[] arrNumber,SinhVien sv
            ,List<SinhVien> lstSinhVIen,String name){
            //Body code
    }

}
