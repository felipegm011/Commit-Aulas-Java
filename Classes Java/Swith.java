import java.util.Scanner;
public class Swith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite um numero de 0 a 9");
		
		int num = entrada.nextInt();
		String numero = "";
		
		
		// obs o swithc só funciona com numeros inteiros ou CHAR
		switch (num) {		//varialvel de entrada
			
			case 0:			// casos 
			numero = "zero";
			break;
			
			case 1:
			numero = "um";
			break;	
			default:
			numero = "numero invalido";		// caso não esteja dentro dos casos o valor padrão é
		}System.out.println(numero);
		
	}

}
