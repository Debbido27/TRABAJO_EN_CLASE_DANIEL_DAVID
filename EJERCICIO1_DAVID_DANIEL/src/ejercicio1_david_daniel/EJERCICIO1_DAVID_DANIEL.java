
package ejercicio1_david_daniel;
 import java.util.Scanner;

public class EJERCICIO1_DAVID_DANIEL {
public static void ingresar(){
      Scanner entrada = new Scanner(System.in);
      int numVentas;
      double sumaVentas = 0;
      System.out.println("\n\n\n\n\nCuantas ventas desea introducir? : ");
      numVentas = entrada.nextInt();
         
      double[] ventas = new double[numVentas];
      for (int i = 0; i < numVentas; i++) {
      System.out.print("Ingrese la venta " + (i + 1) + ": ");
      ventas[i] = entrada.nextDouble();
      sumaVentas += ventas[i]; 
            }
      

      System.out.println("La suma total de las ventas es: " + sumaVentas+"\n\n\n\n\n");
        
      sumaVentas = 0;
            
    
    
}
      
    public static void main(String[] args) {
    
 

        Scanner entrada = new Scanner(System.in);
 
         int op;
        do{ 
            System.out.println("Menu.\n1.Iniciar ventas\n2.Salir");
            op = entrada.nextInt();
            
            switch(op){
                
                
                
                case 1:
                    ingresar();
                 break;
                 
                 
                default:
                    System.out.println("Ingrese 1 o 2");
                    
                 
          
        }
        
        }while(op!=2);
}
}
        
        

    


        
        
        
        
   
    

