/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statusvoto;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class StatusVoto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite sua data de nascimento:");
        int nas = t.nextInt();
        Calendar cal = Calendar.getInstance();
        int atual = cal.get(Calendar.YEAR);
        int i = atual - nas;
        if (i<16) {
            System.out.println("Não vota");
        }
        else  {
            if ((i>=16 && i<18) || (i>70)){
                System.out.println("Opcional"); 
            }
            else {
                System.out.println("Obrigatório");
            }
            
        }
    } 
}
            
       
       
    
    

