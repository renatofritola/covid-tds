/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpr.lp.covid.tds.view.tablemodel;

import br.ifpr.lp.covid.tds.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class UsuarioTableModel extends AbstractTableModel {

    private List<Usuario> usuarios;
     private String[] colunas = new String[]{
        "ID","Nome","Perfil"};

    /** Creates a new instance of DevmediaTableModel */
    public UsuarioTableModel(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public UsuarioTableModel(){
     this.usuarios = new ArrayList<Usuario>();
    }

    public int getRowCount() {
        return usuarios.size();
    }

    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int columnIndex){
      return colunas[columnIndex];
    }

     @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }


    public void setValueAt(Usuario aValue, int rowIndex) {
        Usuario usuario = usuarios.get(rowIndex);

        usuario.setId(aValue.getId());
        usuario.setNome(aValue.getNome());
        usuario.setPerfil(aValue.getPerfil());
        
        fireTableCellUpdated(rowIndex, 0);
        fireTableCellUpdated(rowIndex, 1);
        fireTableCellUpdated(rowIndex, 2);

    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
      Usuario usuario = usuarios.get(rowIndex);

     switch (columnIndex) {
         case 0:
             usuario.setId((long) aValue);
         case 1:
             usuario.setNome(aValue.toString());
         case 2:
             usuario.setPerfil(aValue.toString());

         default:
             System.err.println("Índice da coluna inválido");
     }
     fireTableCellUpdated(rowIndex, columnIndex);
     }


    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario usuarioSelecionado = usuarios.get(rowIndex);
        String valueObject = null;
        switch(columnIndex){
            case 0: valueObject = String.valueOf(usuarioSelecionado.getId());  break;
            case 1: valueObject = usuarioSelecionado.getNome(); break;
            case 2 : valueObject = usuarioSelecionado.getPerfil(); break;
            default: System.err.println("Índice inválido para propriedade do bean Usuario.class");
        }

        return valueObject;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }


    public Usuario getUsuario(int indiceLinha) {
        return usuarios.get(indiceLinha);
    }

    public void addUsuario(Usuario u) {
        usuarios.add(u);


        int ultimoIndice = getRowCount() - 1;

        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }


    public void removeUsuario(int indiceLinha) {
        usuarios.remove(indiceLinha);

        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }


    public void addListaDeUsuarios(List<Usuario> novosUsuarios) {

        int tamanhoAntigo = getRowCount();
        usuarios.addAll(novosUsuarios);
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }

    public void limpar() {
        usuarios.clear();
        fireTableDataChanged();
    }

    public boolean isEmpty() {
        return usuarios.isEmpty();
    }

}