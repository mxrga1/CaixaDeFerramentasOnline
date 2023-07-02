package View;

import Model.Ferramenta;
import DAO.FerramentaDAO;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class GerenciaFerramenta extends javax.swing.JFrame {

    private Ferramenta objferramenta;

    public GerenciaFerramenta() {
        initComponents();
        this.objferramenta = new Ferramenta();
        this.carregaTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        g_nome = new javax.swing.JTextField();
        g_marca = new javax.swing.JTextField();
        g_custo = new javax.swing.JTextField();
        c_voltar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        c_alterar = new javax.swing.JButton();
        c_apagar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFerramenta = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        g_nome.setBackground(new java.awt.Color(26, 29, 33));
        g_nome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        g_nome.setForeground(new java.awt.Color(255, 255, 255));
        g_nome.setBorder(null);
        g_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_nomeActionPerformed(evt);
            }
        });
        getContentPane().add(g_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 230, 20));

        g_marca.setBackground(new java.awt.Color(26, 29, 33));
        g_marca.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        g_marca.setForeground(new java.awt.Color(255, 255, 255));
        g_marca.setBorder(null);
        g_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_marcaActionPerformed(evt);
            }
        });
        getContentPane().add(g_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 220, 20));

        g_custo.setBackground(new java.awt.Color(26, 29, 33));
        g_custo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        g_custo.setForeground(new java.awt.Color(255, 255, 255));
        g_custo.setBorder(null);
        g_custo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_custoActionPerformed(evt);
            }
        });
        getContentPane().add(g_custo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, 200, 20));

        c_voltar.setBackground(new java.awt.Color(0, 0, 0));
        c_voltar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        c_voltar.setForeground(new java.awt.Color(255, 255, 255));
        c_voltar.setText("Voltar");
        c_voltar.setBorder(null);
        c_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_voltarActionPerformed(evt);
            }
        });
        getContentPane().add(c_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 635, 100, 25));

        jButton1.setBackground(new java.awt.Color(249, 211, 98));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("+ Cadastrar Ferramenta");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 280, 60));

        c_alterar.setBackground(new java.awt.Color(0, 0, 0));
        c_alterar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        c_alterar.setForeground(new java.awt.Color(255, 255, 255));
        c_alterar.setText("Alterar");
        c_alterar.setBorder(null);
        c_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_alterarActionPerformed(evt);
            }
        });
        getContentPane().add(c_alterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 460, 140, 30));

        c_apagar.setBackground(new java.awt.Color(0, 0, 0));
        c_apagar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        c_apagar.setForeground(new java.awt.Color(255, 255, 255));
        c_apagar.setText("Apagar");
        c_apagar.setBorder(null);
        c_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_apagarActionPerformed(evt);
            }
        });
        getContentPane().add(c_apagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 525, 130, 30));

        jTableFerramenta.setBackground(new java.awt.Color(249, 211, 98));
        jTableFerramenta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTableFerramenta.setForeground(new java.awt.Color(0, 0, 0));
        jTableFerramenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID FERRAMENTA", "NOME", "MARCA", "CUSTO"
            }
        ));
        jTableFerramenta.setSelectionBackground(new java.awt.Color(249, 179, 16));
        jTableFerramenta.setShowGrid(true);
        jTableFerramenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFerramentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFerramenta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 890, 293));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Gerenciar Ferramenta.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void g_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g_nomeActionPerformed

    private void g_custoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g_custoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g_custoActionPerformed

    private void c_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_voltarActionPerformed
        this.setVisible(false);

        TelaPrincipal objeto = new TelaPrincipal();
        objeto.setVisible(true);
    }//GEN-LAST:event_c_voltarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CadastroFerramenta objeto = new CadastroFerramenta();

        objeto.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void c_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_alterarActionPerformed
        try {
            // recebendo e validando dados da interface grafica.
            int id = 0;
            String nome = "";
            String marca = "";
            Double custo = 0.00;

            if (this.g_nome.getText().length() < 0) {
                throw new Mensagens("Nome Vazio");
            } else {
                nome = this.g_nome.getText();
            }

            if (this.g_marca.getText().length() < 0) {
                throw new Mensagens("Marca Vazio.");
            } else {
                marca = this.g_marca.getText();
            }

            if (this.g_custo.getText().length() < 0) {
                throw new Mensagens("Custo Vazio.");
            } else {
                custo = Double.valueOf(this.g_custo.getText());
            }

            if (this.jTableFerramenta.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione uma Ferramenta para Alterar");
            } else {
                id = Integer.parseInt(this.jTableFerramenta.getValueAt(this.jTableFerramenta.getSelectedRow(), 0).toString());
            }

            // envia os dados para o Aluno processar
            if (this.objferramenta.UpdateFerramentaBD(id, nome, marca, custo)) {

                // limpa os campos
                this.g_nome.setText("");
                this.g_marca.setText("");
                this.g_custo.setText("");
                JOptionPane.showMessageDialog(rootPane, "Ferramenta Alterado com Sucesso!");

            }
            System.out.println(this.objferramenta.getMinhaListaf().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número.");
        } finally {
            carregaTabela(); // atualiza a tabela.
        }
    }//GEN-LAST:event_c_alterarActionPerformed

    private void jTableFerramentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFerramentaMouseClicked
        if (this.jTableFerramenta.getSelectedRow() != -1) {

            String nome = this.jTableFerramenta.getValueAt(this.jTableFerramenta.getSelectedRow(), 1).toString();
            String marca = this.jTableFerramenta.getValueAt(this.jTableFerramenta.getSelectedRow(), 2).toString();
            String custo = this.jTableFerramenta.getValueAt(this.jTableFerramenta.getSelectedRow(), 3).toString();

            this.g_nome.setText(nome);
            this.g_marca.setText(marca);
            this.g_custo.setText(custo);
        }
    }//GEN-LAST:event_jTableFerramentaMouseClicked

    private void c_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_apagarActionPerformed
        try {
            // validando dados da interface gr�fica.
            int id = 0;
            if (this.jTableFerramenta.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Aluno para APAGAR");
            } else {
                id = Integer.parseInt(this.jTableFerramenta.getValueAt(this.jTableFerramenta.getSelectedRow(), 0).toString());
            }

            // retorna 0 -> primeiro bot�o | 1 -> segundo bot�o | 2 -> terceiro bot�o
            int resposta_usuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja APAGAR esta Ferramenta ?");

            if (resposta_usuario == 0) {// clicou em SIM

                // envia os dados para o Aluno processar
                if (this.objferramenta.DeleteFerramentaBD(id)) {

                    // limpa os campos
                    this.g_nome.setText("");
                    this.g_marca.setText("");
                    this.g_custo.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Ferramenta Apagada com Sucesso!");

                }

            }

            System.out.println(this.objferramenta.getMinhaListaf().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // atualiza a tabela.
            carregaTabela();
        }
    }//GEN-LAST:event_c_apagarActionPerformed

    private void g_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g_marcaActionPerformed

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
            java.util.logging.Logger.getLogger(GerenciaFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciaFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciaFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciaFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciaFerramenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton c_alterar;
    private javax.swing.JButton c_apagar;
    private javax.swing.JButton c_voltar;
    private javax.swing.JTextField g_custo;
    private javax.swing.JTextField g_marca;
    private javax.swing.JTextField g_nome;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFerramenta;
    // End of variables declaration//GEN-END:variables

    private void carregaTabela() {

        DefaultTableModel modelo = (DefaultTableModel) this.jTableFerramenta.getModel();
        modelo.setNumRows(0);

        ArrayList<Ferramenta> minhalista = new ArrayList<>();
        minhalista = objferramenta.getMinhaListaf();

        for (Ferramenta a : minhalista) {
            modelo.addRow(new Object[]{
                a.getId_ferramenta(),
                a.getNome(),
                a.getMarca(),
                a.getCusto(),
            });
        }
    }
}