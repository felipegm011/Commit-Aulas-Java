	//classe para entrada de dados
import java.util.Scanner;
	//classe para interface 
import javax.swing.JOptionPane;
public class Teste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int x,y,troco;
		String nome;
		
		nome = JOptionPane.showInputDialog("Nome do Atendente: ");
		x = Integer.parseInt( JOptionPane.showInputDialog("Digite o preço do produto: "));
		y = Integer.parseInt( JOptionPane.showInputDialog("Valor recebido do cliente "));
		
		
		/*		// Usando metodo DE CONVERSÃO DE DADOS parse 
		System.out.println("preço do produto: ");
		x = Integer.parseInt(entrada.nextLine());
		
		System.out.println("valor recebido do cliente: ");
		y = Integer.parseInt(entrada.nextLine()); 	
		*/
		
		troco = y-x;
		
		System.out.printf("O nome do atendente é: "+nome+"|"+"valor do produto: "+x+"|"
		+"o valor recebido foi: "+y+"|"+"o troco a receber é: "+troco);
			
	}
}

