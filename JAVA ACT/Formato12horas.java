/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.formato12horas;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Formato12horas {

    public static void main(String[] args) {
        int h=0;
        int m=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa que transforma el horario del formato 24 hs al formato 12 hs");
        System.out.println("Ingrese el horario en formato 24 hs");
        System.out.println("Ingrese las horas");
        h=entrada.nextInt();
        System.out.println("Ingrese los minutos");
        m=entrada.nextInt();
        
        if (h>24 || m>60) {
             System.out.println("Error , no se puede ingresar más de 24 hs o más de 60 minutos");
        } else {
        if (h>= 12){
            h=h-12; 
        System.out.println("La hora es : " + h + " : " + m + "PM" );
        } else {
        System.out.println("La hora es :" + h + ":" + m + "AM");               }
      
    }
}
}
