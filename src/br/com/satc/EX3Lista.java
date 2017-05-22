
package br.com.satc;

import java.util.Scanner;

public class EX3Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double notas[]=new double[5];
        Scanner entrada = new Scanner(System.in);
        for (int i = 1; i < 5; i++) {
            System.out.println("Qual as suas notas ?");
            notas[i] = entrada .nextDouble();
        }
        double soma=0;
        for (int i = 1; i < 5; i++) {
            System.out.println("As sua Notas são: "+notas[i]);
            soma=soma +notas[i];
        }
        System.out.println("A média deu: "+soma/4);
            }
        }
   
    

