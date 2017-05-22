
package br.com.satc;

import java.util.Scanner;

public class EX4Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       char carac[]=new char[11];
       Scanner entrada = new Scanner(System.in);
       int cons = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("DIGITE UM CARACTER :");
            carac[i] = entrada.next().charAt(0);
            switch (carac[i]){
                case 'A':
                    carac[i]= ' ';
                    break;
                case 'E':
                    carac[i]=' ';
                    break;
               case 'I':
                    carac[i]= ' ';
                    break;
                    case 'O':
                    carac[i]= ' ';
                    break;
                    case 'U':
                    carac[i]= ' ';
                    break;
                    default:
                       cons= cons+1;
            }
             System.out.println("FORAM ESCRITAS "+cons); 
            }    
            for (int i = 0; i < 10; i++) {
            if (carac[i]!= ' '){
                 System.out.println("AS CONSOANTES SÃO: "+carac[i]);
        }
        }
        
    }
}
    

