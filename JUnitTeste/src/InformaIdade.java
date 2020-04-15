/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felipe Gomes Mendes
 */
public class InformaIdade {
    public int AnoNascimento;
    public int AnoAtual;
    public int idade;
 
    public int checaIdade(int num, int num2){
        this.AnoAtual = num;
        this.AnoNascimento  = num2;
        int idadeAtual;
        idadeAtual = AnoAtual - AnoNascimento;
        this.idade = idadeAtual;
        return idadeAtual;
    }
}
