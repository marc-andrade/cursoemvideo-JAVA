/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author Marco
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Operadores Logicos 
        && = E 
        || = OU
        ^ = Ou exclusivo*/
        
        int x, y ,z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        r = (x<y ^ y<z )? true: false;
        System.out.println(r);
        
    }
    
}
