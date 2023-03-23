/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetomediascanner;

import java.util.Scanner;

/**
 *
 * @author Alan Rodrigues Primo
 */
public class ProjetoCalculadoraScanner {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        float resultado;
        System.out.print("Informe o primeiro numero: ");
        float n1 = leitura.nextFloat();
        System.out.print("Informe o segundo numero: ");
        float n2 = leitura.nextFloat();
        
        System.out.println("OPERAÇÕES: "
                + "\n + = Adicão "
                + "\n - = Subtração"
                + "\n * = Multiplicação"
                + "\n / = Divisão");
        System.out.println("Informe a operação desejada: ");
        String op = leitura.next();
        
        if (op.equals("+")){
            resultado = n1 +  n2;
            System.out.println("Resultado: " +resultado);
        }
        else if(op.equals("-")){
           resultado = n1 - n2;
           System.out.println("Resultado: " +resultado);
        }
        else if (op.equals("*")){
            resultado = n1 * n2;
            System.out.println("Resultado: " +resultado);
        }
        else if (op.equals("/")){
            resultado = n1 / n2;
            System.out.println("Resultado: " +resultado);
        }
        else {
            System.out.println("Informe uma operação válida!! ");
        }
        
    }
}
