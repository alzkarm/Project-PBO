/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package porjec_kasir;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class Pembelian extends javax.swing.JFrame {

    String driver = "com.mysql.cj.jdbc.Driver";
    /**
     * Creates new form Pembelian
     */
    public Pembelian() {
        initComponents();
        tampilData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pembeli = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        settNamaSup = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        noTrans = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        setKodeSupp = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        setHarga = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        setNamaBarang = new javax.swing.JTextField();
        simpanTransaksi = new javax.swing.JButton();
        resetTransaksi = new javax.swing.JButton();
        hapusTransaksi = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePembelian = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        tnggal = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        setJumlahBrang = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pembeli.setBackground(new java.awt.Color(204, 204, 204));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Transaksi Pembelian");

        jLabel18.setText("Nomor Transaksi");

        jLabel19.setText("Kode Supplier");

        jLabel20.setText("Nama Supplier");

        setKodeSupp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                setKodeSuppFocusLost(evt);
            }
        });

        jLabel21.setText("Nama Barang");

        jLabel22.setText("Harga");

        setNamaBarang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                setNamaBarangFocusLost(evt);
            }
        });
        setNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setNamaBarangActionPerformed(evt);
            }
        });

        simpanTransaksi.setText("Simpan");
        simpanTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanTransaksiActionPerformed(evt);
            }
        });

        resetTransaksi.setText("Reset");
        resetTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetTransaksiActionPerformed(evt);
            }
        });

        hapusTransaksi.setText("Hapus");
        hapusTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusTransaksiActionPerformed(evt);
            }
        });

        tablePembelian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nomor Transaksi", "Kode Supplier", "Nama Supplier", "Tanggal Transaksi", "Nama Barang", "Harga", "Jumlah", "Total"
            }
        ));
        tablePembelian.setGridColor(new java.awt.Color(0, 0, 0));
        tablePembelian.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tablePembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePembelianMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablePembelian);

        jLabel24.setText("Tanggal Transaksi");

        jLabel25.setText("Jumlah");

        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                totalKeyReleased(evt);
            }
        });

        jLabel26.setText("Total");

        jButton5.setText("Kembali");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PembeliLayout = new javax.swing.GroupLayout(Pembeli);
        Pembeli.setLayout(PembeliLayout);
        PembeliLayout.setHorizontalGroup(
            PembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PembeliLayout.createSequentialGroup()
                .addGroup(PembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5)
                    .addGroup(PembeliLayout.createSequentialGroup()
                        .addGroup(PembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PembeliLayout.createSequentialGroup()
                                .addGap(384, 384, 384)
                                .addComponent(jLabel17))
                            .addGroup(PembeliLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(PembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PembeliLayout.createSequentialGroup()
                                        .addGroup(PembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(PembeliLayout.createSequentialGroup()
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(noTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(PembeliLayout.createSequentialGroup()
                                                .addGroup(PembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel19)
                                                    .addComponent(jLabel20)
                                                    .addComponent(jLabel24))
                                                .addGap(23, 23, 23)
                                                .addGroup(PembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(setKodeSupp, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(settNamaSup, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tnggal, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(235, 235, 235))
                                    .addGroup(PembeliLayout.createSequentialGroup()
                                        .addComponent(simpanTransaksi)
                                        .addGap(18, 18, 18)
                                        .addComponent(resetTransaksi)
                                        .addGap(18, 18, 18)
                                        .addComponent(hapusTransaksi)
                                        .addGap(290, 290, 290)))
                                .addGroup(PembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26))
                                .addGap(18, 18, 18)
                                .addGroup(PembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(setJumlahBrang, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(setHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(setNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(11, 11, 11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PembeliLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PembeliLayout.setVerticalGroup(
            PembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PembeliLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel17)
                .addGap(51, 51, 51)
                .addGroup(PembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(noTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(setNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(setKodeSupp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(setHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(settNamaSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(setJumlahBrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(tnggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(PembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpanTransaksi)
                    .addComponent(resetTransaksi)
                    .addComponent(hapusTransaksi))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pembeli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pembeli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setKodeSuppFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_setKodeSuppFocusLost
        // TODO add your handling code here:

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectpbo", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM supplier WHERE kode_sup='"+setKodeSupp.getText()+"'")) {

            if(rs.next()){
                settNamaSup.setText(rs.getString("nama_sup"));
            }else{
                settNamaSup.setText(null);
                JOptionPane.showMessageDialog(null, "Tidak Ada Supplier");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_setKodeSuppFocusLost

    private void simpanTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanTransaksiActionPerformed
        // TODO add your handling code here:
        
        if (noTrans.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Nomor transaksi harus diisi.", "Peringatan", JOptionPane.ERROR_MESSAGE);
        return;
        }
        
        if (settNamaSup.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Nama Supplier harus diisi.",  "Peringatan", JOptionPane.ERROR_MESSAGE);
        return;
        }
        
        if (tnggal.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "tanggal Transaksi harus diisi.",  "Peringatan", JOptionPane.ERROR_MESSAGE);
        return;
        }
        
        if (setJumlahBrang.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Jumlah Barang harus diisi.",  "Peringatan", JOptionPane.ERROR_MESSAGE);
        return;
        }
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectpbo", "root", "");
            PreparedStatement ps = con.prepareStatement("INSERT INTO pembelian (no_trans, kode_sup, nama_sup, tgl, nama_barang, harga, jumlah, total) VALUES (?, ?, ?, ?, ?, ?, ?, ?)")) {

            // Mengatur nilai parameter PreparedStatement
            ps.setString(1, noTrans.getText());
            ps.setString(2, setKodeSupp.getText());
            ps.setString(3, settNamaSup.getText());
            ps.setString(4, tnggal.getText());
            ps.setString(5, setNamaBarang.getText());
            ps.setString(6, setHarga.getText());
            ps.setString(7, setJumlahBrang.getText());
            ps.setString(8, total.getText());

            // Eksekusi pernyataan SQL
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan.");
                tampilData();
                resetUlang();
            } else {
                JOptionPane.showMessageDialog(null, "Gagal menyimpan data.");
            }
        } catch (SQLException | NumberFormatException e) {
            // Tangani kesalahan secara tepat
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_simpanTransaksiActionPerformed

    private void resetTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetTransaksiActionPerformed
        // TODO add your handling code here:
        resetUlang();
    }//GEN-LAST:event_resetTransaksiActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void hapusTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusTransaksiActionPerformed
        // TODO add your handling code here:
         DefaultTableModel table = (DefaultTableModel) tablePembelian.getModel();
             if(tablePembelian.getSelectedRowCount() == 1){
        int selectedRow = tablePembelian.getSelectedRow();
        String kodeBarang = table.getValueAt(selectedRow, 0).   toString(); // Mengambil kode barang dari kolom pertama
        
        // Hapus data dari database
        try {
            Class.forName(driver);
            Connection conn =  (Connection) configDB.config();
            String sql = "DELETE FROM pembelian WHERE no_trans = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, kodeBarang);
            stmt.executeUpdate();
            stmt.close();
            conn.close();
            
            // Hapus baris dari tabel setelah berhasil dihapus dari database
            table.removeRow(selectedRow);
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    } else {
        if(tablePembelian.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Tabel kosong");
        } else {
            JOptionPane.showMessageDialog(null, "Pilih satu baris untuk dihapus");
        }
    }
        
        
    }//GEN-LAST:event_hapusTransaksiActionPerformed

    private void tablePembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePembelianMouseClicked
        // TODO add your handling code here:
        int i = tablePembelian.getSelectedRow();
        
        if(i >- 1){
            DefaultTableModel tableModel = (DefaultTableModel) tablePembelian.getModel();
            noTrans.setText(tableModel.getValueAt(i, 0).toString());
            setKodeSupp.setText(tableModel.getValueAt(i, 1).toString());
            settNamaSup.setText(tableModel.getValueAt(i, 2).toString());
            tnggal.setText(tableModel.getValueAt(i, 3).toString());
            setNamaBarang.setText(tableModel.getValueAt(i, 4).toString());
            setHarga.setText(tableModel.getValueAt(i, 5).toString());
            setJumlahBrang.setText(tableModel.getValueAt(i, 6).toString());
            total.setText(tableModel.getValueAt(i, 7).toString());
        }
    }//GEN-LAST:event_tablePembelianMouseClicked

    private void totalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalKeyReleased
        // TODO add your handling code here:
        
        String harga = setHarga.getText();
        String jumlah = setJumlahBrang.getText();
        int cassHarga = Integer.parseInt(harga);
        int casasJumlah = Integer.parseInt(jumlah);
        int hasil = cassHarga * casasJumlah;
        total.setText(hasil+"");
    }//GEN-LAST:event_totalKeyReleased

    private void setNamaBarangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_setNamaBarangFocusLost
        // TODO add your handling code here:
         try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectpbo", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM barang WHERE nama_barang='"+setNamaBarang.getText()+"'")) {

            if(rs.next()){
                setHarga.setText(rs.getString("harga_barang"));
            }else{
                JOptionPane.showMessageDialog(null, "Barang Tidak ditemukan");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_setNamaBarangFocusLost

    private void setNamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setNamaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setNamaBarangActionPerformed

     void tampilData() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectpbo", "root", "");
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery("SELECT * FROM pembelian")) {
        
        DefaultTableModel table = (DefaultTableModel) tablePembelian.getModel();
        table.setRowCount(0);
        
            try {
                while(rs.next()){
                    
                    table.addRow(new Object[]{
                        rs.getString("no_trans"),
                        rs.getString("kode_sup"),
                        rs.getString("nama_sup"),
                        rs.getString("tgl"),
                        rs.getString("nama_barang"),
                        rs.getString("harga"),
                        rs.getString("jumlah"),
                        rs.getString("total"),
                    });
                }   } catch (SQLException ex) {
                Logger.getLogger(Pembelian.class.getName()).log(Level.SEVERE, null, ex);
            }
    }   catch (SQLException ex) {
            Logger.getLogger(Pembelian.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    
    
      void resetUlang(){
        noTrans.setText("");
        setKodeSupp.setText("");
        setNamaBarang.setText("");
        settNamaSup.setText("");
        tnggal.setText("");
        setHarga.setText("");
        setJumlahBrang.setText("");
        total.setText("");
    
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
            java.util.logging.Logger.getLogger(Pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pembelian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pembeli;
    private javax.swing.JButton hapusTransaksi;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField noTrans;
    private javax.swing.JButton resetTransaksi;
    private javax.swing.JTextField setHarga;
    private javax.swing.JTextField setJumlahBrang;
    private javax.swing.JTextField setKodeSupp;
    private javax.swing.JTextField setNamaBarang;
    public javax.swing.JTextField settNamaSup;
    private javax.swing.JButton simpanTransaksi;
    private javax.swing.JTable tablePembelian;
    private javax.swing.JTextField tnggal;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
