import java.util.Date;		// importando a classe date
import java.text.SimpleDateFormat;
public class Formata��o_Data {
 // todas as informa��es de como usar essa classe est�o na documenta��o java
	public static void main(String[] args) {
		//1� formata��o
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		Date data = new Date();
		System.out.println(formatador.format(data));
		
		// 2� formata��o
		SimpleDateFormat formatador2 = new SimpleDateFormat("EEEE, dd' de 'MMMMM' de 'yyyy");
		System.out.println(formatador2.format(data));
		
		//servetamb�m para formatar numero 2 param ("0.01") casas decimais e nome objeto.format(variavel)
	}

}
