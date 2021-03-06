/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpr.lp.covid.tds.view;

import br.ifpr.lp.covid.tds.controller.UsuarioController;
import br.ifpr.lp.covid.tds.model.Usuario;
import java.awt.HeadlessException;
import java.awt.TrayIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Renato
 */
public class CadUsuario extends javax.swing.JFrame {

    private Usuario usuarioSelecionado;

    UsuarioController usuarioController = new UsuarioController();

    public Usuario getUsuarioSelecionado() {
        return usuarioSelecionado;
    }

    public void setUsuarioSelecionado(Usuario usuarioSelecionado) {
        this.usuarioSelecionado = usuarioSelecionado;

        if (usuarioSelecionado != null) {
            jtfNome.setText(usuarioSelecionado.getNome());
            jpfSenha.setText(usuarioSelecionado.getSenha());
            jcbPerfil.setSelectedItem(usuarioSelecionado.getPerfil());
        }
    }

    /**
     * Creates new form CadUsuario
     */
    public CadUsuario() {

        initComponents();

        jpfSenha.setText("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGeral = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jpfSenha = new javax.swing.JPasswordField();
        jcbPerfil = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setUndecorated(true);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        pnlGeral.setBackground(new java.awt.Color(51, 51, 51));
        pnlGeral.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuário");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Senha");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Perfil");

        jtfNome.setBackground(new java.awt.Color(102, 102, 102));
        jtfNome.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtfNome.setForeground(new java.awt.Color(255, 255, 255));

        jpfSenha.setBackground(new java.awt.Color(102, 102, 102));
        jpfSenha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jpfSenha.setForeground(new java.awt.Color(255, 255, 255));
        jpfSenha.setText("jPasswordField1");

        jcbPerfil.setBackground(new java.awt.Color(102, 102, 102));
        jcbPerfil.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jcbPerfil.setForeground(new java.awt.Color(255, 255, 255));
        jcbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "usuario" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jtfNome)
                    .addComponent(jpfSenha)
                    .addComponent(jcbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pnlGeral.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(484, 50));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jButton1.setBackground(new java.awt.Color(0, 153, 102));
        jButton1.setText("Gravar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        pnlGeral.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(pnlGeral);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Usuario usuario = new Usuario();
        if (usuarioSelecionado != null) {
            usuario = usuarioSelecionado;
        }

        usuario.setNome(jtfNome.getText());
        usuario.setSenha(new String(jpfSenha.getPassword()));
        usuario.setPerfil(jcbPerfil.getSelectedItem().toString());

        if (validarCamposObrigatorios(usuario)) {

            try {
                if (usuario.getId() != null) {
                    usuarioController.atualizar(usuario);
                    JOptionPane.showMessageDialog(this, "Usuário atualizado com sucesso!", "Sucesso", TrayIcon.MessageType.INFO.ordinal());

                    abrirListagem();

                } else {
                    usuarioController.inserir(usuario);
                    JOptionPane.showMessageDialog(this, "Usuário salvo com sucesso!", "Sucesso", TrayIcon.MessageType.NONE.ordinal());
                }

                jtfNome.setText("");
                jpfSenha.setText("");
                jcbPerfil.setSelectedIndex(0);

            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", TrayIcon.MessageType.ERROR.ordinal());
            }

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private boolean validarCamposObrigatorios(Usuario usuario) throws HeadlessException {
        if (usuario.getNome().isBlank()) {
            JOptionPane.showMessageDialog(this, "Nome deve ser informado!", "Campo Obrigatório", TrayIcon.MessageType.ERROR.ordinal());
            jtfNome.requestFocus();
            return false;
        }

        if (usuario.getSenha().isBlank()) {
            JOptionPane.showMessageDialog(this, "Senha deve ser informada!", "Campo Obrigatório", TrayIcon.MessageType.ERROR.ordinal());
            jpfSenha.requestFocus();
            return false;
        }

        return true;
    }

    private void abrirListagem() {
        ListUsuario list = new ListUsuario();
        list.setLocationRelativeTo(null);
        list.setVisible(true);
        this.dispose();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        abrirListagem();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
            Object[] options = {"Sim", "Não"};

            int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover o usuário?");

            if (resposta == JOptionPane.YES_OPTION) {
                usuarioController.remover(usuarioSelecionado);
                JOptionPane.showMessageDialog(this, "Usuário removido com sucesso!", "Sucesso", TrayIcon.MessageType.INFO.ordinal());

                abrirListagem();
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", TrayIcon.MessageType.ERROR.ordinal());
        }

    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> jcbPerfil;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JPanel pnlGeral;
    // End of variables declaration//GEN-END:variables
}
