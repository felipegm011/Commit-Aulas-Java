/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostrategy;

import static padraostrategy.Cargo.GERENTE;
import static padraostrategy.Cargo.VENDEDOR;

/**
 *
 * @author Felipe Gomes Mendes
 */
public class PadraoStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Venda venda = new Venda();
        
        Funcionario funci = new Funcionario();
        
        funci.setId(0);
        funci.setCargo(VENDEDOR);
        
        venda.setValorVenda(100.00);
        venda.setFuncionario(funci);
        
        venda.save();
        
    }
    
}
