/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.billetescajero;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class BilletesCajero {

    public static void main(String[] args) {
        int MontoTotal=0;
        int mil;
        int quinientos=0;
        int doscientos=0;
        int cien;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa que calcula cantidad de billetes a recibir");
        System.out.println("Ingrese el monto que desea retirar");
        
        MontoTotal=entrada.nextInt();
        mil= MontoTotal/1000;
        quinientos=MontoTotal%1000/500;
        doscientos=MontoTotal%1000%500/200;
        cien=MontoTotal%1000%500%200/100;
     

        
        System.out.println("Recibirá billetes de mil: " + mil);    
        System.out.println("Recibirá billetes de quinientos: " + quinientos); 
        System.out.println("Recibirá billetes de doscientos: " + doscientos); 
        System.out.println("Recibirá billetes de cien: " + cien);
}
}