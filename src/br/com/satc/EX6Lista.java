
package br.com.satc;

import java.util.Scanner;

public class EX6Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
       int numero[]= new int [6];
       Scanner entrada = new Scanner(System.in);
       int soma=0;
       int mult=1;
        for (int i = 0; i < 5; i++) {
            System.out.println("DIGITE NUMEROS ");
            numero[i] = entrada .nextInt();
            soma=soma+numero[i];
             mult=mult*numero[i];
        }
        System.out.println("A SOMA DOS NUMERO DEU: "+soma);
        System.out.println("A MULTIPLICALÇÂO DOS NUMEROS DEU: "+mult);
    }
    
}
