import javax.swing.*;

public class mult {
     public static void main(String args[]){
        Test();
    }
    public static void Test(){
        double n1, n2, total=0;
        String SysInp="";

        SysInp = JOptionPane.showInputDialog(null, "primeiro numero: ");
        n1= Double.parseDouble(SysInp);
        SysInp = JOptionPane.showInputDialog(null, "segundo numero: ");
        n2 = Double.parseDouble(SysInp);

        total = n1 * n2;
        JOptionPane.showMessageDialog(null, "resposta é: " + total);
        System.exit(0);
    }
}
