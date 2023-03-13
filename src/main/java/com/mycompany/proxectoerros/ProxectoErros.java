/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proxectoerros;

import java.util.Scanner;

/**
 *
 * @author a22laurall
 */
public class ProxectoErros {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int resto;
        int numInvertido = 0;
        
        while(num!=0){
            resto = num%10;
            numInvertido = numInvertido * 10 + resto;
            num/=10;
        }
        System.out.println("O número invertido é "+numInvertido);
    }
}
