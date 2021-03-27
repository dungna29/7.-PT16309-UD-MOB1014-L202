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
public class Main {

    public static void main(String[] args) {
        //Muốn chạy chức năng gọi đến Class ServiceSinhVien
        ServiceSinhVien serviceSinhVien = new ServiceSinhVien();
        serviceSinhVien.tao2SVao();
        serviceSinhVien.tao1SinhVienDoNguoiDung();
    }
}
