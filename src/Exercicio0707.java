package Exercicio0707;

import javax.swing.*;


public class Exercicio0707 {
public static void main(String args[]){
        imc();
    }
    public static void closing(){
        int  sim = 0;
            String valor = "";
            valor = JOptionPane.showInputDialog(null, "1 - Continuar\n2 - Sair ");
            sim = Integer.parseInt(valor);
        if (sim == 1) {
            imc();
        }
        else{
            System.exit(0);
        }
    }
    public static void imc(){
        double peso, altura, total= 0;
        int imc = 0, imc2 = 0;
        String inp = "";

        inp = JOptionPane.showInputDialog(null,"Insira o peso \n(Exemplo: 63) ");
        inp = inp.replace(',','.');
        peso = Double.parseDouble(inp);
        if (peso < 0.5){
            JOptionPane.showMessageDialog(null, "Peso invalido!");
            imc();
        }
        inp = JOptionPane.showInputDialog(null,"Insira a altura \n(Exemplo:1.73)");
        inp = inp.replace(',','.');
        altura = Double.parseDouble(inp);
        if (altura < 0.1){
            JOptionPane.showMessageDialog(null, "Altura invalida!");
            imc();
        }
        total = peso / Math.pow(altura,2);
        imc = (int)total;

        if (total < 18.5) {
            JOptionPane.showMessageDialog(null, "IMC é: " + imc + " - Abaixo do peso!");
        }

        else if(total > 18.5 && total < 25) {
            JOptionPane.showMessageDialog(null, "IMC é: " + imc +" - Peso bom!");
        }

        else if(total > 25 && total < 30) {
            JOptionPane.showMessageDialog(null, "IMC é: " + imc + " - Acima do peso!");
        }

        else if(total >= 30 && total < 35) {
            JOptionPane.showMessageDialog(null, "IMC é: " + imc + " - 1º grau de obesidade!");
        }

        else if(total >= 35 && total < 40) {
            JOptionPane.showMessageDialog(null, "IMC é: " + imc + " - 2º grau de obesidade!");
        }

        else if(total > 40) {
            JOptionPane.showMessageDialog(null, "IMC é: " + imc + " - 3º grau de obesidade!");
        }

        closing();
    }
}

