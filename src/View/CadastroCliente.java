package View;

import Model.Cliente;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CadastroCliente extends javax.swing.JFrame {

    private Cliente objcliente;
    
    public CadastroCliente() {
        initComponents();
        this.objcliente = new Cliente();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        c_nome = new javax.swing.JTextField();
        c_telefone = new javax.swing.JTextField();
        c_email = new javax.swing.JTextField();
        bvoltar = new javax.swing.JButton();
        jCadastrar = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        c_nome.setBackground(new java.awt.Color(26, 29, 33));
        c_nome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        c_nome.setForeground(new java.awt.Color(255, 255, 255));
        c_nome.setBorder(null);
        getContentPane().add(c_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 380, 40));

        c_telefone.setBackground(new java.awt.Color(26, 29, 33));
        c_telefone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        c_telefone.setForeground(new java.awt.Color(255, 255, 255));
        c_telefone.setBorder(null);
        getContentPane().add(c_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 380, 40));

        c_email.setBackground(new java.awt.Color(26, 29, 33));
        c_email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        c_email.setForeground(new java.awt.Color(255, 255, 255));
        c_email.setBorder(null);
        c_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_emailActionPerformed(evt);
            }
        });
        getContentPane().add(c_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 380, 40));

        bvoltar.setBackground(new java.awt.Color(147, 122, 34));
        bvoltar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bvoltar.setForeground(new java.awt.Color(0, 0, 0));
        bvoltar.setText("Voltar");
        bvoltar.setBorder(null);
        bvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bvoltarActionPerformed(evt);
            }
        });
        getContentPane().add(bvoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 130, 40));

        jCadastrar.setBackground(new java.awt.Color(249, 211, 98));
        jCadastrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        jCadastrar.setText("+ Cadastrar novo cliente");
        jCadastrar.setBorder(null);
        jCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 260, 60));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cadastra cliente.jpg"))); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bvoltarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_bvoltarActionPerformed

    private void jCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarActionPerformed
    try {
            // recebendo e validando dados da interface gr�fica.
            String nome = "";
            int telefone = 0;
            String email = "";

            if (this.c_nome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.c_nome.getText();
            }

            if (this.c_telefone.getText().length() < 9) {
                throw new Mensagens("Telefone deve haver 9 digitos.");
            } else {
                telefone = Integer.parseInt(this.c_telefone.getText());
            }
            
            if (this.c_email.getText().length() < 10) {
                throw new Mensagens("Email muito curto.");
            } else {
                email = this.c_email.getText();
            }

            // envia os dados para o Controlador cadastrar
            if (this.objcliente.InsertClienteBD(nome, telefone, email)) {
                JOptionPane.showMessageDialog(rootPane, "Cliente Cadastrado com Sucesso!");

                // limpa campos da interface
                this.c_nome.setText("");
                this.c_telefone.setText("");
                this.c_email.setText("");
            }

            System.out.println(this.objcliente.getMinhaListac().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número.");
        } catch (SQLException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jCadastrarActionPerformed

    private void c_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_emailActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bvoltar;
    private javax.swing.JTextField c_email;
    private javax.swing.JTextField c_nome;
    private javax.swing.JTextField c_telefone;
    private javax.swing.JLabel fundo;
    private javax.swing.JButton jCadastrar;
    // End of variables declaration//GEN-END:variables
}
