/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuntos;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Felipe Gomes Mendes
 */
public class Conjuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tabela Hash set é uma interface Hashset é uma sub instancia 
        Set <String> nomes = new HashSet<String>();
        
        // a interface Set não permite repetição
        nomes.add("Felipe");
        nomes.add("Joyce");
        nomes.add("Ana Clara");
        nomes.add("Felipe");
        // para cada nome contido em nomes analise individual
        for(String nome: nomes){
            System.out.println("Selecionado: " + nome);
        }      
        
        
    }
    
}
