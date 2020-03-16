import javax.swing.JOptionPane;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero[] = new int[5];
			int i;
			JOptionPane.showMessageDialog(null, "Digite os Nomes");
			// estrutura de repetição 
		for(i  = 0; i < 5 ; i++) {
			 /* poderia usar numero.length se objeto for menor que o tamanhho dela*/
			
			// neste ponto a variavel de controle vira array
			numero[i] =  (Integer.parseInt(JOptionPane.showInputDialog("Idades")));
			JOptionPane.showMessageDialog(null, "Os nomes são"+ " "+" "+numero[i]);
		}	
		
	}

}
