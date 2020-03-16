import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Enumeration;
public class Lista {

	public static void main(String[] args) {
		
		ArrayList lista = new ArrayList();

		// o metodo add recebe qualquer tipo de valor deve ser feita a conversão caso deseje armaze
		
		lista.add("felipe");
		lista.add("maria");
		lista.add("joyce");
		lista.add("jose");
		lista.add("leandro");
		lista.add("gomes");	// adicionando valor na lista
		
		// fazendo uma verificação na lista com o metodo contains
		
		if (lista.contains("joyce")) {
			System.out.println("resultado da verificação: achou");
		}else {	
			System.out.println("não cadastrada");
		}
		
		// fazendo uma conversão cast de toda lista para string
		
		String result = (String) lista.get(0);
		System.out.println("primeiro elemento da lista" + " : " + result);

		// retornando o ultimo regstro da listaa
		
		String ultimo = (String) lista.get(lista.size()-1);
		System.out.println(ultimo);
		
		// resgatando e percorrendo os elementos da lista 
		
		for(int i = 0;i < lista.size();i++) {
			String aux = (String) lista.get(i);		
			System.out.println("elementos: "+ (i+1) +"=" + aux);
			}
			
		/*for( String element : lista ) { 
			System.out.println("Os elementos: "+ (element));
			}*/
	
		
		/*aqui no hashtable se usa uma chave para fazer a consulta no objeto 1 param
		é a chave p segundo o valor */
		
		Hashtable teste = new Hashtable ();
		// inserirndo valor na lista
		teste.put("chave","felipe"); // o primeiro valor é a chave o segundo o valor string, int
		teste.put("#1", "gomes");
		
		String a = (String) teste.get("#1");
		System.out.println("usando hastable"+ " "+ a);
		
		// percorrendo a lista com hastable metodo muito usando em frameworks
		
		Enumeration en = teste.elements();	// criando objeto
		
		while (en.hasMoreElements()) {	// usando metodo da classe enumeration
			a = (String) en.nextElement();
			System.out.println(a);
		}

	}
	
}


