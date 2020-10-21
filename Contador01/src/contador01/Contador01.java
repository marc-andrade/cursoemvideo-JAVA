/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author Marco
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 0;
        while (cc<10){
            cc++;
            /* Continue serve para ignorar as setenças e jogar para o inicio do laço 
            if (cc == 5 || cc == 7){
                continue;
            }*/
             if (cc == 2 || cc == 3 || cc == 4){
               continue; 
             }
             if (cc == 7) {
                 break;
             }
            System.out.println("CAMBALHOTA "+cc);
            
        } 
    }
    
}
