/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostrategy;

/**
 *
 * @author Felipe Gomes Mendes
 */
public class Funcionario {
    
    private long id;
        /**
         * Definimos no corpo qual o tipo de implementação nossa
         * variável cargo deverá receber (novos tipos podem surgir
         * sem que haja muitos impactos), ex: cargo = Cargo.VENDEDOR;.
         */
        private Strategy cargo;
        // Construtor, getters e setters

   

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Strategy getCargo() {
        return cargo;
    }

    public void setCargo(Strategy cargo) {
        this.cargo = cargo;
    }
}
