/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjava;

import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class visual extends javax.swing.JFrame {

    /**
     * Creates new form visual
     */
    public visual() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tahunRadioButton = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        namaTextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        alamatTextField = new javax.swing.JTextField();
        texy = new javax.swing.JLabel();
        jRadioButtonTahunan = new javax.swing.JRadioButton();
        jRadioButtonBulanan = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        cicilanComboBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        dispenserCheckBox = new javax.swing.JCheckBox();
        tvCheckBox = new javax.swing.JCheckBox();
        kipasAnginCheckBox = new javax.swing.JCheckBox();
        btnbiaya = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Nama Penyewa");

        namaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaTextFieldActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Aplikasi Penghitungan Biaya Kamar Kost");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel3)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Alamat Asal");

        texy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        texy.setText("Periode");

        tahunRadioButton.add(jRadioButtonTahunan);
        jRadioButtonTahunan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButtonTahunan.setText("Tahunan");
        jRadioButtonTahunan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTahunanActionPerformed(evt);
            }
        });

        tahunRadioButton.add(jRadioButtonBulanan);
        jRadioButtonBulanan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButtonBulanan.setText("Bulanan");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Cicilan");

        cicilanComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cicilanComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilihan", "Tahunan", "Bulanan" }));
        cicilanComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cicilanComboBoxActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Fasilitas");

        dispenserCheckBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dispenserCheckBox.setText("Dispenser");
        dispenserCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispenserCheckBoxActionPerformed(evt);
            }
        });

        tvCheckBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tvCheckBox.setText("Tv");

        kipasAnginCheckBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kipasAnginCheckBox.setText("Kipas Angin");

        btnbiaya.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnbiaya.setText("Hitung Biaya");
        btnbiaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbiayaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texy)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cicilanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButtonTahunan)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonBulanan)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alamatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnbiaya)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dispenserCheckBox)
                                        .addGap(34, 34, 34)
                                        .addComponent(tvCheckBox)))
                                .addGap(46, 46, 46)
                                .addComponent(kipasAnginCheckBox)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alamatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texy)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButtonTahunan)
                        .addComponent(jRadioButtonBulanan)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cicilanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dispenserCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tvCheckBox)
                            .addComponent(kipasAnginCheckBox))))
                .addGap(50, 50, 50)
                .addComponent(btnbiaya)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaTextFieldActionPerformed

    private void jRadioButtonTahunanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTahunanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonTahunanActionPerformed

    private void cicilanComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cicilanComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cicilanComboBoxActionPerformed

    private void dispenserCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispenserCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dispenserCheckBoxActionPerformed

    private void btnbiayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbiayaActionPerformed
        // TODO add your handling code here:
String nama = namaTextField.getText();
String alamat = alamatTextField.getText();
String periode = "";
double biayaDasar = 0;
if (jRadioButtonTahunan.isSelected()) {
    periode = "Tahun";
    biayaDasar += 5000000;
} else if (jRadioButtonBulanan.isSelected()) {
    periode = "Bulan";
     biayaDasar += 800000;
}

String fasilitas = "";
double biayaFasilitas = 0;
if (dispenserCheckBox.isSelected()) {
    fasilitas += "Dispenser, ";
     biayaFasilitas += 50000;
}
if (tvCheckBox.isSelected()) {
    fasilitas += "TV, ";
    biayaFasilitas += 100000;
}
if (kipasAnginCheckBox.isSelected()) {
    fasilitas += "Kipas Angin";
    biayaFasilitas += 50000;
}


double totalBiaya = biayaDasar + biayaFasilitas;

String cicilan = cicilanComboBox.getSelectedItem().toString();
double cicilanBulanan = 0;

if (cicilan.equals("Bulanan")) {
    cicilanBulanan:
    totalBiaya/= 12;
} else if (cicilan.equals("Tahunan")) {
    cicilanBulanan = totalBiaya;
}

JOptionPane.showMessageDialog(this, "Nama: " + nama + "\nAlamat: " + alamat + "\nPeriode: " + periode + "\nCicilan: " + cicilan + "\nFasilitas: " + fasilitas + "\nBiaya: Rp." + totalBiaya );

    
         
    
        
    }//GEN-LAST:event_btnbiayaActionPerformed

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
            java.util.logging.Logger.getLogger(visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new visual().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamatTextField;
    private javax.swing.JButton btnbiaya;
    private javax.swing.JComboBox<String> cicilanComboBox;
    private javax.swing.JCheckBox dispenserCheckBox;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonBulanan;
    private javax.swing.JRadioButton jRadioButtonTahunan;
    private javax.swing.JCheckBox kipasAnginCheckBox;
    private javax.swing.JTextField namaTextField;
    private javax.swing.ButtonGroup tahunRadioButton;
    private javax.swing.JLabel texy;
    private javax.swing.JCheckBox tvCheckBox;
    // End of variables declaration//GEN-END:variables
}