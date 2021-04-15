/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI9_Abstract;

import BAI8_OnTapKeThua.*;

/**
 *
 * @author Dungna29
 */
  /*
        - Khi lớp con kế thừa lớp cha là AbstractClass 
        thì lớp con phải kế thừa bắt buộc các phương thức Abstract
        nếu không thì sẽ lỗi.
    */
public class ClassCon extends ClassCha{
    private String thuocTinhCon1;
    private String thuocTinhCon2;

    public ClassCon() {
    }

    public ClassCon(String thuocTinhCon1, String thuocTinhCon2, String thuocTinhCha1, String thuocTinhCha2) {
        super(thuocTinhCha1, thuocTinhCha2);
        this.thuocTinhCon1 = thuocTinhCon1;
        this.thuocTinhCon2 = thuocTinhCon2;
    }

    public String getThuocTinhCon1() {
        return thuocTinhCon1;
    }

    public void setThuocTinhCon1(String thuocTinhCon1) {
        this.thuocTinhCon1 = thuocTinhCon1;
    }

    public String getThuocTinhCon2() {
        return thuocTinhCon2;
    }

    public void setThuocTinhCon2(String thuocTinhCon2) {
        this.thuocTinhCon2 = thuocTinhCon2;
    }

    @Override
    public void methodCha2() {
        super.methodCha2(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void methodCha1() {
        super.methodCha1(); //To change body of generated methods, choose Tools | Templates.
    }

     /*
        - Kế thừa phương thức của lớp cha mà cha cho phép
        - Khi kế thừa chính là hành động ghi đè phương thức của lớp cha
        - Khi kế thừa phương thức Abstract thì phương thức được
    kế thừa sẽ có body code.
    */
    @Override
    public void methodCha3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int methodCha4(int a, int b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
