
package br.com.satc;

import java.util.Scanner;

public class EX2Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
    double numero[]=new double[11];
        for (int i = 0; i < 10; i++) {
            System.out.println("DIGITE UM NUMERO REAL");
             numero[i] = entrada.nextDouble();
        }
        for (int i =9; i >= 0; i--) {
            System.out.println("--"+numero[i]+"--");
        }
       
    }
    
}
