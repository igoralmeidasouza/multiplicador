package Atividades;

import javax.swing.*;


// 1. Faça um programa em Java que leia a altura, a idade e o sexo de 50 pessoas e forneça as seguintes informações
//  • a maior altura e a menor altura
//  • a média de altura de mulheres
//  • a idade do homem mais velho e da mulher mais nova


public class Atividade {
   
/* Variaveis 
Quantidade dee Pessoas = A
Altura = B
Idade = C
Sexo = D
Length = F 
Menor Altura = G
Maior Altura = H
Quantidade de Mulher = I
Média da Altura M. = J
Homem mais Velho = K
Mulher mais Nova = L
*/

public static void main (String args []){  

        int A = 0;
        String aux = "";

        aux =  JOptionPane.showInputDialog(null,"Quantidade de Pessoas");
        A = Integer.parseInt(aux);
        double B;
        int C, D; 
        double F [] = new double [A];
        double H = 0, G = 100; 
        double I = 0, J = 0;       
        int K =0, L = 200;   

            for (int i = 0; i < A; i++) {       

                String altura = JOptionPane.showInputDialog ((i+1)+"º Pessoa - Digite a altura (Metros)");  
                B = Double.parseDouble(altura);  
                           
                String idade = JOptionPane.showInputDialog((i+1)+"º Pessoa - Digite a idade");   
                C = Integer.parseInt(idade);   
                   
                String sexo = JOptionPane.showInputDialog((i+1)+"º Pessoa - Digite:\n 1 - Masculino\n 2 - Feminino");   
                D = Integer.parseInt(sexo);

                if (H < B) {         
                    H = B;
                }
                if (G > B) {
                    G = B;
                }
                if (D == 2) { 
                    J = J + B;
                    I++;
                }
                if (D == 1) {
                    if (K < C) {
                        K = C;
                    } 
                }
                if (D == 2) {
                    if (L > C) {
                        L = C;
                    } 
                }
            }
            J = J / I;
            //Média da altura (Mulheres)   
            
            System.out.println("A Maior Altura é: "+H);  
            System.out.println("A Menor Altura é: "+G); 
            System.out.println("A Altura Média das Mulheres é: "+J);
            System.out.println("O Homem Mais Velho tem : "+K+"anos");  
            System.out.println("A Mulher Mais Nova tem : "+L+"anos"); 
      }  

} 