package dialogs;

import controller.CentralPoint;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Mesec;
import model.Prihod;

/**
 *
 * @author Milos
 */
public class PrihodiDialog extends javax.swing.JDialog {

    ArrayList<Mesec> listaMeseci;
    int plata;
    int godina;

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public PrihodiDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("UNOS PRIHODA");
        this.setLocationRelativeTo(parent);
        listaMeseci = new ArrayList<Mesec>();
        updateData();
        plata = 0;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        meseciComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        akontacijaTextField = new javax.swing.JTextField();
        drugiDeoTextField = new javax.swing.JTextField();
        terenTextField = new javax.swing.JTextField();
        bonusTextField = new javax.swing.JTextField();
        sacuvajButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        plataLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Mesec:");

        meseciComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        meseciComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meseciComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Akontacija:");

        jLabel3.setText("Drugi deo:");

        jLabel4.setText("Bonus:");

        jLabel5.setText("Teren:");

        sacuvajButton.setText("SAČUVAJ");
        sacuvajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacuvajButtonActionPerformed(evt);
            }
        });

        exitButton.setText("IZLAZ");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("PLATA:");

        plataLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        plataLabel.setForeground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(sacuvajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(meseciComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(akontacijaTextField)
                            .addComponent(terenTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(bonusTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(drugiDeoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(plataLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(meseciComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(akontacijaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(drugiDeoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bonusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(terenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plataLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sacuvajButton)
                    .addComponent(exitButton))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void meseciComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meseciComboBoxActionPerformed
        if (meseciComboBox.getSelectedIndex() > 0) {
            akontacijaTextField.setEnabled(true);
            drugiDeoTextField.setEnabled(true);
            bonusTextField.setEnabled(true);
            terenTextField.setEnabled(true);
            clearData();
            sacuvajButton.setEnabled(true);

            Mesec mesec = CentralPoint.getInstance().getProjectDao().vratiMesecPoNazivu(meseciComboBox.getSelectedItem().toString());
            int idMeseca = mesec.getId();

            plata = CentralPoint.getInstance().getProjectDao().ucitajPlatu(idMeseca,getGodina());
            plataLabel.setText(String.valueOf(plata));

            Prihod prihod = new Prihod();
            prihod = CentralPoint.getInstance().getProjectDao().ucitajPrihodPoMesecu(idMeseca,getGodina());
            System.out.println("prihod s " + prihod);
            if (prihod != null) {
                prikaziPrihode(prihod);
            }

        }
        if (meseciComboBox.getSelectedIndex() == 0) {
            sacuvajButton.setEnabled(false);
            akontacijaTextField.setEnabled(false);
            drugiDeoTextField.setEnabled(false);
            bonusTextField.setEnabled(false);
            terenTextField.setEnabled(false);
            plataLabel.setText("");
            clearData();
        }
    }//GEN-LAST:event_meseciComboBoxActionPerformed

    private void sacuvajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sacuvajButtonActionPerformed
        if (validateData()) {
            boolean azurirano = false;
            Prihod prihod = new Prihod();
            Mesec mesec = CentralPoint.getInstance().getProjectDao().vratiMesecPoNazivu(meseciComboBox.getSelectedItem().toString());
            prihod.setAkontacija(Integer.parseInt(akontacijaTextField.getText()));
            prihod.setBonus(Integer.parseInt(bonusTextField.getText()));
            prihod.setDrugiDeo(Integer.parseInt(drugiDeoTextField.getText()));
            prihod.setTeren(Integer.parseInt(terenTextField.getText()));
            prihod.setMesecID(mesec.getId());
            ArrayList<Prihod> listaPrihoda = CentralPoint.getInstance().getProjectDao().ucitajSvePrihode();
            for (Prihod prihod1 : listaPrihoda) {
                if (prihod.getMesecID() == prihod1.getMesecID()) {
                    azurirano = CentralPoint.getInstance().getProjectDao().azurirajPrihod(prihod,getGodina());
                    JOptionPane.showMessageDialog(this, "Uspesno ste azurirali prihod");
                }
            }
            if (!azurirano) {
                if (CentralPoint.getInstance().getProjectDao().sacuvajPrihod(prihod,getGodina())) {
                    JOptionPane.showMessageDialog(this, "Uspesno ste sacuvali prihod");
                    clearData();
                }
            }
            plata = CentralPoint.getInstance().getProjectDao().ucitajPlatu(mesec.getId(),godina);
            plataLabel.setText(String.valueOf(plata));
        }
    }//GEN-LAST:event_sacuvajButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PrihodiDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrihodiDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrihodiDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrihodiDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PrihodiDialog dialog = new PrihodiDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField akontacijaTextField;
    private javax.swing.JTextField bonusTextField;
    private javax.swing.JTextField drugiDeoTextField;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> meseciComboBox;
    private javax.swing.JLabel plataLabel;
    private javax.swing.JButton sacuvajButton;
    private javax.swing.JTextField terenTextField;
    // End of variables declaration//GEN-END:variables

    private void updateData() {
        listaMeseci = CentralPoint.getInstance().getProjectDao().ucitajMesece();
        meseciComboBox.removeAllItems();
        meseciComboBox.addItem("");
        for (Mesec mesec : listaMeseci) {
            meseciComboBox.addItem(mesec.toString());
        }

    }

    private void prikaziPrihode(Prihod prihod) {
        System.out.println("prihod " + prihod);
        akontacijaTextField.setText(String.valueOf(prihod.getAkontacija()));
        drugiDeoTextField.setText(String.valueOf(prihod.getDrugiDeo()));
        bonusTextField.setText(String.valueOf(prihod.getBonus()));
        terenTextField.setText(String.valueOf(prihod.getTeren()));
    }

    public void clearData() {
        akontacijaTextField.setText("");
        drugiDeoTextField.setText("");
        bonusTextField.setText("");
        terenTextField.setText("");

    }

    public boolean validateData() {
        boolean retValue = false;
        if (akontacijaTextField.getText().equals("") || drugiDeoTextField.getText().equals("") || terenTextField.getText().equals("") || bonusTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Morate popuniti sva polja");
            retValue = false;
        } else {
            retValue = true;
        }
        return retValue;
    }
}
