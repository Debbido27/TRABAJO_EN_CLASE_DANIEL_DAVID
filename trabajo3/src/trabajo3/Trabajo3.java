/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo3;


public class Trabajo3 {

    
 public static void main(String[] args) {
        
        System.out.println("Los numeros primos del 1 al numero 100 son: ");
       
        for (int i = 2; i <= 100; i++) {
            int numero = 0;  
            
        
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    numero++;  
                }
            }
            
      
            if (numero == 2) {
                System.out.print(i + " ");
            }
        }
 }
}
//EJERICCIO REALIZADO POR DANIEL WELCHEZ  

