package main;

import controller.CentralPoint;
import dialogs.CekoviDialog;
import dialogs.PrihodiDialog;
import dialogs.PrijavaDIalog;
import dialogs.RashodiDialog;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.NumberFormat;

public class Pocetna extends javax.swing.JFrame {

    PrihodiDialog prihodiDialog;
    RashodiDialog rashodiDialog;
    CekoviDialog cekoviDialog;
    int realizovaniPrihodi = 0;
    int realizovaniRashodi = 0;
    int ocekivaniPrihodi = 0;
    int ocekivaniRashodi = 0;
    int prosecnaPlata = 0;

    public Pocetna() {
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((screenSize.getWidth() - this.getWidth()) / 2);
        int y = (int) ((screenSize.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
        prihodiDialog = new PrihodiDialog(this, true);
        rashodiDialog = new RashodiDialog(this, true);
        cekoviDialog = new CekoviDialog(this, true);
        updateData();

    }

    public void updateData() {

        realizovaniPrihodi = CentralPoint.getInstance().getProjectDao().vratiRealizovanePrihode();
        realizovaniRashodi = CentralPoint.getInstance().getProjectDao().vratiRealizovaneRashode();
        ocekivaniPrihodi = 12 * 85000;
        ocekivaniRashodi = CentralPoint.getInstance().getProjectDao().vratiOcekivaneRashode();
        prosecnaPlata = CentralPoint.getInstance().getProjectDao().vratiProsecnuPlatu();

        ukupnoPrihodaLabel.setText(String.valueOf(NumberFormat.getInstance().format(realizovaniPrihodi)) + " / " + String.valueOf(NumberFormat.getInstance().format(ocekivaniPrihodi)));
        ukupnoRashodaLabel.setText(String.valueOf(NumberFormat.getInstance().format(realizovaniRashodi)) + " / " + String.valueOf(NumberFormat.getInstance().format(ocekivaniRashodi)));
        prosecnaPlataLabel.setText(String.valueOf(NumberFormat.getInstance().format(prosecnaPlata)));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prihodiButtonž = new javax.swing.JButton();
        rashodiButton = new javax.swing.JButton();
        cekoviButton = new javax.swing.JButton();
        izlazButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        prosecnaPlataLabel = new javax.swing.JLabel();
        ukupnoPrihodaLabel = new javax.swing.JLabel();
        ukupnoRashodaLabel = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        prihodiButtonž.setText("PRIHODI");
        prihodiButtonž.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prihodiButtonžActionPerformed(evt);
            }
        });

        rashodiButton.setText("RASHODI");
        rashodiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rashodiButtonActionPerformed(evt);
            }
        });

        cekoviButton.setText("ČEKOVI");
        cekoviButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekoviButtonActionPerformed(evt);
            }
        });

        izlazButton.setText("IZLAZ");
        izlazButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izlazButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("OBRAČUN ZARADA I TROŠKOVA ZA 2018. GODINU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("PROSEČNA PLATA:");

        prosecnaPlataLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        prosecnaPlataLabel.setForeground(new java.awt.Color(0, 102, 255));

        ukupnoPrihodaLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ukupnoPrihodaLabel.setForeground(new java.awt.Color(0, 204, 102));

        ukupnoRashodaLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ukupnoRashodaLabel.setForeground(new java.awt.Color(255, 102, 102));

        refreshButton.setText("Osveži");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rashodiButton)
                    .addComponent(prihodiButtonž, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cekoviButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(prosecnaPlataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(ukupnoRashodaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(ukupnoPrihodaLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(refreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(izlazButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prihodiButtonž)
                    .addComponent(ukupnoPrihodaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rashodiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ukupnoRashodaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(jLabel1))
                        .addComponent(prosecnaPlataLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cekoviButton)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(refreshButton)
                            .addComponent(izlazButton))))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void izlazButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izlazButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_izlazButtonActionPerformed

    private void prihodiButtonžActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prihodiButtonžActionPerformed
        prihodiDialog.setVisible(true);
    }//GEN-LAST:event_prihodiButtonžActionPerformed

    private void rashodiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rashodiButtonActionPerformed
        rashodiDialog.setVisible(true);
    }//GEN-LAST:event_rashodiButtonActionPerformed

    private void cekoviButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekoviButtonActionPerformed
        cekoviDialog.setVisible(true);
    }//GEN-LAST:event_cekoviButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        updateData();
    }//GEN-LAST:event_refreshButtonActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Pocetna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pocetna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pocetna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pocetna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    PrijavaDIalog loginDialog = new PrijavaDIalog(null, true);
                    if (loginDialog.isConfirm()) {
                        new Pocetna().setVisible(true);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cekoviButton;
    private javax.swing.JButton izlazButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton prihodiButtonž;
    private javax.swing.JLabel prosecnaPlataLabel;
    private javax.swing.JButton rashodiButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JLabel ukupnoPrihodaLabel;
    private javax.swing.JLabel ukupnoRashodaLabel;
    // End of variables declaration//GEN-END:variables
}
