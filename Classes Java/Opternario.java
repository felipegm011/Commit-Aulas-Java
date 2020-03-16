import java.util.Scanner;
public class Opternario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int a,b;
		System.out.println("Digite os valores");
		
		//convertendo entrada string para inteiro
		a = Integer.parseInt(entrada.nextLine());
		b = Integer.parseInt(entrada.nextLine());

		
		//aplicando de do system o operador ternario 
		System.out.println("o maior numero é: "+(a>b ? a:b ));
		
	}

}
