
package br.com.satc;

import java.util.Scanner;

public class EX7Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int idade[]=new int[6];
     double altura[]=new double[6];
       Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("QUAL A SUA IDADE ? ");
            idade[i] =entrada.nextInt();
            System.out.println("QUAL A SUA ALTURA ? ");
            altura[i] = entrada.nextDouble();
        }
  for (int i =4; i >= 0; i--) {
            System.out.println("--"+idade[i]+"--"+altura[i]);
        }
    }
    
}
