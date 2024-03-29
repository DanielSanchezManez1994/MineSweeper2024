/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.minesweeper;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author danielsanchez
 */
public class MineSweeper extends javax.swing.JFrame {

    private static ImageIcon smileIcon = null;
    
    /**
     * Creates new form MineSweeper
     */
    public MineSweeper() {
        
        setLocationRelativeTo(null);
        
        initComponents();
        
        board1.setFlagPanelInterface(flagPanel1);
        
        board1.setTimerInterface(timerText1);
        
        board1.initBoard();

        
        setSmileIcon();
        
        reSize();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        flagPanel1 = new com.mycompany.minesweeper.FlagPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButtonSmilyFace = new javax.swing.JButton();
        timerText1 = new com.mycompany.minesweeper.TimerText();
        board1 = new com.mycompany.minesweeper.Board();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(153, 255, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.add(flagPanel1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beginner", "Intermediate", "Difficult", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);

        jButtonSmilyFace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSmilyFaceActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSmilyFace);
        jPanel2.add(timerText1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);
        getContentPane().add(board1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        int option = jComboBox1.getSelectedIndex();

        switch (option) {
            case 0:
                ConfigData.getInstance().setLevel(LevelType.BEGINNER);
                break;
            case 1:
                ConfigData.getInstance().setLevel(LevelType.INTERMEDIATE);
                break;
            case 2:
                ConfigData.getInstance().setLevel(LevelType.DIFFYCULT);
                break;
            default:
                ConfigData.getInstance().setLevel(LevelType.BEGINNER);
                break;

        }


    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButtonSmilyFaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSmilyFaceActionPerformed
        // TODO add your handling code here
        
        restartGame();
        repaint();
    }//GEN-LAST:event_jButtonSmilyFaceActionPerformed

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
            java.util.logging.Logger.getLogger(MineSweeper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MineSweeper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MineSweeper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MineSweeper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MineSweeper().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.minesweeper.Board board1;
    private com.mycompany.minesweeper.FlagPanel flagPanel1;
    private javax.swing.JButton jButtonSmilyFace;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.mycompany.minesweeper.TimerText timerText1;
    // End of variables declaration//GEN-END:variables

    private void setSmileIcon() {
        if (smileIcon == null) {
            Image image = new ImageIcon(getClass().getResource("/images/smiley.png")).getImage();
            Image newimg = image.getScaledInstance(MineButton.button_size + 5, MineButton.button_size + 10, java.awt.Image.SCALE_SMOOTH);
            smileIcon = new ImageIcon(newimg);
            jButtonSmilyFace.setIcon(smileIcon);
        }
    }

    private void restartGame() {
       
       board1.deleteJpanels();
       board1.resetGame();
       board1.validate();
       timerText1.reset();
       flagPanel1.reset();
       reSize();
    }
    
    private void reSize(){
        board1.renewLayout();
        pack();
    }
}
