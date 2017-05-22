
package br.com.satc;

import java.util.Scanner;

public class EX1Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    int numero[]=new int[6];
        for (int i = 0; i < 5; i++) {
            System.out.println("DIGITE UM NUMERO INTEIRO");
             numero[i] = entrada.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("--"+numero[i]+"--");
        }
        
    }
    
}
