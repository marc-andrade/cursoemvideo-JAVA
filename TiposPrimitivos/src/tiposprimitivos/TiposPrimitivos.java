
package tiposprimitivos;

import java.util.Scanner;


public class TiposPrimitivos {

    public static void main(String[] args) {
        /*String nome = "Gustavo";
        float nota =(float) 8.5;
        System.out.println("A nota é "+ nota);
        System.out.printf("A nota de %s é %.2f \n",nome, nota);
        System.out.format("A nota de %s é %.2f \n",nome, nota);
    */
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %.2f \n",nome, nota);
}
}