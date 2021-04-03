/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B;

import A.ClassA;

/**
 *
 * @author Dungna29
 */
public class ClassB {
    void method1(){
        ClassA classA = new ClassA();
        //classA.a = 5; vì a private
        //classA.b = 5; vì b Default chỉ được sử dụng bên package
        classA.c = 5;
        //classA.d = 5; Bên ngoài package muốn gọi phải kết thừa
        
    }
}
