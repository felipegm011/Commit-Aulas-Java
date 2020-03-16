import java.util.Calendar;
import java.util.Scanner;
public class Classe_Calendar {

	public static void main(String[] args) {
		// a classe não precisa do metodo contrutor new
		Calendar agora = Calendar.getInstance(); 
		
		/* O OBJETO agora usa o metodo de retorno get e passa um parametro que é a propria
		classe.o metodo a ser chamado dia ou mes e etc...*/
		
		System.out.println("dia: "+ agora.get(Calendar.DAY_OF_MONTH));
		System.out.println("mes: "+ agora.get(Calendar.MONTH));
		System.out.println("ano: "+ agora.get(Calendar.YEAR));
		
		System.out.println("hora: "+ agora.get(Calendar.HOUR));
		System.out.println("minuto: "+ agora.get(Calendar.MINUTE));
		System.out.println("segundo: "+ agora.get(Calendar.SECOND));
		
		
		// setando dados usando a classe calendar comentrada dos usuário
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite os dadOs DD/MM/AAAA");
		String dados = entrada.nextLine(); // recebendo dados
		String parte[] = dados.split("/"); // criando o array e quebrando a string
		int dia = Integer.parseInt(parte[0]); // convertendo as partes do array em inteiro
		int mes = Integer.parseInt(parte[1]);
		int ano = Integer.parseInt(parte[2]);
		
		/* no Objeto quando é usando o medoto SET deve ser informado dois parametros
		1º o que queremos e 2º sengundo o valor que pode está em outra variavel*/
		
		Calendar datanasc = Calendar.getInstance();
		datanasc.set(Calendar.DAY_OF_MONTH, dia);
		datanasc.set(Calendar.MONTH, (mes));
		datanasc.set(Calendar.YEAR, ano);
		
		// exibindo saida com o OBJETO
		System.out.println("dia: "+ datanasc.get(Calendar.DAY_OF_MONTH));
		System.out.println("mes: "+ datanasc.get(Calendar.MONTH));
		System.out.println("ano: "+ datanasc.get(Calendar.YEAR));
		
		
		
	}

}
