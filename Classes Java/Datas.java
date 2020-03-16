import java.util.Date;		// importando a classe date
public class Datas {

	public static void main(String[] args) {
		
		Date data = new Date();		//criando o objeto da classe
		
		// convertendo toda classe Date para uma string	dia, mes, ano hora
		String hoje = data.toString();  	
		System.out.println(hoje);
		
		
		// usando A classe Date com os metodos de retorno
		int dia = data.getDate();	// setando o dia atual na variavel 
		int mes = data.getMonth() + 1;	//setando mesDEVE SER REALIZADO UM INCREMENTO 
		int ano = (data.getYear()+1900);	// setando ano
		
		
		System.out.println(dia+"/"+mes+"/"+ano);

	}

}
