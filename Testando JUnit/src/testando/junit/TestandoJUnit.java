
package testando.junit;

import javax.swing.JOptionPane;

/**
 * @author Felipe Gomes Mendes
 */
public class TestandoJUnit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RecebeNumero numero = new RecebeNumero(); 
        Calculadora com1 = new Calculadora();
        
        int a [] =  new int [2];
        
        for(int i = 0; i<2;i++){
            a[i]= Integer.parseInt(JOptionPane.showInputDialog("Digite os numero"));
            //System.out.println("O Numero na Posicao " + (i+1) + " = " +a[i] );
        }
        
        numero.setNum1(a[0]);
        numero.setNum2(a[1]);
       
        System.out.println("O Numero no Array P0 é =" + " " + numero.getNum1()+ "\n" + 
                           "O Numero no Array P1 é =" + " " + numero.getNum2() );
        
    }  
}
