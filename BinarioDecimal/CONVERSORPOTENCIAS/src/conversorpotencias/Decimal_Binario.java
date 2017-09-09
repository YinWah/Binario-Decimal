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
public class Decimal_Binario {
    Scanner leer=new Scanner(System.in);
    /**
     * El metodo convertirDeciBina() pide al usuario un numero decimal y despues lo convierte a su correspondiente numero en base 2
     */
    public void convertirDeciBina(){
        String condi;
            int decimal, nom;
            String numero="", inverso="";
            
            System.out.println("Ingrese el numero decimal");
            decimal=leer.nextInt();
            nom=decimal;
           do{
               if(nom%2==0){
                   numero=numero+"0";
               }else{
                   numero=numero+"1";
               }
               nom=nom/2;
           }while(nom!=0);
           for(int i=numero.length()-1; i>=0; i--){
               inverso=inverso+""+numero.charAt(i);
           }
            System.out.println("Numero BINARIO: "+inverso);
            System.out.println("Numero decimal: "+decimal);
            
            
        
    }
}
