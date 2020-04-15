/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felipe Gomes Mendes
 */
public class ObterBeneficio extends FaixaEtaria{
    
    public void autorizaBeneficio(){
        if(this.idade < 65){
            System.out.println("Beneficio não Autorizado");
        }else if(this.idade >= 65){
            System.out.println("Beneficio Autorizado");
        }
    }
}
