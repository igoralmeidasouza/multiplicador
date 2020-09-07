package Exercicio0706;
import javax.swing.JOptionPane;  

public class Exercicio0706 {
	public static void main(String args []){
        double salariobruto = 0.0;
        double salarioliquido = 0.0;
        int aliquota = 0;      
        String aux="";
        
        try {
        
                aux = JOptionPane.showInputDialog(null, "Informe seu salario", "Salario Bruto", JOptionPane.INFORMATION_MESSAGE);
                aux = aux.replace(',','.');
                salariobruto = Double.parseDouble(aux);
        
       if (salariobruto < 465.00) {
                String mensagemerro = String.format("Salario Invalido");
                JOptionPane.showMessageDialog(null, "Apenas Acima de: R$465,00", mensagemerro,0); 
                System.exit(0);
       }
       else if (salariobruto >= 465.00 && salariobruto <= 965.67) { 
                aliquota = 8;
                double salariobru = salariobruto * aliquota;
                salariobru = salariobru / 100;
                salarioliquido = salariobruto - salariobru;
                String mensagem = String.format( "Salario Bruto: R$%,.2f%nAliquota do INSS: %d%%%n" +
                      "Valor do INSS: R$%,.2f%nSalario Liquido: R$%,.2f", salariobruto, aliquota, salariobru, salarioliquido);
                JOptionPane.showMessageDialog(null, mensagem, "Mensagem", 1);
                System.exit(0);
       } 
       else if (salariobruto >= 965.68 && salariobruto <= 1609.45) { 
                aliquota = 9;
                double salariobru = salariobruto * aliquota;
                salariobru = salariobru / 100;
                salarioliquido = salariobruto - salariobru;
                String mensagem = String.format( "Salario Bruto: R$%,.2f%nAliquota do INSS: %d%%%n" +
                      "Valor do INSS: R$%,.2f%nSalario Liquido: R$%,.2f", salariobruto, aliquota, salariobru, salarioliquido);
                JOptionPane.showMessageDialog(null, mensagem, "Mensagem", 1);
                System.exit(0); 
       }
         else if (salariobruto >= 1609.46 && salariobruto <= 3218.90) { 
                aliquota = 11;
                double salariobru = salariobruto * aliquota;
                salariobru = salariobru / 100;
                salarioliquido = salariobruto - salariobru;
                String mensagem = String.format( "Salario Bruto: R$%,.2f%nAliquota do INSS: %d%%%n" +
                      "Valor do INSS: R$%,.2f%nSalario Liquido: R$%,.2f", salariobruto, aliquota, salariobru, salarioliquido);
                JOptionPane.showMessageDialog(null, mensagem, "Mensagem", 1);
                System.exit(0);
       }
         else if (salariobruto > 3218.90) {
                //aliquota = 11; 
                String text = "Valor fixo";
                double inss = 354.07;
                salarioliquido = salariobruto - inss;
                String mensagem = String.format( "Salario Bruto: R$%,.2f%nAliquota do INSS: %s%n" +
                      "Valor do INSS: R$%,.2f%nSalario Liquido: R$%,.2f", salariobruto, text, inss, salarioliquido);
                JOptionPane.showMessageDialog(null, mensagem, "Mensagem", 1);
                System.exit(0);
         }
       }
         catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null,"Insira somente o salário", "ERRO!", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
        }
    }  
}