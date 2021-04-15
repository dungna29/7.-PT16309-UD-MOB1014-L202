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
public class ClassChau extends ClassCon{
    private String thuocTinhChau1;

    public ClassChau() {
    }

    public ClassChau(String thuocTinhChau1, String thuocTinhCon1, String thuocTinhCon2, String thuocTinhCha1, String thuocTinhCha2) {
        super(thuocTinhCon1, thuocTinhCon2, thuocTinhCha1, thuocTinhCha2);
        this.thuocTinhChau1 = thuocTinhChau1;
    }

    public String getThuocTinhChau1() {
        return thuocTinhChau1;
    }

    public void setThuocTinhChau1(String thuocTinhChau1) {
        this.thuocTinhChau1 = thuocTinhChau1;
    }

    @Override
    public void methodCha1() {
        super.methodCha1(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void methodCha2() {
        super.methodCha2(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
