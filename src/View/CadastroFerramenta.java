package View;

import Model.Ferramenta;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CadastroFerramenta extends javax.swing.JFrame {

    private Ferramenta objferramenta;
    
    public CadastroFerramenta() {
        initComponents();
        this.objferramenta = new Ferramenta();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        f_nome = new javax.swing.JTextField();
        f_marca = new javax.swing.JTextField();
        f_custo = new javax.swing.JTextField();
        f_voltar = new javax.swing.JButton();
        f_cadastrar = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        f_nome.setBackground(new java.awt.Color(26, 29, 33));
        f_nome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        f_nome.setForeground(new java.awt.Color(255, 255, 255));
        f_nome.setBorder(null);
        getContentPane().add(f_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 430, 40));

        f_marca.setBackground(new java.awt.Color(26, 29, 33));
        f_marca.setForeground(new java.awt.Color(255, 255, 255));
        f_marca.setBorder(null);
        getContentPane().add(f_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 430, 40));

        f_custo.setBackground(new java.awt.Color(26, 29, 33));
        f_custo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        f_custo.setForeground(new java.awt.Color(255, 255, 255));
        f_custo.setBorder(null);
        getContentPane().add(f_custo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 430, 40));

        f_voltar.setBackground(new java.awt.Color(249, 211, 98));
        f_voltar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        f_voltar.setForeground(new java.awt.Color(0, 0, 0));
        f_voltar.setText("Voltar");
        f_voltar.setBorder(null);
        f_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_voltarActionPerformed(evt);
            }
        });
        getContentPane().add(f_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 600, 140, 40));

        f_cadastrar.setBackground(new java.awt.Color(249, 211, 98));
        f_cadastrar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        f_cadastrar.setForeground(new java.awt.Color(0, 0, 0));
        f_cadastrar.setText("+ Cadastrar");
        f_cadastrar.setActionCommand("+ Cadastrar");
        f_cadastrar.setBorder(null);
        f_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(f_cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 580, 310, 70));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastra ferramenta.png"))); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//
    }//GEN-LAST:event_jButton1ActionPerformed

    private void f_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_voltarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_f_voltarActionPerformed

    private void f_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_cadastrarActionPerformed
        try {
            // recebendo e validando dados da interface gráfica.
            String nome = "";
            String marca = "";
            Double custo = 0.00;
            
          
            if (this.f_nome.getText().length() < 0) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.f_nome.getText();
            }

            if (this.f_marca.getText().length() < 0) {
                throw new Mensagens("Marca deve haver 2 digitos.");
            } else {
                marca = this.f_marca.getText();
            }
            
            if (this.f_custo.getText().length() < 0) {
                throw new Mensagens("Custo inexistente.");
            } else {
                custo = Double.valueOf(this.f_custo.getText());
            }

            // envia os dados para o Controlador cadastrar
            if (this.objferramenta.InsertFerramentaBD(nome, marca, custo)){
                JOptionPane.showMessageDialog(rootPane, "Ferramenta Cadastrado com Sucesso!");

                // limpa campos da interface
                this.f_nome.setText("");
                this.f_marca.setText("");
                this.f_custo.setText("");
            }

            System.out.println(this.objferramenta.getMinhaListaf().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número.");
        } catch (SQLException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_f_cadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFerramenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton f_cadastrar;
    private javax.swing.JTextField f_custo;
    private javax.swing.JTextField f_marca;
    private javax.swing.JTextField f_nome;
    private javax.swing.JButton f_voltar;
    private javax.swing.JLabel fundo;
    private javax.swing.JButton jButton1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
