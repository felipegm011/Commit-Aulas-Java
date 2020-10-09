package dao;

import java.sql.Date;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felipe Gomes Mendes
 */
public class Curso {
    
    private String descricao;
    //private String dtinicio;
    ///private String dtfim;
    private int quantidade;
    
       

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
   /*
    public String getDtinicio() {
        return dtinicio;
    }

    public void setDtinicio(String dtinicio) {
        this.dtinicio = dtinicio;
    }

    public String getDtfim() {
        return dtfim;
    }

    public void setDtfim(String dtfim) {
        this.dtfim = dtfim;
    }
*/
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
