/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI3_VongLap;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class B5_BaiTap_BangCuuChuong {

    /*
    Viết 1 chương trình cho phép người dùng nhập vào 1 bảng cửu
    chương sau đó in ra màn hình bằng 3 kiểu vòng lặp.
     */
    public static void main(String[] args) {
        /*
            8 x 1 = 8
            8 x 2 = 16
            ....
            8 x 10 = 80
         */

        //Cách 1: For
        int a = 8;
//        for (int i = 1; i <= 10; i++) {
//            System.out.printf("%d x %d = %d \n",a,i,a*i);
//        }

        //Cách 2: While
//        int i = 1;
//        while (i <= 10) {
//             System.out.printf("%d x %d = %d \n",a,i,a*i);
//            i++;
//        }

        //Cách 3: do while
        int i = 1;
        do {
            System.out.printf("%d x %d = %d \n", a, i, a * i);
            i++;
        } while (i <= 10);

    }
}
