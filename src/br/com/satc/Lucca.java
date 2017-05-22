
package br.com.satc;

import java.util.Scanner;

public class Lucca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int numero[]=new int[11];
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            numero[i] = entrada.nextInt();
        }
        for (int i = 0; i < 10; i++) {
        for (int j = 0; i < 10; j++) {
        int aux=0;    
            if (numero[j]>numero[j + 1]){
            aux=numero[j];
            numero[j]=numero[j+1];
            numero[j+1]=aux;
            }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(numero[i+1]);    
        }
            
        }
            
        }
        
        