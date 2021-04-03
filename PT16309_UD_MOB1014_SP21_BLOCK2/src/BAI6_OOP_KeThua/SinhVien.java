/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI6_OOP_KeThua;

/**
 *
 * @author Dungna29
 */
/*
    1. Để kế thừa sử dụng từ khóa Extends <Tên lớp cha>
    2. 1 Con thì chỉ có 1 cha.
    3. Khi lớp con kế thừa thì sẽ thừa hưởng 
    thuộc tính và phương thức mà cha cho phép
 */
public class SinhVien extends Person {

    private String msv;
    private double diemJava;

    public SinhVien() {
    }

    public SinhVien(String msv1, double diemJava, String ho, String tenDem, String ten, String namSinh) {
        super(ho, tenDem, ten, namSinh);        
        msv = msv1;
        this.diemJava = diemJava;
        //Từ khóa this dùng để tham chiếu đến thuộc tính và phương thức của lớp hiện tại
        //Từ khóa super dùng để tham chiếu đến thuộc tính và phương thức của lớp cha
        
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }
    
    //Kế thừa phương thức của cha
    //Alt + Insert --> Override Method--> tên phương thức muốn kế thừa
    
    /*
        1. Khi lớp con kế thừa phương lớp cha không được sửa tên, thêm hoặc sửa tham số
        2. Body code bên trong thì có quyền viết lại theo nghiệp vụ riêng.
    Đây được gọi là ghi đè phương thức trong tính đa hình của OOP.
    */
    @Override
    void inRaManHinh() {
       // super.inRaManHinh(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Đây là text từ lớp SV");
    }
    

}
