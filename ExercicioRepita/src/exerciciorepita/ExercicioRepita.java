/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;
import javax.swing.JOptionPane;

public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Olá, Mundo!", "Boa Vindas", JOptionPane.INFORMATION_MESSAGE);
        int n, s = 0, tot =0;
        int totPar = 0, totImpar =0, mCem = 0;
        int m = 0;
        do {
       n = Integer.parseInt(JOptionPane.showInputDialog(null, 
               "<html>Informe um valor: <br><em>(valor 0 iterrompe)</em></br> </html>"));
               s += n;
               if (n!=0){
               tot ++;
               }
               if (n % 2 ==0){
                 totPar ++ ; 
                 
               } else {
                   totImpar++;
                   
               } if (n >= 100){
                   mCem++;
               }
               
                m = s/tot;
               
        //JOptionPane.showMessageDialog(null,"Você digitou o valor "+ n);
        } while (n != 0);
        //JOptionPane.showMessageDialog(null,"<html>Resultado final <hr> "+ "<br>Somatório vale "+ s+"</html>");
          JOptionPane.showMessageDialog(null,
          "<html>Resultado: <br>----------------------" 
                +  "<br> Total de valores: " + tot
                + "<br>Total de Pares: " + totPar
                + "<br>Total de Impares: " + totImpar 
                + "<br> Acima de 100: " + mCem
                + "<br>Média dos valores: " + m
                + "</html>",
            "Resultado Final",JOptionPane.WARNING_MESSAGE);  
    }
    
}
