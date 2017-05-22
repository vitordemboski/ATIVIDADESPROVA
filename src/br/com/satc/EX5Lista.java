
package br.com.satc;

import java.util.Scanner;

public class EX5Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double nota[]=new double[5];
       double aluno[]= new double [11];
       Scanner entrada = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            for (int j=0; j < 4; j++) {
                System.out.println("QUAL A NOTA DO "+i+" aluno? ");
                nota[j] = entrada.nextDouble();
                aluno[i]+=nota[j];
            }
         aluno[i]=aluno[i]/4;
            System.out.println(aluno[i]); 
        }
        for (int i = 0; i < 10; i++) {
           if (aluno[i] >= 7){
            System.out.println("AS MÈDIAS ACIMA DE 7 SÂO: "+aluno[i]);  
        }
        }
    }
    
}
