/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author PebrIsnani
 */
public class tugas1 extends javax.swing.JFrame {

    /**
     * Creates new form tugas1
     */
    public tugas1() {
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

        bgPilih_minum = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cbSoto = new javax.swing.JCheckBox();
        cbRawon = new javax.swing.JCheckBox();
        cbBakso = new javax.swing.JCheckBox();
        cbGudeg = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        tfSoto = new javax.swing.JTextField();
        tfRawon = new javax.swing.JTextField();
        tfBakso = new javax.swing.JTextField();
        tfGudeg = new javax.swing.JTextField();
        tfTotal = new javax.swing.JTextField();
        bHitung = new javax.swing.JButton();
        bClear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rbEs_Teh = new javax.swing.JRadioButton();
        rbEs_Jeruk = new javax.swing.JRadioButton();
        tfEs_Teh = new javax.swing.JTextField();
        tfEs_Jeruk = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 255));
        jPanel1.setForeground(new java.awt.Color(255, 0, 204));

        jLabel1.setBackground(new java.awt.Color(255, 0, 255));
        jLabel1.setFont(new java.awt.Font("Tunga", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("   WARUNG SEMBARANG");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 255, 51));

        cbSoto.setText("SOTO : 5000");
        cbSoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSotoActionPerformed(evt);
            }
        });

        cbRawon.setText("RAWON : 6000");
        cbRawon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRawonActionPerformed(evt);
            }
        });

        cbBakso.setText("BAKSO : 4000");
        cbBakso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBaksoActionPerformed(evt);
            }
        });

        cbGudeg.setText("GUDEG : 8000");
        cbGudeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGudegActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tunga", 1, 18)); // NOI18N
        jLabel2.setText("TOTAL YANG DIBAYARKAN");

        tfSoto.setEditable(false);

        tfRawon.setEditable(false);

        tfBakso.setEditable(false);

        tfGudeg.setEditable(false);

        tfTotal.setEditable(false);

        bHitung.setText("HITUNG");
        bHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHitungActionPerformed(evt);
            }
        });

        bClear.setText("CLEAR");
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("MAKANAN");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("MINUMAN");

        bgPilih_minum.add(rbEs_Teh);
        rbEs_Teh.setText("ES Teh : 1500");
        rbEs_Teh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEs_TehActionPerformed(evt);
            }
        });

        bgPilih_minum.add(rbEs_Jeruk);
        rbEs_Jeruk.setText("Es_Jeruk : 2500");
        rbEs_Jeruk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEs_JerukActionPerformed(evt);
            }
        });

        tfEs_Teh.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(74, 74, 74))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(rbEs_Teh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbEs_Jeruk, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfEs_Teh)
                                    .addComponent(tfEs_Jeruk, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                                .addGap(12, 12, 12))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbBakso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbSoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbRawon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbGudeg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfSoto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfRawon, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfBakso, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfGudeg, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bClear, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbSoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbRawon)
                            .addComponent(tfRawon, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbBakso)
                            .addComponent(tfBakso, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbGudeg)
                            .addComponent(tfGudeg, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfSoto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbEs_Teh)
                            .addComponent(tfEs_Teh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rbEs_Jeruk)
                            .addComponent(tfEs_Jeruk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bClear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbSotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSotoActionPerformed
        // TODO add your handling code here:
        if (cbSoto.isSelected() == true){
            tfSoto.setEditable(true);
        }
        else{
            tfSoto.setEditable(false);
            tfSoto.setText("");
        }
    }//GEN-LAST:event_cbSotoActionPerformed

    private void cbRawonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRawonActionPerformed
        // TODO add your handling code here:
           if (cbRawon.isSelected() == true){
            tfRawon.setEditable(true);
        }
        else{
            tfRawon.setEditable(false);
            tfRawon.setText("");
        }
    }//GEN-LAST:event_cbRawonActionPerformed

    private void cbBaksoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBaksoActionPerformed
        // TODO add your handling code here:
           if (cbBakso.isSelected() == true){
            tfBakso.setEditable(true);
        }
        else{
            tfBakso.setEditable(false);
            tfBakso.setText("");
        }
    }//GEN-LAST:event_cbBaksoActionPerformed

    private void cbGudegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGudegActionPerformed
        // TODO add your handling code here:
           if (cbGudeg.isSelected() == true){
            tfGudeg.setEditable(true);
        }
        else{
            tfGudeg.setEditable(false);
            tfGudeg.setText("");
        }
    }//GEN-LAST:event_cbGudegActionPerformed

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
        // TODO add your handling code here:
        tfSoto.setEditable(false);
        tfSoto.setText("");
        
        tfRawon.setEditable(false);
        tfRawon.setText("");
        
        tfBakso.setEditable(false);
        tfBakso.setText("");
        
        tfGudeg.setEditable(false);
        tfGudeg.setText("");
        
        tfEs_Teh.setEditable(false);
        tfEs_Teh.setText("");
        
        tfEs_Jeruk.setEditable(false);
        tfEs_Jeruk.setText("");
        
        tfTotal.setText("");
    }//GEN-LAST:event_bClearActionPerformed

    private void bHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHitungActionPerformed
        // TODO add your handling code here:
        int soto,rawon,bakso,gudeg,EsTeh,EsJeruk,hasil=0;
        if(cbSoto.isSelected()){
            String sot = tfSoto.getText();
            int jumlahsot = Integer.parseInt(sot);
            soto = jumlahsot*5000;
            hasil=hasil+soto;
        }
        if(cbRawon.isSelected()){
            String raw = tfRawon.getText();
            int jumlahraw = Integer.parseInt(raw);
            rawon = jumlahraw*6000;
            hasil=hasil+rawon;
        }
        if(cbBakso.isSelected()){
            String bak = tfBakso.getText();
            int jumlahbak = Integer.parseInt(bak);
            bakso = jumlahbak*4000;
            hasil=hasil+bakso;
        }
        if(cbGudeg.isSelected()){
            String gud = tfGudeg.getText();
            int jumlahgud = Integer.parseInt(gud);
            gudeg = jumlahgud*8000;
            hasil=hasil+gudeg;
        }
        if(rbEs_Teh.isSelected()){
            String Teh = tfEs_Teh.getText();
            int jumlahTeh = Integer.parseInt(Teh);
            EsTeh = jumlahTeh*1500;
            hasil=hasil+EsTeh;
        }
        if(rbEs_Jeruk.isSelected()){
            String Jeruk = tfEs_Jeruk.getText();
            int jumlahJeruk = Integer.parseInt(Jeruk);
            EsJeruk = jumlahJeruk*2500;
            hasil=hasil+EsJeruk;
        }
        
        tfTotal.setText(""+hasil);
    }//GEN-LAST:event_bHitungActionPerformed

    private void rbEs_TehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEs_TehActionPerformed
        // TODO add your handling code here:
        if(rbEs_Teh.isSelected() == true){
            tfEs_Teh.setEditable(true);
        }
        else{
            tfEs_Teh.setEditable(false);
            tfEs_Teh.setText("");
    }//GEN-LAST:event_rbEs_TehActionPerformed

    private void rbEs_JerukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEs_JerukActionPerformed
        // TODO add your handling code here:
    if(rbEs_Jeruk.isSelected() == true){
           tfEs_Jeruk.setEditable(true);
        }
        else{
            tfEs_Jeruk.setEditable(false);
            tfEs_Jeruk.setText("");
    }//GEN-LAST:event_rbEs_JerukActionPerformed
    }
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
            java.util.logging.Logger.getLogger(tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tugas1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClear;
    private javax.swing.JButton bHitung;
    private javax.swing.ButtonGroup bgPilih_minum;
    private javax.swing.JCheckBox cbBakso;
    private javax.swing.JCheckBox cbGudeg;
    private javax.swing.JCheckBox cbRawon;
    private javax.swing.JCheckBox cbSoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rbEs_Jeruk;
    private javax.swing.JRadioButton rbEs_Teh;
    private javax.swing.JTextField tfBakso;
    private javax.swing.JTextField tfEs_Jeruk;
    private javax.swing.JTextField tfEs_Teh;
    private javax.swing.JTextField tfGudeg;
    private javax.swing.JTextField tfRawon;
    private javax.swing.JTextField tfSoto;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables
}