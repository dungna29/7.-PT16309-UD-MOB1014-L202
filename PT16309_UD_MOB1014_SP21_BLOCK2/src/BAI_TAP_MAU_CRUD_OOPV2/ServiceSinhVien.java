/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_CRUD_OOPV2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class ServiceSinhVien {

    Scanner _sc = new Scanner(System.in);
    List<Student> _lstStudent = new ArrayList<>();
    Student _Student;
    String _input;

    public ServiceSinhVien() {
        Student st1 = new Student("PH1", 5, "Hoàng", "0123", "hoang@gmail");
        Student st2 = new Student("PH2", 5, "Long", "0124", "long@gmail");
        _lstStudent.add(st1);
        _lstStudent.add(st2);
    }

    public void addStudent() {
        System.out.println("Mời bạn nhập số lượng: ");
        _input = _sc.nextLine();
        for (int i = 0; i < Integer.parseInt(_input); i++) {
            _Student = new Student();
            System.out.print("Mời bạn nhập tên: ");
            _Student.setTen(_sc.nextLine());
            System.out.print("Mời bạn nhập sdt: ");
            _Student.setSdt(_sc.nextLine());
            System.out.print("Mời bạn nhập email: ");
            _Student.setEmail(_sc.nextLine());
            System.out.print("Mời bạn nhập msv: ");
            _Student.setMsv(_sc.nextLine());
            System.out.print("Mời bạn nhập điểm: ");
            _Student.setDiemJava(Double.parseDouble(_sc.nextLine()));
            _lstStudent.add(_Student);
        }
    }

    public void getListStudent() {//Chức năng xuất danh sách sinh viên
        inDs(_lstStudent);
    }

    public void findStudent() {
        System.out.print("Mời bạn nhập mã SV cần tìm: ");
        _input = _sc.nextLine();
        int temp = getIndexObj(_input);
        if (temp == -1) {
            System.out.println("Không tìm thấy mã sinh viên");
            return;
        }
        _lstStudent.get(temp).inRaManHinh();
    }

    public void removeStudent() {
        System.out.print("Mời bạn nhập mã SV cần xóa: ");
        _input = _sc.nextLine();
        int temp = getIndexObj(_input);
        if (temp == -1) {
            System.out.println("Không tìm thấy mã sinh viên");
            return;
        }
        _lstStudent.remove(temp);
        System.out.println("Xóa thành công");
    }

    public void editStudent() {
        System.out.print("Mời bạn nhập mã SV cần sửa: ");
        _input = _sc.nextLine();
        int temp = getIndexObj(_input);
        if (temp == -1) {
            System.out.println("Không tìm thấy mã sinh viên");
            return;
        }
        do {
            System.out.println("Bạn muốn sửa thuộc tính nào?");
            System.out.println("1. Tên");
            System.out.println("2. Sđt");
            System.out.println("3. Email");
            System.out.println("4. Thoát");
            System.out.println("Mời bạn chọn chức năng: ");
            _input = _sc.nextLine();
            switch (_input) {
                case "1":
                    System.out.println("Tên hiện tại: " + _lstStudent.get(temp).getTen());
                    System.out.println("Mời bạn nhập tên mới: ");
                    _lstStudent.get(temp).setTen(_sc.nextLine());
                    break;
                case "2":
                    System.out.println("Sđt hiện tại: " + _lstStudent.get(temp).getSdt());
                    System.out.println("Mời bạn nhập Sđt mới: ");
                    _lstStudent.get(temp).setSdt(_sc.nextLine());
                    break;
                case "3":
                    System.out.println("Email hiện tại: " + _lstStudent.get(temp).getEmail());
                    System.out.println("Mời bạn nhập Email mới: ");
                    _lstStudent.get(temp).setEmail(_sc.nextLine());
                    break;
                case "4":
                    System.out.println("Kế thúc sửa thuộc tính");
                    break;
                default:
                    System.out.println("Chức năng không tồn tại");
            }
        } while (!(_input.equals("4")));
    }
    
    public void sortStudent(){
//        Collections.sort(_lstStudent, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                //return o1.getTen().compareTo(o2.getTen());//Sắp xếp String xuôi
//                //return -o1.getTen().compareTo(o2.getTen());//Sắp xếp String ngược
//                
//                //Sắp xếp số
//                if (o1.getDiemJava() > o2.getDiemJava()) {
//                    return 1;
//                }else{
//                    return -1;
//                }
//            }
//        });
        
        //Cashc 2: Dùng lamda để sắp xếp
        //_lstStudent.sort((o1, o2) -> o1.getTen().compareTo(o2.getTen()));
        
         Collections.sort(_lstStudent, Comparator.comparing(Student::getDiemJava));
        //Lambda expression for sorting theo điểm
        //_lstStudent.sort((Student s1, Student s2)->s1.getDiemJava()-s2.getDiemJava());  
    }
    

    //Phương thức 1: In danh sách đối tượng
    private void inDs(List<Student> lstStudents) {
        for (Student x : lstStudents) {
            x.inRaManHinh();
        }
    }

    //Phương thức 2: Lấy vị trí của đối tượng trong danh sách
    private int getIndexObj(String msv) {
        for (int i = 0; i < _lstStudent.size(); i++) {
            if (_lstStudent.get(i).getMsv().equalsIgnoreCase(msv)) {
                return i;
            }
        }
        return -1;
    }

}
