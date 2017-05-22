
package br.com.satc;

import java.util.Scanner;

public class NotasVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        double notas[]=new double[6];
        //----------------------------------------//
        System.out.println("Qual o seu nome ? ");
        String nome = entrada.next();
        System.out.println("Qual a disciplina ? ");
        String disc = entrada.next();
        //---------------------------------------//
        for (int i = 1; i <= 5; i++) {
            System.out.println("Qual a sua "+i+" nota ?");
            notas[i] = entrada .nextDouble();
        }
        for (int i = 1; i <= 5; i++) {
        for (int j = 1; i <= 5; j++) {
        double aux=0;    
            if (notas[j]>notas[j + 1]){
            aux=notas[j];
            notas[j]=notas[j+1];
            notas[j+1]=aux;
         System.out.println(notas[j]+" e "+notas[j+1]);
            }
            }
        }
    }
    
}
