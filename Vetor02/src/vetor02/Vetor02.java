/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

import java.util.Calendar;

/**
 *
 * @author Marco
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        
        // biblioteca calendar serve pra pegar referencias do ano
        Calendar cal = Calendar.getInstance();
        // dda = dia do ano
        int dda = cal.get(Calendar.DAY_OF_YEAR);
        
        if (dda == 365) {
            
        int tot[] = {31,28,31,30,31,30,31,31,30,31,30,31};
         for (int c =0 ; c<mes.length;c++){
            System.out.println("O mes de "+mes[c]+" tem " +
                    tot[c]+" dias ao todo");
        }
            
        } else {
            
            int tot[] = {31,29,31,30,31,30,31,31,30,31,30,31};
            for (int c =0 ; c<mes.length;c++){
            System.out.println("O mes de "+mes[c]+" tem " +
                    tot[c]+" dias ao todo");
             }    
}   
}
}    

