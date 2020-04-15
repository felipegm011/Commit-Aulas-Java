
package testando.junit;

/**
 * @author Felipe Gomes Mendes
 */
public class Calculadora extends RecebeNumero{
    
    public int Soma(){		
        int resultado;
        resultado = num1 + num2;
        return resultado;
    }
	
    public int Mult() {
        int resultado;
        resultado = num1 * num2;
        return resultado;
    }

    public int div() {
        int resultado;
        resultado = num1 / num2;
        return resultado;	
    }
}
