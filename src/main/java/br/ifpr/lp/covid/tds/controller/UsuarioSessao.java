/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpr.lp.covid.tds.controller;

import br.ifpr.lp.covid.tds.model.Usuario;

/**
 *
 * @author Renato
 */
public class UsuarioSessao {
    
    private static Usuario usuarioLogado;

    public static Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public static void setUsuarioLogado(Usuario usuarioLogado) {
        UsuarioSessao.usuarioLogado = usuarioLogado;
    }
    
}
