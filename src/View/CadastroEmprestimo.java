package View;

import Model.Emprestimo;
import Model.Ferramenta;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CadastroEmprestimo extends javax.swing.JFrame {
    
    private Emprestimo objemprestimo;
    private Ferramenta objferramenta;
    

    public CadastroEmprestimo() {
        initComponents();
        this.objemprestimo = new Emprestimo();
        this.objferramenta = new Ferramenta();
    }
    public void PopularCamposTabela(int id, String nome) {
        objemprestimo.setIdCliente(id);
        c_idCliente.setText(id+"");
        c_nome.setText(nome);
       
    }
    
    public void PopularCamposTabelaFerramenta(int id) {
        objferramenta.setId_ferramenta(id);
        c_idFerramenta.setText(id+"");
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        c_idCliente = new javax.swing.JTextField();
        c_idFerramenta = new javax.swing.JTextField();
        c_dataDevolucao = new javax.swing.JTextField();
        bvoltar = new javax.swing.JButton();
        c_cadastrar = new javax.swing.JButton();
        c_dataEmprestimo = new javax.swing.JTextField();
        selecionarcliente = new javax.swing.JButton();
        c_nome = new javax.swing.JTextField();
        selecionarferramenta = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        c_idCliente.setBackground(new java.awt.Color(26, 29, 33));
        c_idCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        c_idCliente.setForeground(new java.awt.Color(255, 255, 255));
        c_idCliente.setBorder(null);
        c_idCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_idClienteActionPerformed(evt);
            }
        });
        getContentPane().add(c_idCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 190, 40));

        c_idFerramenta.setBackground(new java.awt.Color(26, 29, 33));
        c_idFerramenta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        c_idFerramenta.setForeground(new java.awt.Color(255, 255, 255));
        c_idFerramenta.setBorder(null);
        c_idFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_idFerramentaActionPerformed(evt);
            }
        });
        getContentPane().add(c_idFerramenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 180, 40));

        c_dataDevolucao.setBackground(new java.awt.Color(26, 29, 33));
        c_dataDevolucao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        c_dataDevolucao.setForeground(new java.awt.Color(255, 255, 255));
        c_dataDevolucao.setBorder(null);
        getContentPane().add(c_dataDevolucao, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 560, 300, 40));

        bvoltar.setBackground(new java.awt.Color(0, 0, 0));
        bvoltar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bvoltar.setForeground(new java.awt.Color(255, 255, 255));
        bvoltar.setText("Voltar");
        bvoltar.setBorder(null);
        bvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bvoltarActionPerformed(evt);
            }
        });
        getContentPane().add(bvoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 685, 150, 50));

        c_cadastrar.setBackground(new java.awt.Color(224, 177, 35));
        c_cadastrar.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        c_cadastrar.setForeground(new java.awt.Color(0, 0, 0));
        c_cadastrar.setText("+ Realizar novo empréstimo");
        c_cadastrar.setBorder(null);
        c_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(c_cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 680, 380, 60));

        c_dataEmprestimo.setBackground(new java.awt.Color(26, 29, 33));
        c_dataEmprestimo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        c_dataEmprestimo.setForeground(new java.awt.Color(255, 255, 255));
        c_dataEmprestimo.setBorder(null);
        c_dataEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_dataEmprestimoActionPerformed(evt);
            }
        });
        getContentPane().add(c_dataEmprestimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 300, 40));

        selecionarcliente.setBackground(new java.awt.Color(249, 211, 98));
        selecionarcliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        selecionarcliente.setForeground(new java.awt.Color(0, 0, 0));
        selecionarcliente.setText("+ Selecionar cliente");
        selecionarcliente.setBorder(null);
        selecionarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarclienteActionPerformed(evt);
            }
        });
        getContentPane().add(selecionarcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 333, 310, 55));

        c_nome.setBackground(new java.awt.Color(26, 29, 33));
        c_nome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        c_nome.setForeground(new java.awt.Color(255, 255, 255));
        c_nome.setBorder(null);
        c_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nomeActionPerformed(evt);
            }
        });
        getContentPane().add(c_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 250, 30));

        selecionarferramenta.setBackground(new java.awt.Color(249, 211, 98));
        selecionarferramenta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        selecionarferramenta.setForeground(new java.awt.Color(0, 0, 0));
        selecionarferramenta.setText("+ Selecionar ferramenta");
        selecionarferramenta.setBorder(null);
        selecionarferramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarferramentaActionPerformed(evt);
            }
        });
        getContentPane().add(selecionarferramenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 443, 320, 55));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Realizar novo empréstimo JAVA.png"))); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c_idClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_idClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_idClienteActionPerformed

    private void bvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bvoltarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_bvoltarActionPerformed

    private void c_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_cadastrarActionPerformed
        try {
            // recebendo e validando dados da interface gráfica.
            int idCliente = 0;
            int idFerramenta = 0;
            String DataEmprestimo = "";
            String DataDevolucao = "";
            
          
            if (this.c_idCliente.getText().length() < 0) {
                throw new Mensagens("idCliente Vazio");
            } else {
                idCliente = Integer.parseInt(this.c_idCliente.getText());
            }

            if (this.c_idFerramenta.getText().length() < 0) {
                throw new Mensagens("idFerramenta Vazio");
            } else {
                idFerramenta = Integer.parseInt(this.c_idFerramenta.getText());
            }
            
            if (this.c_dataEmprestimo.getText().length() < 1) {
                throw new Mensagens("Data de Empréstimo Vazio.");
            } else {
                DataEmprestimo = this.c_dataEmprestimo.getText();
            }
            
            if (this.c_dataDevolucao.getText().length() < 1) {
                throw new Mensagens("Data de Devolução Vazio.");
            } else {
                DataDevolucao = this.c_dataDevolucao.getText();
            }

            // envia os dados para o Controlador cadastrar
            if (this.objemprestimo.InsertEmprestimoBD(idCliente, idFerramenta, DataEmprestimo, DataDevolucao)){
                JOptionPane.showMessageDialog(rootPane, "Emprestimo Cadastrado com Sucesso!");

                // limpa campos da interface
                this.c_idCliente.setText("");
                this.c_idFerramenta.setText("");
                this.c_dataEmprestimo.setText("");
                this.c_dataDevolucao.setText("");
            }

            System.out.println(this.objemprestimo.getMinhaListae().toString());
            

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número.");
        } catch (SQLException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_c_cadastrarActionPerformed

    private void c_dataEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_dataEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_dataEmprestimoActionPerformed

    private void selecionarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarclienteActionPerformed
        FormModalCliente objeto = new FormModalCliente(this);
        
        objeto.setVisible(true);
    }//GEN-LAST:event_selecionarclienteActionPerformed

    private void selecionarferramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarferramentaActionPerformed
        FormModalFerramenta objeto = new FormModalFerramenta(this);
        
        objeto.setVisible(true);
    }//GEN-LAST:event_selecionarferramentaActionPerformed

    private void c_idFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_idFerramentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_idFerramentaActionPerformed

    private void c_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_nomeActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CadastroEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bvoltar;
    private javax.swing.JButton c_cadastrar;
    private javax.swing.JTextField c_dataDevolucao;
    private javax.swing.JTextField c_dataEmprestimo;
    private javax.swing.JTextField c_idCliente;
    private javax.swing.JTextField c_idFerramenta;
    private javax.swing.JTextField c_nome;
    private javax.swing.JLabel fundo;
    private javax.swing.JButton selecionarcliente;
    private javax.swing.JButton selecionarferramenta;
    // End of variables declaration//GEN-END:variables
}
