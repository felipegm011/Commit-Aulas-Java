
public class Math_math {	// analisar documentação existe várias metodos interesantes da classe

	public static void main(String[] args) {
		
		// essa classe não precisa ser importada 
		
		double result =  Math.sqrt(10);	// raiz quadrada
		double aux = Math.pow(9, 2);	// 9 elevado a 2 
		
		for(int i = 0;i<5;i++) {	// gerando numeros aleatórios 
		double ale = (int) (Math.random() * 10);	
		System.out.println("numero" +i+ "=" + ale);
		}
	}

}
