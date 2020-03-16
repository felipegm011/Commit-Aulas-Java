import java.util.Scanner;
public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite numero");
		int num = entrada.nextInt();
		
		while( num != 0) {
			num = entrada.nextInt();
			System.out.println("seu numero foi: " + num);	
			
		}
		
	}

}
