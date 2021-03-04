/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpr.lp.covid.tds.controller;

import br.ifpr.lp.covid.tds.dao.UsuarioDAO;
import br.ifpr.lp.covid.tds.model.Usuario;
import java.util.List;

/**
 *
 * @author Renato
 */
public class UsuarioController {
    
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    
    public List<Usuario> listarUsuarios() throws Exception{
    
        return usuarioDAO.listarTodos();
        
    }
    
    public Usuario buscarPorId(Long id) throws Exception{
        
        return usuarioDAO.listarUsuarioPorID(id);
    
    }
    
    public void inserir(Usuario usuario) throws Exception{
        usuarioDAO.inserirUsuario(usuario);
    }
    
    public void atualizar(Usuario usuario) throws Exception{
        usuarioDAO.atualizarUsuario(usuario);
    }
    
    public void remover(Usuario usuario) throws Exception{
        usuarioDAO.removerUsuario(usuario.getId());
    }
    
}
