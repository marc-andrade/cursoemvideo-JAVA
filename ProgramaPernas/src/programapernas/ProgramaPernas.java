/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class ProgramaPernas {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.println("Quantas Pernas ?");
        int perna = tec.nextInt();
        String tipo ;
        System.out.println("Isso e um(a)");
        switch (perna){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3: ;
                tipo = "Trípe";
                break;
            case 4:
                tipo= "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "E.T";
                break;        
        }
        System.out.println(tipo);
        
    }
    
}
