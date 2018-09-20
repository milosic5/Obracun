/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogs;

import controller.CentralPoint;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Rashod;
import tableModel.RashodTableModel;

/**
 *
 * @author Milos
 */
public class RashodiDialog extends javax.swing.JDialog {

    private RashodTableModel tableModel = new RashodTableModel();
    ArrayList<Rashod> listaRashoda;

    public RashodiDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("UNOS CEKOVA");
        this.setLocationRelativeTo(parent);
        rashodiTable.setModel(tableModel);
        listaRashoda = new ArrayList<>();
        updateData();

        rashodiTable.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {

                int row = rashodiTable.rowAtPoint(evt.getPoint());
                int col = rashodiTable.columnAtPoint(evt.getPoint());

                if (row >= 0 && col >= 0) {
                    sacuvajButton.setEnabled(true);
                    nazivTextField.setText(rashodiTable.getValueAt(row, 1).toString());
                    planiranoTextField.setText(String.valueOf(rashodiTable.getValueAt(row, 2)));
                    realizovanoTextField.setText(String.valueOf(rashodiTable.getValueAt(row, 3)));
                } else {

                }

            }

        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sacuvajButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nazivTextField = new javax.swing.JTextField();
        planiranoTextField = new javax.swing.JTextField();
        realizovanoTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        rashodiTable = new javax.swing.JTable();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        sacuvajButton.setText("Sacuvaj");
        sacuvajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacuvajButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Naziv:");

        jLabel2.setText("Planirana vrednost:");

        jLabel3.setText("Realizovana vrednost:");

        realizovanoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizovanoTextFieldActionPerformed(evt);
            }
        });

        rashodiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(rashodiTable);

        exitButton.setText("Izlaz");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(planiranoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(realizovanoTextField)))
                            .addComponent(sacuvajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(nazivTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nazivTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(planiranoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(realizovanoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(sacuvajButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(exitButton)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void realizovanoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizovanoTextFieldActionPerformed

    }//GEN-LAST:event_realizovanoTextFieldActionPerformed

    private void sacuvajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sacuvajButtonActionPerformed
        Rashod rashod = new Rashod();
        boolean azurirano = false;
        rashod.setNaziv(nazivTextField.getText());
        rashod.setPlaniranaVrednost(Integer.parseInt(planiranoTextField.getText()));
        rashod.setRealizovanaVrednost(Integer.parseInt(realizovanoTextField.getText()));
        for (Rashod rashod1 : listaRashoda) {
            if (rashod.getNaziv().equals(rashod1.getNaziv())) {
                azurirano = CentralPoint.getInstance().getProjectDao().azurirajRashod(rashod);
                JOptionPane.showMessageDialog(this, "Uspesno ste azurirali rashod");
                updateData();
            }
        }
        if (!azurirano) {
            if (CentralPoint.getInstance().getProjectDao().sacuvajRashod(rashod)) {
                JOptionPane.showMessageDialog(this, "Uspesno ste sacuvali rashod");
                clearData();
                updateData();
            }
        }
    }//GEN-LAST:event_sacuvajButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_exitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RashodiDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RashodiDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RashodiDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RashodiDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RashodiDialog dialog = new RashodiDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nazivTextField;
    private javax.swing.JTextField planiranoTextField;
    private javax.swing.JTable rashodiTable;
    private javax.swing.JTextField realizovanoTextField;
    private javax.swing.JButton sacuvajButton;
    // End of variables declaration//GEN-END:variables

    private void clearData() {
        nazivTextField.setText("");
        planiranoTextField.setText("");
        realizovanoTextField.setText("");
    }

    private void updateData() {
        tableModel.clearData();
        listaRashoda = CentralPoint.getInstance().getProjectDao().ucitajRashode();
        int id = 0;
        if (listaRashoda.size() > 0) {
            for (Rashod rashod : listaRashoda) {
                id++;
                tableModel.insertRow(id, rashod.getNaziv(), rashod.getPlaniranaVrednost(), rashod.getRealizovanaVrednost());
            }

        }
    }
}
