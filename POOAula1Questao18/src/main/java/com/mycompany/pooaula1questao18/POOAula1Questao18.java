/*
QUESTÃO 18

Escreva um algoritmo para calcular a área de uma pizza que possui um raio R (informado 
pelo usuário). Armazene o valor de PI em uma constante
 */

package com.mycompany.pooaula1questao18;

/**
 *
 * @author Camila
 */
import java.util.Scanner;
public class POOAula1Questao18 {

    public static void main(String[] args) {
        final double pi=3.14;
        double raio,area;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Digite o raio da pizza (em cm)\n");
        raio=sc.nextDouble();
        
        area =pi*raio*raio;
        
        System.out.println("A area da pizza eh:\n"+area+ "cm2");
    }
}
