/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author zx22student3215
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner preg = new Scanner(System.in);
        int res=0;
        int num1 = 0, num2 = 0;
        
        System.out.println("Introduzca un numero:");
        num1 = preg.nextInt();
        System.out.println("Introduzca otro numero:");
        num2 = preg.nextInt();
        
        System.out.println("1.-Suma");
        System.out.println("2.-Dividir")
        res=preg.nextInt
        if(res == 1){;
        System.out.println(num1+num2);
        }
        if(res == 2){;
            
        System.out.println(num1/num2);
        }
 
    }
    
}
