import java.util.Date;		// importando a classe date
import java.text.SimpleDateFormat;
public class Formatação_Data {
 // todas as informações de como usar essa classe estão na documentação java
	public static void main(String[] args) {
		//1ª formatação
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		Date data = new Date();
		System.out.println(formatador.format(data));
		
		// 2ª formatação
		SimpleDateFormat formatador2 = new SimpleDateFormat("EEEE, dd' de 'MMMMM' de 'yyyy");
		System.out.println(formatador2.format(data));
		
		//servetambém para formatar numero 2 param ("0.01") casas decimais e nome objeto.format(variavel)
	}

}
