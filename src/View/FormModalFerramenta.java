package View;

import Model.Ferramenta;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class FormModalFerramenta extends javax.swing.JFrame {

    private int idSelecionado = -1;
//    private String nomeSelecionado = null;
    private CadastroEmprestimo telaCadastroEmprestimo;
    
    public FormModalFerramenta(CadastroEmprestimo telaCadastroEmprestimo) {
        super();
        initComponents();
        carregaTabela();
        this.telaCadastroEmprestimo = telaCadastroEmprestimo;
    }
    
    public void carregaTabela() {
        
        Ferramenta objferramenta = new Ferramenta();

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFerramenta = new javax.swing.JTable();
        botao_selecionar = new javax.swing.JButton();
        b_voltar = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jTableFerramenta.setSelectionBackground(new java.awt.Color(249, 174, 34));
        jTableFerramenta.setShowGrid(true);
        jTableFerramenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFerramentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFerramenta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 920, 410));

        botao_selecionar.setBackground(new java.awt.Color(249, 211, 98));
        botao_selecionar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botao_selecionar.setForeground(new java.awt.Color(0, 0, 0));
        botao_selecionar.setText("Selecionar Ferramenta");
        botao_selecionar.setBorder(null);
        botao_selecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_selecionarActionPerformed(evt);
            }
        });
        getContentPane().add(botao_selecionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 590, 300, 60));

        b_voltar.setBackground(new java.awt.Color(0, 0, 0));
        b_voltar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b_voltar.setForeground(new java.awt.Color(255, 255, 255));
        b_voltar.setText("Voltar");
        b_voltar.setBorder(null);
        b_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_voltarActionPerformed(evt);
            }
        });
        getContentPane().add(b_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 610, 140, 30));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/buscar ferramentaJAVA.png"))); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableFerramentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFerramentaMouseClicked
        if (this.jTableFerramenta.getSelectedRow() != -1) {

            idSelecionado = Integer.parseInt(this.jTableFerramenta.getValueAt(this.jTableFerramenta.getSelectedRow(), 0).toString());
//            nomeSelecionado = this.jTableFerramenta.getValueAt(this.jTableFerramenta.getSelectedRow(), 1).toString();
        }
    }//GEN-LAST:event_jTableFerramentaMouseClicked

    private void b_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_voltarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_b_voltarActionPerformed

    private void botao_selecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_selecionarActionPerformed
        if (idSelecionado != -1){
        telaCadastroEmprestimo.PopularCamposTabelaFerramenta(idSelecionado);
        }
    }//GEN-LAST:event_botao_selecionarActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FormModalFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FormModalFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FormModalFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FormModalFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FormModalFerramenta().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_voltar;
    private javax.swing.JButton botao_selecionar;
    private javax.swing.JLabel fundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFerramenta;
    // End of variables declaration//GEN-END:variables
}
