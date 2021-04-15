package BAI10_Interface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dungna29
 */
public class View {
    public static void main(String[] args) {
        IService iService = new Service();
        System.out.println(iService.tinhTong(5, 5));
    }
}
