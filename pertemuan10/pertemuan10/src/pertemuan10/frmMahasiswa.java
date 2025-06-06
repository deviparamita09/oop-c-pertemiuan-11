/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pertemuan10;

import static Pertemuan10.Dbkoneksi.koneksi;
import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deviparamita
 */
public class frmMahasiswa extends javax.swing.JFrame {
    DefaultTableModel DTM = new DefaultTableModel ();
    

    /**
     * Creates new form frmMahasiswa
     */
    public frmMahasiswa() throws SQLException {
        initComponents();
        
        tblmhs.setModel(DTM);
        DTM.addColumn("NIM");
        DTM.addColumn("Nama Mahasiswa");
        DTM.addColumn("Jurusan");
        DTM.addColumn("Alamat");
        
        lsdmhs();
        clearform();
                
                
                
         
        
        
        
        
    
        
        
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txNIM = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txNAMA = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txJURUSAN = new javax.swing.JTextField();
        txALAMAT = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmhs = new javax.swing.JTable();
        cBARU = new javax.swing.JButton();
        cUBAH = new javax.swing.JButton();
        cHAPUS = new javax.swing.JButton();
        cTUTUP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Data Mahasiswa");

        txNIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNIMActionPerformed(evt);
            }
        });

        jLabel2.setText("NIM ");

        jLabel3.setText("NAMA");

        jLabel5.setText("JURUSAN");

        jLabel4.setText("ALAMAT");

        txJURUSAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txJURUSANActionPerformed(evt);
            }
        });

        tblmhs.setModel(new javax.swing.table.DefaultTableModel(
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
        tblmhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblmhsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblmhs);

        cBARU.setText("Baru");
        cBARU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cBARUMouseClicked(evt);
            }
        });
        cBARU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBARUActionPerformed(evt);
            }
        });

        cUBAH.setText("Ubah");
        cUBAH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cUBAHActionPerformed(evt);
            }
        });

        cHAPUS.setText("Hapus");

        cTUTUP.setText("Tutup");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(cBARU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cUBAH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cHAPUS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cTUTUP)
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txJURUSAN, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txALAMAT, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txNAMA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNAMA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txJURUSAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txALAMAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBARU)
                    .addComponent(cUBAH)
                    .addComponent(cHAPUS)
                    .addComponent(cTUTUP))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txNIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNIMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNIMActionPerformed

    private void txJURUSANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txJURUSANActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txJURUSANActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
    }//GEN-LAST:event_formMouseClicked

    private void tblmhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblmhsMouseClicked
        txNIM.setText(tblmhs.getValueAt( tblmhs.getSelectedRow(), 0).toString());
        txNAMA.setText(tblmhs.getValueAt( tblmhs.getSelectedRow(), 1).toString());
        txJURUSAN.setText(tblmhs.getValueAt( tblmhs.getSelectedRow(), 2).toString());
        txALAMAT.setText(tblmhs.getValueAt( tblmhs.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_tblmhsMouseClicked

    private void cBARUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cBARUMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cBARUMouseClicked

    private void cBARUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBARUActionPerformed
    if(cBARU.getText().equals("Baru")){
        clearform();
    cBARU.setText("Simpan");
    cTUTUP.setEnabled(false);
    cUBAH.setEnabled(false);
    cHAPUS.setEnabled(false);
            
    }else {
        cBARU.setText("Baru");
        cHAPUS.setText("Tutup");
        cUBAH.setEnabled(true);
        cHAPUS.setEnabled(true);
    }
    }//GEN-LAST:event_cBARUActionPerformed

    private void cUBAHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cUBAHActionPerformed
    if(cUBAH.getText().equals("Ubah")){
        clearform();
    cUBAH.setText("Simpan");
    }else {
        cUBAH.setText("Ubah");
    }
    }//GEN-LAST:event_cUBAHActionPerformed

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
            java.util.logging.Logger.getLogger(frmMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frmMahasiswa().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(frmMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cBARU;
    private javax.swing.JButton cHAPUS;
    private javax.swing.JButton cTUTUP;
    private javax.swing.JButton cUBAH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblmhs;
    private javax.swing.JTextField txALAMAT;
    private javax.swing.JTextField txJURUSAN;
    private javax.swing.JTextField txNAMA;
    private javax.swing.JTextField txNIM;
    // End of variables declaration//GEN-END:variables

    private void lsdmhs() throws SQLException {
        Connection cnn = koneksi();
        if ( !cnn.isClosed()){
            PreparedStatement PS = cnn.prepareStatement("SELECT * FROM mhs; ");
            ResultSet RS = PS.executeQuery();
            while ( RS. next () ) {
                Object[] dtamhs = new Object [4];
                dtamhs[0] = RS.getString("NIM");
                dtamhs[1] = RS.getString("NAMA");
                dtamhs[2] = RS.getString("JURUSAN");
                dtamhs[3] = RS.getString("ALAMAT");
                
                DTM.addRow(dtamhs); 
                
            }            
            
        }
               
        
    }
    
    private void clearform() {
        txNIM.setText("");
        txNAMA.setText("");
        txJURUSAN.setText("");
        txALAMAT.setText("");
    }

}
