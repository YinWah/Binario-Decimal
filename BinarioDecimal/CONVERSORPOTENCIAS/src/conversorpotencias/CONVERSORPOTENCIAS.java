/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorpotencias;
import java.util.*;
/**
 *
 * @author Sorzano Torres Pablo, Wah Ortiz Yin Chew
 */
public class CONVERSORPOTENCIAS {
    /**
     * @param args the command line arguments
     */
    /**
     * El metodo principal del programa ofrece al usuario un menu con dos opciones(1.Convertir un numero de binario a decimal y 2.Convertir un numero decimal a binario). Sí el usuario 
     * escoge la opcion 1 el sistema mandara el metodo convertirBinaDeci() de la clase Binario_Decimal(), sí el usuario ecoge la opcion 2 el sistema mandara el metodo convertirDeciBina()
     * de la clase Decimal_Binario()
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
                Binario_Decimal bina= new Binario_Decimal();
        Decimal_Binario debi =  new Decimal_Binario();
        String condi, respuesta;
        System.out.println("Desea usar el programa? SI / NO");
        condi=leer.next();
        while(condi.equalsIgnoreCase("si")){
            System.out.println("Seleccione una opcion");
            System.out.println("1. Binario-Decimal");
            System.out.println("2. Decimal-Binario");
            respuesta=leer.next();
            
            switch (respuesta){
                case "1":
                    bina.convertirBinaDeci();
                    break;
                case "2":
                    debi.convertirDeciBina();
                    break;
            }
            
            System.out.println("Desea usar el programa? SI / NO");
            condi=leer.next();
        }
        
    }
    
}
