/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpr.lp.covid.tds.dao;

import br.ifpr.lp.covid.tds.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Renato
 */
public class UsuarioDAO {
    
    public void inserirUsuario(Usuario usuario) throws Exception {
        
            Connection anConnection = Conexao.getInstance().getConnection();
            String sql = " INSERT INTO usuario (nome, senha, perfil) VALUES ( ?, ?, ?) ";
            PreparedStatement pstm = anConnection.prepareStatement(sql);
            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getSenha());
            pstm.setString(3, usuario.getPerfil());
            pstm.execute();
     
    }
    
    public void removerUsuario(Long id) throws Exception {
        
            Connection anConnection = Conexao.getInstance().getConnection();
            String sql = " DELETE FROM usuario WHERE ID = ? ";
            PreparedStatement pstm = anConnection.prepareStatement(sql);
            pstm.setLong(1, id);
            pstm.execute();
   
    }
    
    
    public Usuario listarUsuarioPorID(Long id) throws Exception {
        
            Connection anConnection = Conexao.getInstance().getConnection();
            String sql = " SELECT * FROM usuario WHERE ID = ? ";
            PreparedStatement pstm = anConnection.prepareStatement(sql);
            pstm.setLong(1, id);
            ResultSet rs = pstm.executeQuery();
            
            Usuario usuario = new Usuario();
            while(rs.next()){
                
                usuario.setId(id);
                usuario.setNome(rs.getString("nome"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setPerfil(rs.getString("perfil"));
            }

            
            return usuario;
    }
    
    public Usuario listarUsuarioPorNome(String nome) throws Exception {
        
            Connection con = Conexao.getInstance().getConnection();
            String sql = " SELECT * FROM usuario WHERE nome = ? ";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, nome);
            
            ResultSet rs = pstm.executeQuery();
            
            Usuario usuario = null;
            while(rs.next()){
                usuario = new Usuario();
                usuario.setId(rs.getLong("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setPerfil(rs.getString("perfil"));
            }
            
            return usuario;
    }
    
    public List<Usuario> listarTodos () throws Exception {
        
        Connection anConnection = Conexao.getInstance().getConnection();
        String sql = " SELECT * FROM usuario ";
        PreparedStatement pstm = anConnection.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery(sql);

        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();

        while(rs.next()){
            usuario.setId(rs.getLong("id"));
            usuario.setNome(rs.getString("nome"));
            usuario.setSenha(rs.getString("senha"));
            usuario.setPerfil(rs.getString("perfil"));
            usuarios.add(usuario);
        }

        return usuarios;
    
    }
    
}
