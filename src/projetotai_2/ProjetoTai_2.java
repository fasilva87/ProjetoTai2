
package projetotai_2;

import java.util.Scanner;


public class ProjetoTai_2 {

   
    public static void main(String[] args) {
         double watts, horas;
        double consumo, valor;
        int dias;
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite o consumo em watts: ");
        watts = scan.nextDouble();
        
        System.out.println("Digite a quantidade de horas de uso: ");
        horas = scan.nextDouble();
        
        System.out.println("Digite a quantidade de dias: ");
        dias = scan.nextInt();
        
        consumo =(watts*horas*dias) / 1000; 
        valor = (consumo) * 0.69;
        System.out.println("O consumo total é de : " + consumo + " Watts/dia(s)" );
        
        System.out.printf("O valor total é R$%.2f " , valor);
    }
    
}
