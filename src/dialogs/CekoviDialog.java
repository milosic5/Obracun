/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogs;

import com.toedter.calendar.JDateChooser;
import controller.CentralPoint;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;
import model.Cek;
import tableModel.CekoviTableModel;

/**
 *
 * @author Milos
 */
public class CekoviDialog extends javax.swing.JDialog {

    private CekoviTableModel tableModel = new CekoviTableModel();
    ArrayList<Cek> listaCekova;
    private JDateChooser datumUtovaraChooser;
    private JDateChooser datumOtpremeChooser;

    public CekoviDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("UNOS ČEKOVA");
        this.setLocationRelativeTo(parent);
        cekoviTable.setModel(tableModel);
        listaCekova = new ArrayList<>();
        datumOtpremeChooser = new JDateChooser();
        updateData();
        createDatePanels();
        
        cekoviTable.getColumnModel().getColumn(4).setCellRenderer(new ColorRenderer());

        cekoviTable.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {

                int row = cekoviTable.rowAtPoint(evt.getPoint());
                int col = cekoviTable.columnAtPoint(evt.getPoint());

                if (row >= 0 && col >= 0) {
                    sacuvajButton.setEnabled(true);
                    brojCekaTextField.setText(cekoviTable.getValueAt(row, 1).toString());
                    vrednostTextField.setText(cekoviTable.getValueAt(row, 2).toString());
                    datumUtovaraChooser.setDate((Date) cekoviTable.getValueAt(row, 3));
                    realizovanCheckBox.setSelected((boolean) cekoviTable.getValueAt(row, 4));
                }
            }

        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sad = new javax.swing.JScrollPane();
        cekoviTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        brojCekaTextField = new javax.swing.JTextField();
        vrednostTextField = new javax.swing.JTextField();
        datumUtovaraPanel = new javax.swing.JPanel();
        sacuvajButton = new javax.swing.JButton();
        realizovanCheckBox = new javax.swing.JCheckBox();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cekoviTable.setModel(new javax.swing.table.DefaultTableModel(
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
        cekoviTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        sad.setViewportView(cekoviTable);

        jLabel1.setText("Broj:");

        jLabel2.setText("Vrednost:");

        jLabel3.setText("Datum realizacije:");

        datumUtovaraPanel.setLayout(new java.awt.BorderLayout());

        sacuvajButton.setText("Sacuvaj");
        sacuvajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacuvajButtonActionPerformed(evt);
            }
        });

        realizovanCheckBox.setText("Realizovan");

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(realizovanCheckBox)
                            .addComponent(jLabel1)
                            .addComponent(brojCekaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(vrednostTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(datumUtovaraPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(sad, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sacuvajButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(sad, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(brojCekaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vrednostTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datumUtovaraPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(realizovanCheckBox)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sacuvajButton)
                    .addComponent(exitButton))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sacuvajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sacuvajButtonActionPerformed
        Cek cek = new Cek();
        boolean azurirano = false;
        cek.setBrojCeka(Integer.parseInt(brojCekaTextField.getText()));
        cek.setVrednost(Integer.parseInt(vrednostTextField.getText()));
        cek.setDatumRealizacije(getDatumUtovara());
        cek.setRealizovan(realizovanCheckBox.isSelected());
        for (Cek cek1 : listaCekova) {
            if (cek.getBrojCeka() == cek1.getBrojCeka()) {
                azurirano = CentralPoint.getInstance().getProjectDao().azurirajCek(cek);
                updateData();
            }
        }
        if (!azurirano) {
            if (CentralPoint.getInstance().getProjectDao().sacuvajCek(cek)) {
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
            java.util.logging.Logger.getLogger(CekoviDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CekoviDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CekoviDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CekoviDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CekoviDialog dialog = new CekoviDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField brojCekaTextField;
    private javax.swing.JTable cekoviTable;
    private javax.swing.JPanel datumUtovaraPanel;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JCheckBox realizovanCheckBox;
    private javax.swing.JButton sacuvajButton;
    private javax.swing.JScrollPane sad;
    private javax.swing.JTextField vrednostTextField;
    // End of variables declaration//GEN-END:variables

    private void updateData() {
        tableModel.clearData();
        listaCekova = CentralPoint.getInstance().getProjectDao().ucitajCekove();
        int id = 0;
        if (listaCekova.size() > 0) {
            for (Cek cek : listaCekova) {
                id++;
                tableModel.insertRow(id, cek.getBrojCeka(), cek.getVrednost(), cek.getDatumRealizacije(), cek.isRealizovan());
            }

        }
    }

    public void createDatePanels() {
        this.datumUtovaraPanel.add(buildDatePanel("datumRealizacije", new Date()));
    }

    public JPanel buildDatePanel(String label, Date value) {
        JPanel datePanel = new JPanel();

        JDateChooser dateChooser = new JDateChooser();
        if (label.equalsIgnoreCase("datumRealizacije")) {
            datumUtovaraChooser = dateChooser;
        }

        if (value != null) {
            dateChooser.setDate(value);
        }

        for (Component comp : dateChooser.getComponents()) {
            if (comp instanceof JTextField) {
                ((JTextField) comp).setColumns(50);
                ((JTextField) comp).setEditable(false);
            }
        }
        datePanel.setLayout(new BoxLayout(datePanel, BoxLayout.X_AXIS));
        datePanel.add(dateChooser);

        return datePanel;
    }

    public Date getDatumUtovara() {
        Date datumUtovara = datumUtovaraChooser.getDate();
        return datumUtovara;
    }

    private void clearData() {
        brojCekaTextField.setText("");
        vrednostTextField.setText("");
        createDatePanels();
        realizovanCheckBox.setSelected(false);
    }

    private class ColorRenderer extends JTextField implements TableCellRenderer {

        public ColorRenderer() {
            setOpaque(true); //MUST do this for background to show up.
        }

        public Component getTableCellRendererComponent(
                JTable table, Object value,
                boolean isSelected, boolean hasFocus,
                int row, int column) {

            if (column == 4) {
                if (table.getValueAt(row, column).equals(true)) {
                    setBackground(new Color(34,139,34));
                } else {
                    setBackground(Color.RED);
                }
            }
            return this;
        }
    }
}
