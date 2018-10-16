/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogs;

import controller.CentralPoint;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;
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
        this.setTitle("RASHODI");
        this.setLocationRelativeTo(parent);
        rashodiTable.setModel(tableModel);
        listaRashoda = new ArrayList<>();
        updateData();
        rashodiTable.getColumnModel().getColumn(4).setCellRenderer(new ColorRenderer());

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
                    realizovanoCheckBox.setSelected(CentralPoint.getInstance().getProjectDao().ucitajRashodPoNazivu(rashodiTable.getValueAt(row, 1).toString()).isRealizovano());
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
        realizovanoCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        sacuvajButton.setText("Sačuvaj");
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

        realizovanoCheckBox.setText("Realizovano");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sacuvajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(planiranoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(realizovanoTextField)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(nazivTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(realizovanoCheckBox))
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)))
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
                        .addGap(29, 29, 29)
                        .addComponent(realizovanoCheckBox))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(exitButton)
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sacuvajButton)
                        .addGap(23, 23, 23))))
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
        rashod.setRealizovano(realizovanoCheckBox.isSelected());

        for (Rashod rashod1 : listaRashoda) {
            if (rashod.getNaziv().equals(rashod1.getNaziv())) {
                azurirano = CentralPoint.getInstance().getProjectDao().azurirajRashod(rashod);
                JOptionPane.showMessageDialog(this, "Uspešno ste ažurirali rashod");
                updateData();
            }
        }
        if (!azurirano) {
            if (CentralPoint.getInstance().getProjectDao().sacuvajRashod(rashod)) {
                JOptionPane.showMessageDialog(this, "Uspešno ste sačuvali rashod");
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
    private javax.swing.JCheckBox realizovanoCheckBox;
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
                tableModel.insertRow(id, rashod.getNaziv(), rashod.getPlaniranaVrednost(), rashod.getRealizovanaVrednost(), rashod.isRealizovano());
            }

        }
    }

    private class ColorRenderer extends JLabel implements TableCellRenderer {

        public ColorRenderer() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(
                JTable table, Object value,
                boolean isSelected, boolean hasFocus,
                int row, int column) {
            javax.swing.border.Border border = BorderFactory.createLineBorder(Color.GRAY, 1);
            if (column == 4) {
                if (table.getValueAt(row, column).equals(true)) {
                    setBackground(new Color(34, 139, 34));
                    setBorder(border);
                } else {
                    setBorder(border);
                    setBackground(Color.RED);
                }
            }
            return this;
        }
    }
}
