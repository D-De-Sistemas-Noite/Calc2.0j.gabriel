/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class CalCJuros {
    public static void main(String[] args) {
        
        double capital, taxa, prazo, juros;
        int op;
        
        Scanner entrada = new Scanner(System.in);
        
        do {
            //Apresentação do sistema
            System.out.println("\n\t\t\t -- CalCJuros-- \n");

            //menu
            System.out.println("1. Juros");
            System.out.println("2. Capital");
            System.out.println("3. Taxa");
            System.out.println("4. Prazo");
            System.out.println("5. Sair");

            //Opção do usuário
            System.out.print("\n\t Opção: ");
            op = entrada.nextInt();
            
            switch (op) {
                case 1: // joao
                    //entrada
                    System.out.println("\n\t\t\t -- Calculadora de juros -- \n");
                    System.out.print("Informe seu capital [R$]: ");
                    capital = entrada.nextDouble();
                    System.out.print("Informe a taxa [%]: ");
                    taxa = entrada.nextDouble();
                    System.out.print("Informe o prazo : ");
                    prazo = entrada.nextDouble();
                    //processamento
                    juros = capital * taxa * prazo / 100;
                    //saída
                    System.out.printf("\n Juros [R$ %.2f]\n\n", juros);
                    
                    
                    case 2: // gabi
                    //entrada
                    System.out.print("\n\t\t\t -- Calculadora de capital -- \n");
                    System.out.print("Informe a taxa [%]: ");
                    taxa = entrada.nextDouble();
                    System.out.print("Informe o prazo: ");
                    prazo = entrada.nextDouble();
                    System.out.print("Informe os juros: ");
                    juros = entrada.nextDouble();
                    //processamento
                    capital = juros / (taxa / 100 * prazo);
                    //saída
                    System.out.printf("\n Capital [R$ %.2f]", capital);
                    break;
                    
                     case 3: // carlos
                    //entrada
                    System.out.println("\n\t\t\t -- Calculadora de Taxa -- \n");
                    System.out.print("Informe o capital [R$]: ");
                    capital = entrada.nextDouble();
                    System.out.print("Informe o prazo: ");
                    prazo = entrada.nextDouble();
                    System.out.print("Informe os juros: ");
                    juros = entrada.nextDouble();
                    //processamento
                    taxa = juros / (capital * prazo) * 100;
                    //saída
                    System.out.printf("\n Taxa [%.0f", taxa);
                    System.out.print("%]");
                    break;
                    
                    case 4: // bruno
                    //entrada
                    System.out.println("\n\t\t\t -- Calculadora de Prazo -- \n");
                    System.out.print("Informe o capital [R$]: ");
                    capital = entrada.nextDouble();
                    System.out.print("Informe a taxa [%]: ");
                    taxa = entrada.nextDouble();
                    System.out.print("Informe os juros: ");
                    juros = entrada.nextDouble();
                    //processamento
                    prazo = juros/(capital*taxa/100);
                    //saída
                    System.out.printf("\n Prazo [%.0f períodos]", prazo); 
                    break;
                    
                    case 5:
                    System.out.println("\n Forte abraço!");
                    break;
                default:
                    System.out.println("\n Opção incorreta!");
                    break;
            }
        }while (op !=5);
    }
}
        
    

