/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhas;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author Felipe Gomes Mendes
 */
public class Pilhas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // o tipo do conjunto sempre deve ser uma classe
        // classe Stack, que modela e implementa a estrutura de dados do tipo pilha;
        Stack<Integer> pilha = new Stack<Integer>();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        System.out.println(pilha);

        // guardando elemento removido do topo em uma variavel
        //int aux = pilha.pop();
        //pilha.push(9);
        // devolvendo item removido antes para o todo da pilha 
        //pilha.push(aux);
        //System.out.println(pilha);
        ArrayList<Integer> aux2 = new ArrayList<Integer>();
        // esvaziando a pilha e adicionando os avlores ao arraylist
        while (!pilha.isEmpty()) {
            aux2.add(pilha.pop());
        }
        System.out.println(aux2);
        pilha.push(10);
        //
        for (int i = pilha.size() - 1; i >= 0; i--) {
            // size Retorna um int indicando o tamanho da list
            pilha.push(aux2.get(i));/// get retorna a quantidade de elementos na varial de arraylist
            System.out.println("Testando estrutura de repetição");
            System.out.println(i);
        }

        System.out.println(pilha);

        /* Stack<Integer> pilha = new Stack<Integer>();
       
            pilha.push(4);
            pilha.push(2);
            pilha.push(3);
            // buscando indíce do valor na pilha
            System.out.println("Posição do Primeiro Topo: " + pilha.search(3));
            System.out.println(pilha);
            System.out.println("Topo da Pilha" + " " + "=" + " " + pilha.pop());
            System.out.println(pilha);
            System.out.println("Atual da Pilha" + " " + "=" + " " + pilha.peek());
            System.out.println(pilha);
           
            System.out.println("Posição Elemento 4: " + pilha.search(4));
            pilha.push(9);
            System.out.println("Posição Elemento 9: " + pilha.search(9));
            System.out.println(pilha);
         */
    }

}
