package BAI7_BieuThucChinhQuy_XuLyChuoi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DungNAPC
 */
public class Main {

    public static void main(String[] args) {
        String name = "     FPT POLY";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.charAt(5));
        String name1 = "Vi Hoàng Vân";
        String[] arrWord = name1.split("\\s");//ĐIều kiện để cắt chuỗi thành mảng
        for (String x : arrWord) {
            System.out.println(x);
        }
        System.out.println(name1.substring(3, name1.length()));
        //Viết 1 chương trình VI HOANG VAN --> Vi Hoang Van
    }
}
