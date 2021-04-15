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
    - Từ khóa abstract đứng trước Class gọi là lớp trừu tượng
    - Trong lớp phải có 1 phương thức abstract
 */
public abstract class ClassCha {

    private String thuocTinhCha1;
    private String thuocTinhCha2;

    public ClassCha() {
    }

    public ClassCha(String thuocTinhCha1, String thuocTinhCha2) {
        this.thuocTinhCha1 = thuocTinhCha1;
        this.thuocTinhCha2 = thuocTinhCha2;
    }

    public String getThuocTinhCha1() {
        return thuocTinhCha1;
    }

    public void setThuocTinhCha1(String thuocTinhCha1) {
        this.thuocTinhCha1 = thuocTinhCha1;
    }

    public String getThuocTinhCha2() {
        return thuocTinhCha2;
    }

    public void setThuocTinhCha2(String thuocTinhCha2) {
        this.thuocTinhCha2 = thuocTinhCha2;
    }

    public void methodCha1() {

    }

    //non-abstract
    public void methodCha2() {

    }
     /*
        - Dưới đây là phương thức abstract
        - Phương thức abstract không body code còn tên rồi tham số vẫn theo định nghĩa phương thức
    */
    public abstract void methodCha3();
    public abstract int methodCha4(int a,int b);
}
