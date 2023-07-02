
package View;

import Model.Cliente;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GerenciaCliente extends javax.swing.JFrame {

    private Cliente objcliente; // cria o v�nculo com o objaluno
    
    public GerenciaCliente() {
        initComponents();
        this.objcliente = new Cliente(); // carrega objaluno de aluno
        this.carregaTabela();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        g_nome = new javax.swing.JTextField();
        g_telefone = new javax.swing.JTextField();
        g_email = new javax.swing.JTextField();
        g_voltar = new javax.swing.JButton();
        g_alterar = new javax.swing.JButton();
        g_cadastrar = new javax.swing.JButton();
        g_apagar = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableCliente.setBackground(new java.awt.Color(249, 211, 98));
        jTableCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTableCliente.setForeground(new java.awt.Color(0, 0, 0));
        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "TELEFONE", "EMAIL"
            }
        ));
        jTableCliente.setSelectionBackground(new java.awt.Color(249, 175, 23));
        jTableCliente.setShowGrid(true);
        jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCliente);
        if (jTableCliente.getColumnModel().getColumnCount() > 0) {
            jTableCliente.getColumnModel().getColumn(0).setMaxWidth(70);
            jTableCliente.getColumnModel().getColumn(0).setHeaderValue("ID");
            jTableCliente.getColumnModel().getColumn(1).setMinWidth(180);
            jTableCliente.getColumnModel().getColumn(1).setMaxWidth(300);
            jTableCliente.getColumnModel().getColumn(1).setHeaderValue("NOME");
            jTableCliente.getColumnModel().getColumn(2).setMinWidth(120);
            jTableCliente.getColumnModel().getColumn(2).setMaxWidth(150);
            jTableCliente.getColumnModel().getColumn(2).setHeaderValue("TELEFONE");
            jTableCliente.getColumnModel().getColumn(3).setMinWidth(300);
            jTableCliente.getColumnModel().getColumn(3).setMaxWidth(500);
            jTableCliente.getColumnModel().getColumn(3).setHeaderValue("EMAIL");
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 137, 910, 290));

        g_nome.setBackground(new java.awt.Color(26, 29, 33));
        g_nome.setForeground(new java.awt.Color(255, 255, 255));
        g_nome.setBorder(null);
        g_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_nomeActionPerformed(evt);
            }
        });
        getContentPane().add(g_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 300, -1));

        g_telefone.setBackground(new java.awt.Color(26, 29, 33));
        g_telefone.setForeground(new java.awt.Color(255, 255, 255));
        g_telefone.setBorder(null);
        g_telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_telefoneActionPerformed(evt);
            }
        });
        getContentPane().add(g_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 300, -1));

        g_email.setBackground(new java.awt.Color(26, 29, 33));
        g_email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        g_email.setForeground(new java.awt.Color(255, 255, 255));
        g_email.setBorder(null);
        g_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_emailActionPerformed(evt);
            }
        });
        getContentPane().add(g_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 575, 300, -1));

        g_voltar.setBackground(new java.awt.Color(0, 0, 0));
        g_voltar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        g_voltar.setForeground(new java.awt.Color(255, 255, 255));
        g_voltar.setText("Voltar");
        g_voltar.setBorder(null);
        g_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_voltarActionPerformed(evt);
            }
        });
        getContentPane().add(g_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 633, 160, 30));

        g_alterar.setBackground(new java.awt.Color(0, 0, 0));
        g_alterar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        g_alterar.setForeground(new java.awt.Color(255, 255, 255));
        g_alterar.setText("Alterar");
        g_alterar.setBorder(null);
        g_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_alterarActionPerformed(evt);
            }
        });
        getContentPane().add(g_alterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 200, 30));

        g_cadastrar.setBackground(new java.awt.Color(249, 211, 98));
        g_cadastrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        g_cadastrar.setForeground(new java.awt.Color(0, 0, 0));
        g_cadastrar.setText("+ Cadastrar Novo Cliente");
        g_cadastrar.setBorder(null);
        g_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(g_cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 310, 50));

        g_apagar.setBackground(new java.awt.Color(0, 0, 0));
        g_apagar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        g_apagar.setForeground(new java.awt.Color(255, 255, 255));
        g_apagar.setText("Apagar");
        g_apagar.setBorder(null);
        g_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_apagarActionPerformed(evt);
            }
        });
        getContentPane().add(g_apagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 525, 200, 30));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gerenciar cliente.jpg"))); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void g_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g_nomeActionPerformed

    private void g_telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g_telefoneActionPerformed

    private void g_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g_voltarActionPerformed
        this.setVisible(false);
        
        TelaPrincipal objeto = new TelaPrincipal();
        objeto.setVisible(true);
    }//GEN-LAST:event_g_voltarActionPerformed

    private void g_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g_alterarActionPerformed
        try {
            // recebendo e validando dados da interface grafica.
            int id = 0;
            String nome = "";
            int telefone = 0;
            String email = "";

            if (this.g_nome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.g_nome.getText();
            }

            if (this.g_telefone.getText().length() < 8) {
                throw new Mensagens("Telefone deve haver 9 digitos.");
            } else {
                telefone = Integer.parseInt(this.g_telefone.getText());
            }

            if (this.g_email.getText().length() < 10) {
                throw new Mensagens("Email muito curto.");
            } else {
                email = this.g_email.getText();
            }

            if (this.jTableCliente.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Cliente para Alterar");
            } else {
                id = Integer.parseInt(this.jTableCliente.getValueAt(this.jTableCliente.getSelectedRow(), 0).toString());
            }

            // envia os dados para o Aluno processar
            if (this.objcliente.UpdateClienteBD(id, nome, telefone, email)) {

                // limpa os campos
                this.g_nome.setText("");
                this.g_telefone.setText("");
                this.g_email.setText("");
                JOptionPane.showMessageDialog(rootPane, "Cliente Alterado com Sucesso!");

            }
            System.out.println(this.objcliente.getMinhaListac().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número.");
        } finally {
            carregaTabela(); // atualiza a tabela.
        }
    }//GEN-LAST:event_g_alterarActionPerformed

    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked
        if (this.jTableCliente.getSelectedRow() != -1) {

            String nome = this.jTableCliente.getValueAt(this.jTableCliente.getSelectedRow(), 1).toString();
            String telefone = this.jTableCliente.getValueAt(this.jTableCliente.getSelectedRow(), 2).toString();
            String email = this.jTableCliente.getValueAt(this.jTableCliente.getSelectedRow(), 3).toString();

            this.g_nome.setText(nome);
            this.g_telefone.setText(telefone);
            this.g_email.setText(email);
        }
    
    }//GEN-LAST:event_jTableClienteMouseClicked

    private void g_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g_cadastrarActionPerformed
        CadastroCliente objeto = new CadastroCliente();

        objeto.setVisible(true);
    }//GEN-LAST:event_g_cadastrarActionPerformed

    private void g_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g_emailActionPerformed

    private void g_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g_apagarActionPerformed
        try {
            // validando dados da interface gr�fica.
            int id = 0;
            if (this.jTableCliente.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Aluno para APAGAR");
            } else {
                id = Integer.parseInt(this.jTableCliente.getValueAt(this.jTableCliente.getSelectedRow(), 0).toString());
            }

            // retorna 0 -> primeiro bot�o | 1 -> segundo bot�o | 2 -> terceiro bot�o
            int resposta_usuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja APAGAR este Cliente ?");

            if (resposta_usuario == 0) {// clicou em SIM

                // envia os dados para o Aluno processar
                if (this.objcliente.DeleteClienteBD(id)) {

                    // limpa os campos
                    this.g_nome.setText("");
                    this.g_telefone.setText("");
                    this.g_email.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Cliente Apagado com Sucesso!");

                }

            }

            System.out.println(this.objcliente.getMinhaListac().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // atualiza a tabela.
            carregaTabela();
        }
    }//GEN-LAST:event_g_apagarActionPerformed

    public void carregaTabela() {

        DefaultTableModel modelo = (DefaultTableModel) this.jTableCliente.getModel();
        modelo.setNumRows(0);

        ArrayList<Cliente> minhalista = new ArrayList<>();
        minhalista = objcliente.getMinhaListac();

        for (Cliente a : minhalista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getTelefone(),
                a.getEmail(),
            });
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciaCliente().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fundo;
    private javax.swing.JButton g_alterar;
    private javax.swing.JButton g_apagar;
    private javax.swing.JButton g_cadastrar;
    private javax.swing.JTextField g_email;
    private javax.swing.JTextField g_nome;
    private javax.swing.JTextField g_telefone;
    private javax.swing.JButton g_voltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCliente;
    // End of variables declaration//GEN-END:variables
}
