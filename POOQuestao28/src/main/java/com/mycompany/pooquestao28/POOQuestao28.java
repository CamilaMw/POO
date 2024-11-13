
/*
QUESTÃO 28
Calcular o salário líquido do funcionário sabendo que este é constituído pelo salário bruto 
mais o valor das horas extras subtraindo 8% de INSS do total. Serão lidos nesse problema o 
salário bruto, o valor das horas extras e o número de horas extras. Apresentar ao final o 
salário líquido.*/

package com.mycompany.pooquestao28;

/**
 *
 * @author Camila
 */
import java.util.Scanner;
public class POOQuestao28 {
    public static void main(String[] args) {
        double SalarioBruto, ValorDaHoraExtra, SalarioLiquido, SalarioLiquido_inss;
        int NumeroDeHoraExtra;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salário bruto");
        SalarioBruto = sc.nextDouble();

        System.out.println("Digite o valor das horas extras");
        ValorDaHoraExtra = sc.nextDouble();

        System.out.println("Digite o quantidade de horas extras");
        NumeroDeHoraExtra = sc.nextInt();

        SalarioLiquido = SalarioBruto + (ValorDaHoraExtra * NumeroDeHoraExtra);
        SalarioLiquido_inss = SalarioLiquido - (SalarioLiquido * 0.08);

        System.out.println("O valor do salário líquido com INSS: " + SalarioLiquido_inss);
    }
}




