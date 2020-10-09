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
public class Venda {
    
    
    private double valorVenda;
    private Funcionario funcionario;

        //Gets e setters
    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    public void save() {
            /*
             * Calcula o valor da comissão de venda sem que haja a necessidade de
             * usar um switch para o tipo de cargo toda vez que o método <b>save</b> for executado.
             */
            final double valorComissao = this.funcionario.getCargo().calcularComissao(this.valorVenda);
            // . . .
            
            System.out.println(valorComissao);
        }
}
