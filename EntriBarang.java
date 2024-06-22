/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package porjec_kasir;

import java.sql.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class EntriBarang extends javax.swing.JFrame {
    private DefaultTableModel tableModel;
    private JTable barangTable;


    
    String driver = "com.mysql.jdbc.Driver";
    String db = "jdbc:mysql://localhost/projectpbo";
    /**
     * Creates new form EntriBarang
     */
    public EntriBarang() {
        initComponents();
        tampilData();
        
        
         tableModel = new DefaultTableModel(new Object[]{"Kode Barang", "Nama Barang", "Stok", "Harga Beli", "Harga Jual"}, 0);
    
    // Inisialisasi barangTable dengan tableModel
        barangTable = new JTable(tableModel);
    
    // Tambahkan barangTable ke dalam JScrollPane agar dapat di-scroll jika datanya cukup banyak
        JScrollPane scrollPane = new JScrollPane(barangTable);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dataBarang = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        stok = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        kodeBarang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        namaBarang = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        hargaJual = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        hargaBeli = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBarang = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dataBarang.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Entri Data Barang");

        jLabel2.setText("Kode Barang");

        jLabel3.setText("Nama Barang");

        jLabel4.setText("Stok");

        jLabel5.setText("Harga Beli");

        jLabel6.setText("Harga Jual");

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        ubah.setText("Ubah");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        tableBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Barang", "Nama Barang", "Stok", "Harga Beli", "Harga Jual"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableBarang.setGridColor(new java.awt.Color(0, 0, 0));
        tableBarang.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tableBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBarang);

        jButton5.setText("Kembali");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dataBarangLayout = new javax.swing.GroupLayout(dataBarang);
        dataBarang.setLayout(dataBarangLayout);
        dataBarangLayout.setHorizontalGroup(
            dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBarangLayout.createSequentialGroup()
                .addGroup(dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5)
                    .addGroup(dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(dataBarangLayout.createSequentialGroup()
                            .addGap(91, 91, 91)
                            .addGroup(dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(dataBarangLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(kodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dataBarangLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(stok, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dataBarangLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(193, 193, 193)
                            .addGroup(dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(18, 18, 18)
                            .addGroup(dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(hargaJual, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hargaBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(dataBarangLayout.createSequentialGroup()
                            .addGap(384, 384, 384)
                            .addComponent(jLabel1))
                        .addGroup(dataBarangLayout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(simpan)
                            .addGap(18, 18, 18)
                            .addComponent(ubah)
                            .addGap(18, 18, 18)
                            .addComponent(reset)
                            .addGap(18, 18, 18)
                            .addComponent(hapus))
                        .addGroup(dataBarangLayout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        dataBarangLayout.setVerticalGroup(
            dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBarangLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGroup(dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataBarangLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reset)
                            .addComponent(ubah)
                            .addComponent(simpan)
                            .addComponent(hapus)))
                    .addGroup(dataBarangLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(kodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(hargaBeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(hargaJual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(stok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dataBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dataBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
    DefaultTableModel table = (DefaultTableModel) tableBarang.getModel();
    int selectedRow = tableBarang.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "Pilih satu baris untuk di-update");
        return;
    }
    
    String kodeBarangDariTabel = table.getValueAt(selectedRow, 0).toString();
    String kodeBarangInput = kodeBarang.getText().trim();

    if (!kodeBarangInput.equals(kodeBarangDariTabel)) {
        JOptionPane.showMessageDialog(null, "Kode barang tidak bisa di ubah", "Warning", JOptionPane.ERROR_MESSAGE);
        return;
    }

    
    String kodeBarang = table.getValueAt(selectedRow, 0).toString();
    String namaBarang = this.namaBarang.getText().trim();
    String stokText = this.stok.getText().trim();
    String hargaBeliText = this.hargaBeli.getText().trim();
    String hargaJualText = this.hargaJual.getText().trim();

    if (kodeBarang.isEmpty() || namaBarang.isEmpty() || stokText.isEmpty() || hargaBeliText.isEmpty() || hargaJualText.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Semua field harus diisi");
        return;
    }
    
  

    int stok, hargaBeli, hargaJual;

    try {
        stok = Integer.parseInt(stokText);
        hargaBeli = Integer.parseInt(hargaBeliText);
        hargaJual = Integer.parseInt(hargaJualText);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Stok, Harga Beli, dan Harga Jual harus berupa angka: " + e.getMessage());
        return;
    }

    try {
        // Load the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Database connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectpbo", "root", ""); 

        String sql = "UPDATE barang SET nama_barang = ?, stok_barang = ?, harga_barang = ?, harga_jual_barang = ? WHERE kode_barang = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, namaBarang);
        stmt.setInt(2, stok);
        stmt.setInt(3, hargaBeli);
        stmt.setInt(4, hargaJual);
        stmt.setString(5, kodeBarang); 

        int rowsUpdated = stmt.executeUpdate();
        stmt.close();
        conn.close();

        if (rowsUpdated > 0) {
            // Update the row in the GUI table
            table.setValueAt(namaBarang, selectedRow, 1);
            table.setValueAt(stok, selectedRow, 2);
            table.setValueAt(hargaBeli, selectedRow, 3);
            table.setValueAt(hargaJual, selectedRow, 4);

            JOptionPane.showMessageDialog(null, "Data berhasil di-update");
        } else {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan di database");
        }
    } catch (ClassNotFoundException ex) {
        JOptionPane.showMessageDialog(null, "Driver tidak ditemukan: " + ex.getMessage());
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_ubahActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
    String kode = kodeBarang.getText().trim();
    String nama = namaBarang.getText().trim();
    String stokText = stok.getText().trim();
    String hargaBeliText = hargaBeli.getText().trim();
    String hargaJualText = hargaJual.getText().trim();
    
    
    if (kode.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Kode barang belum diisi.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return; // Keluar dari method jika kode barang belum diisi
    }
    
    if (nama.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Nama barang belum diisi.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return; // Keluar dari method jika nama barang belum diisi
    }
    
    if (stokText.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Stok barang belum diisi.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return; // Keluar dari method jika stok barang belum diisi
    }
    
    if (hargaBeliText.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Harga beli barang belum diisi.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return; // Keluar dari method jika harga beli barang belum diisi
    }
    
    if (hargaJualText.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Harga jual barang belum diisi.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return; // Keluar dari method jika harga jual barang belum diisi
    }
    
    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectpbo", "root", "");
         PreparedStatement ps = con.prepareStatement("INSERT INTO barang (kode_barang, nama_barang, stok_barang, harga_barang, harga_jual_barang) VALUES (?, ?, ?, ?, ?)")) {
        
           String checkSql = "SELECT COUNT(*) FROM barang WHERE kode_barang = ?";
            try (PreparedStatement checkStmt = con.prepareStatement(checkSql)) {
                checkStmt.setString(1, kode);
                ResultSet rs = checkStmt.executeQuery();
                if (rs.next() && rs.getInt(1) > 0) {
                    JOptionPane.showMessageDialog(null, "Kode Barang sudah ada di database", "Peringatan", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
        
        // Mengatur nilai parameter PreparedStatement
        ps.setString(1, kode);
        ps.setString(2, nama);
        ps.setInt(3, Integer.parseInt(stokText)); // Ubah teks menjadi integer untuk stok_barang
        ps.setInt(4, Integer.parseInt(hargaBeliText)); 
        ps.setInt(5, Integer.parseInt(hargaJualText)); 
        
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
    }//GEN-LAST:event_simpanActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
    DefaultTableModel table = (DefaultTableModel) tableBarang.getModel();
    if(tableBarang.getSelectedRowCount() == 1){
        int selectedRow = tableBarang.getSelectedRow();
        String kodeBarang = table.getValueAt(selectedRow, 0).toString(); // Mengambil kode barang dari kolom pertama
        
        // Hapus data dari database
        try {
            Class.forName(driver);
            Connection conn =  (Connection) configDB.config();
            String sql = "DELETE FROM barang WHERE kode_barang = ?";
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
        if(tableBarang.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Tabel kosong");
        } else {
            JOptionPane.showMessageDialog(null, "Pilih satu baris untuk dihapus");
        }
    }
    }//GEN-LAST:event_hapusActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        resetUlang();
    }//GEN-LAST:event_resetActionPerformed

    private void tableBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBarangMouseClicked
        // TODO add your handling code here:
        int i = tableBarang.getSelectedRow();
        
        if(i >- 1){
            DefaultTableModel tableModel = (DefaultTableModel) tableBarang.getModel();
            kodeBarang.setText(tableModel.getValueAt(i, 0).toString());
            namaBarang.setText(tableModel.getValueAt(i, 1).toString());
            stok.setText(tableModel.getValueAt(i, 2).toString());
            hargaBeli.setText(tableModel.getValueAt(i, 3).toString());
            hargaJual.setText(tableModel.getValueAt(i, 4).toString());
        }
    }//GEN-LAST:event_tableBarangMouseClicked

    void tampilData() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectpbo", "root", "");
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery("SELECT * FROM barang")) {
        
        DefaultTableModel table = (DefaultTableModel) tableBarang.getModel();
        table.setRowCount(0);
        
        while(rs.next()){
        
            table.addRow(new Object[]{
                rs.getString("kode_barang"),
                rs.getString("nama_barang"),
                rs.getString("stok_barang"),
                rs.getString("harga_barang"),
                rs.getString("harga_jual_barang"),
            });
        }

        
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "gagal");
    }
}
    
    void resetUlang(){
        kodeBarang.setText("");
        namaBarang.setText("");
        stok.setText("");
        hargaBeli.setText("");
        hargaJual.setText("");
    
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
            java.util.logging.Logger.getLogger(EntriBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntriBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntriBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntriBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntriBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dataBarang;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField hargaBeli;
    private javax.swing.JTextField hargaJual;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kodeBarang;
    private javax.swing.JTextField namaBarang;
    private javax.swing.JButton reset;
    private javax.swing.JButton simpan;
    private javax.swing.JTextField stok;
    private javax.swing.JTable tableBarang;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables

    private Object getText() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
