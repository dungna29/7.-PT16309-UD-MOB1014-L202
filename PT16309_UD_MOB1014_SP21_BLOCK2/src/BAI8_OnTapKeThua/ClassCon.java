/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI8_OnTapKeThua;

/**
 *
 * @author Dungna29
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
    
    
}
