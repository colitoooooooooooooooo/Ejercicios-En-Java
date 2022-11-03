/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.convertirsegundos2;
import java.util.Scanner;//leer datos por teclado

/**
 *
 * @author Usuario
 */
public class ConvertirSegundos2 {//plantillas modelo de codigo
  public static void main (String args[]){//metodo main ,da arranque al programa
    int h;
    int m;
    int s;
  Scanner entrada = new Scanner(System.in);//leer la variable   
  System.out.println("Programa que convierte segundos en Horas,minutos y segundos");//Escribir,mostar por pantalla
  System.out.println("Ingrese la cantidad de segundos");//Escribir,mostar por pantalla
  s=entrada.nextInt();
  h=s/3600;
  s %=3600;
  m=s/60;
  s %=60;
  System.out.println("La cantidad de horas es de : " + h);
  System.out.println("Minutos : " + m);
  System.out.println("Segundos : " + s);
         
         
   }  
  
    
   
  }    
  



   
        
        
 
