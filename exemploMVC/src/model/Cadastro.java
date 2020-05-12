
package model;

/**
 *
 * @author Felipe Gomes Mendes
 */
// CLASSE BASEADA NA TABELA A SER MAPEADA
// JAVABEANS É UM PASDRÃO DE PROJETO JAVA PARA A CRIAÇÃO DE CLASSES MODEL
// o padrão dao separa as operações de mapeamento de tabela e classes que executam consultas

public class Cadastro {
    private String nome;
    private String telefone;

    public Cadastro(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String toString(){
        return nome + " - " + telefone;
    }
}
