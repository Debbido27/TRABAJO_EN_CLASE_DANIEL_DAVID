

package segundo_ejerciciots;
import java.util.Scanner;
public class SEGUNDO_EJERCICIOTS {
    
    
    
    
    public static void escribir() {
      
        String[] dias = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n\nIngrese un dia de la semana, por favor, para saber si es dia laboral o no: ");
        String dia = entrada.nextLine().toLowerCase(); 
        
        
        if (dia.equals(dias[5]) || dia.equals(dias[6])) {
            System.out.println(dia + " no es un dia laboral\n\n\n\n\n\n\n");
        } else {
            System.out.println("Es un dia laboral\n\n\n\n\n\n\n");
        }
    }
   
   
   
   
   

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        // TODO code application logic here
        int op;
        do{
      
        System.out.println("****BIENVENDIO A UN CALCULADOR DE DIA LABORAR****");
        System.out.println("Para escribir un dia de la semana, digite 1 ");
        System.out.println("Para salir, digite 4");
        op = entrada.nextInt();
        
          switch(op){
              
              case 1: 
                  escribir();
                          break;
              
              default: 
                  System.out.println("INGRESE SOLO 1 Y 4!!!");
                  break;
          }
         
        
        
        }while (op != 4);
    }
    
}
