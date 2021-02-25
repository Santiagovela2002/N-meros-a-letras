/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1selección66204;
import java.util.Scanner;
/**
 *
 * @author Santiago Vela
 */
public class Ejercicio1Selección66204 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    int num1 = 0;
    int num2 = 0;
    int num3 = 0;
    
    System.out.println("Coloque el primer numero");
    num1 = entrada.nextInt();
    
    System.out.println("Coloque el segundo numero");
    num2 = entrada.nextInt();
    
    System.out.println("Coloque el tercer numero");
    num3 = entrada.nextInt();
   
  if (num1 > num2){
        if (num2 > num3){
        System.out.println("El numero mayor es = " + num1);
    }
    else {
        System.out.println("El numero mayor es = " + num2);
    } 
   
  }
  else {
      if (num2 > num3){
          System.out.println("El numero mayor es: " + num2);
      }
      else {
          System.out.println("El numero mayor es:" + num3);  
          
      }
      
  } 
  
} 

