/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpr.lp.covid.tds.model;

import java.util.Date;

/**
 *
 * @author Renato
 */

public class DadosPais {
    
    private String pais;
    
    private Long novosCasos;
            
    private Long totalDeCasos;
    
    private Long novasMortes;
    
    private Long totalMorte;
    
    private Long novosRecuperados;
    
    private Long totalRecuperados;
    
    private Date dataAtualizacao;

    @Override
    public String toString() {
        return "DadosPa\u00eds{" + "pais=" + pais + ", novosCasos=" + novosCasos + ", totalDeCasos=" + totalDeCasos + ", novasMortes=" + novasMortes + ", totalMorte=" + totalMorte + ", novosRecuperados=" + novosRecuperados + ", totalRecuperados=" + totalRecuperados + ", dataAtualizacao=" + dataAtualizacao + '}';
    }
    
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Long getNovosCasos() {
        return novosCasos;
    }

    public void setNovosCasos(Long novosCasos) {
        this.novosCasos = novosCasos;
    }

    public Long getTotalDeCasos() {
        return totalDeCasos;
    }

    public void setTotalDeCasos(Long totalDeCasos) {
        this.totalDeCasos = totalDeCasos;
    }

    public Long getNovasMortes() {
        return novasMortes;
    }

    public void setNovasMortes(Long novasMortes) {
        this.novasMortes = novasMortes;
    }

    public Long getTotalMorte() {
        return totalMorte;
    }

    public void setTotalMorte(Long totalMorte) {
        this.totalMorte = totalMorte;
    }

    public Long getNovosRecuperados() {
        return novosRecuperados;
    }

    public void setNovosRecuperados(Long novosRecuperados) {
        this.novosRecuperados = novosRecuperados;
    }

    public Long getTotalRecuperados() {
        return totalRecuperados;
    }

    public void setTotalRecuperados(Long totalRecuperados) {
        this.totalRecuperados = totalRecuperados;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }
    
}
