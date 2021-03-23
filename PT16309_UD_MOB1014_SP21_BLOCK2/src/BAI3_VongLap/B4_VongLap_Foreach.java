/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI3_VongLap;

/**
 *
 * @author Dungna29
 */
public class B4_VongLap_Foreach {

    /*
    Cách gõ: fore + tab
    
    Công thức:  
    for (String arg : args) {
            
        }
    String arg: Kiểu dữ liệu và tên biến, tên biến sẽ đại diện là 1 giá trị
    args: Là Collection hoặc là 1 Array
     */
    public static void main(String[] args) {
        int[] arrNumbers = {1,3,5,7};
        //Cách 1: For
        for (int i = 0; i < arrNumbers.length; i++) {
            System.out.print(arrNumbers[i] + " ");
        }
        
        System.out.println("");
        //Cách 2: fore + tab
        for (int x : arrNumbers) {
            System.out.print(x + " ");
        }
        
        String[] arrNames = {"5","6"};
        for (String x : arrNames) {
            System.out.print(x + " ");
        }
    }
}
