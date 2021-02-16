package VIEW;

import DATABASE.UsuarioBD;
import CLASSES.Usuario;
import java.awt.event.KeyEvent;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FormLogin extends javax.swing.JFrame {

    public FormLogin() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblPasswod = new javax.swing.JLabel();
        btnAccess = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agendamento - Login");
        setName("frameLogin"); // NOI18N
        setResizable(false);

        lblUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setText("Usuário");

        lblPasswod.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPasswod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPasswod.setText("Senha");

        btnAccess.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAccess.setText("Acessar");
        btnAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccessActionPerformed(evt);
            }
        });

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUser)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPasswod))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAccess)
                .addGap(113, 113, 113))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPasswod, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAccess, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccessActionPerformed
        int telaAcesso = autenticarBD();
        
        //Caso telaPrincipal seja 0, abre a tela de usuário normal, caso seja 1 abre a tela de administrador.
        if(telaAcesso == 0){
            dispose();
            
            TelaPrincipal tp = new TelaPrincipal();
            
            tp.setLocationRelativeTo(null);
            tp.setVisible(true);
        }
        else if(telaAcesso == 1){
            dispose();
            
            JOptionPane.showMessageDialog(null, "Admin User");
        }
    }//GEN-LAST:event_btnAccessActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed
//Ao pressionar enter após digitar a senha, a função de autenticação também é acionada.
    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            int telaAcesso = autenticarBD();
        
            //Caso telaPrincipal seja 0, abre a tela de usuário normal, caso seja 1 abre a tela de administrador.
            if(telaAcesso == 0){
                dispose();
            
                TelaPrincipal tp = new TelaPrincipal();
            
                tp.setLocationRelativeTo(null);
                tp.setVisible(true);
            }
            else if(telaAcesso == 1){
                dispose();
            
                JOptionPane.showMessageDialog(null, "Admin User");
            }            
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormLogin telaLogin = new FormLogin();
                telaLogin.setLocationRelativeTo(null);
                telaLogin.setVisible(true);
            }
        });
    }
    
    //Função responsável por realizar a autenticação do usuário ao Banco de Dados
    //Posteriormente alterar o retorno da função para int a fim de identificar previlégio de administrador
    private int autenticarBD() {
        int eAdmin = -1;
        
        try {
            Usuario usuario = new Usuario();
            UsuarioBD usuarioBD = new UsuarioBD();
            
            String user_name = txtUser.getText();
            usuario.setUserName(user_name);            
            usuario.setPassword(new String(txtPassword.getPassword()));
            
            ResultSet rs = usuarioBD.autenticacaoUsuario(usuario);

            if (rs.next()) {
                //retorna o previlégio administrativo do usuário autenticado.
                
                eAdmin = Integer.parseInt(rs.getString("admin"));                
                
                return eAdmin;

            } else {
                //Caso ocorra erro de autenticação.
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválida...");
                
                txtUser.setText("");
                txtPassword.setText("");
            }
        } catch (SQLException error) {
            //Caso ocorra erro no banco de dados.
            JOptionPane.showMessageDialog(null, "formLogin: " + error.getMessage());
        }
        
        return eAdmin;
    }
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccess;
    private javax.swing.JLabel lblPasswod;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
