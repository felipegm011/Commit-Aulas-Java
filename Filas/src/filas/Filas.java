package filas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Felipe Gomes Mendes
 */
public class Filas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        // Queue é uma interface LinkedList é uma classe que adiciona dados em sequencia
        Queue <Integer> fila = new LinkedList<Integer>();
        
        for (int i = 0; i < 3 ; i ++){
            fila.add(i);
        }
        System.out.println(fila);
        // peek mostra o primeiro elemento da fila
        System.out.println("primeiro da fila: " + fila.peek());
        // poll remove o primeiro elemento da fila
        System.out.println("atender o primeiro da fila: " + fila.poll());
        
        */
          Stack <Integer> pilha = new Stack<Integer>();
          Queue <Integer> fila = new LinkedList<Integer>();
          Scanner entrada = new Scanner(System.in);
          
          // Invertendo dados de uma pilha
          
          for(int i = 0; i < 4; i++){
              fila.add(entrada.nextInt());
          }
          System.out.println(fila);
            
          while(!fila.isEmpty()){
            // 
            pilha.push(fila.poll());  
          }  
            System.out.println("Pilha: " + fila);
            System.out.println("Fila: " + pilha);
            
            while(!pilha.isEmpty()){
            // 
            fila.add(pilha.pop());  
          }
            //System.out.println("Pilha: " + pilha);
            System.out.println("Pilha: " + fila);
    }
    
}
