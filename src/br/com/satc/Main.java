
package br.com.satc;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     String nomes[]=new String[10];
     String rg[]=new String [10];
     String cpf[]=new String [10];
        for (int i = 0; i < 10; i++) {
            System.out.println("digite seu nome : ");
           nomes[i] = entrada.next();
            System.out.println("Digite seu Registro Geral(RG)");
            rg[i] = entrada .next();
            System.out.println("Digite seu CPF");
            cpf[i] = entrada .next();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("---------------------");
            System.out.println("nome:"+nomes[i]);
            System.out.println("RG: "+rg[i]);
            System.out.println("CPF: "+cpf[i]);
            System.out.println("----------------------5");
        }
    }
    
}
