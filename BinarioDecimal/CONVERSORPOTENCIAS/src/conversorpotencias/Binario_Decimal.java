/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorpotencias;
import java.util.*;
/**
 * @author Sorzano Torres Pablo, Wah Ortiz Yin Chew
 */
public class Binario_Decimal {
    Scanner leer=new Scanner(System.in);
    /**
     * El metodo convertirBinaDeci() pide al usuario un numero en binario y despues lo convierte a su correspondiente numero en base 10
     */
    public void convertirBinaDeci(){
       
        String binario, condi;
        
        
             int numero, i, j=0, decimal=0;
            System.out.println("Ingrese el numero binario");
            numero=leer.nextInt();
            binario=String.valueOf(numero);
            
            for(i=binario.length()-1; i>=0; i--){
                if(binario.charAt(i)=='0'){
                    decimal=(int)(decimal + 0 * Math.pow(2, j));
                    j++;
                }else if(binario.charAt(i)=='1'){
                    decimal=(int)(decimal + 1 * Math.pow(2, j));
                    j++;
                }
            }
            System.out.println("Numero binario: "+numero);
            System.out.println("Numero DECIMAL: "+decimal);
            
           
    }
}
