/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpr.lp.covid.tds.controller;

import static br.ifpr.lp.covid.tds.controller.UsuarioSessao.setUsuarioLogado;
import br.ifpr.lp.covid.tds.dao.UsuarioDAO;
import br.ifpr.lp.covid.tds.model.Usuario;

/**
 *
 * @author Renato
 */
public class LoginController {
    
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    
    public Usuario login(String nome, String senha) throws Exception{
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        Usuario usuario = usuarioDAO.listarUsuarioPorNome(nome);

        if (usuario == null) {
            throw new Exception("Usuário " + nome + " não cadastrado!");
        } else {
            if (!senha.equals(usuario.getSenha())) {
                throw new Exception("Senha do usuário está errada!");
            }
        }
        
        setUsuarioLogado(usuario);
        
        return usuario;
    }

    public void logout() {
        setUsuarioLogado(null);
    }
    
}
