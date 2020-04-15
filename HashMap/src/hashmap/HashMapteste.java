/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Felipe Gomes Mendes
 */
public class HashMapteste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String,Integer> nomes = new HashMap<String,Integer>();
        Scanner entrada = new Scanner(System.in);
       
        String frase = entrada.nextLine();
        // acessando a
        entrada = new Scanner(frase);
       
        while(entrada.hasNext()){
            int cont;
            cont = nomes.get(entrada.next());
           
        }
    }
    
}
