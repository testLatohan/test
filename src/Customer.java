/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LEGION
 */
public class Customer extends javax.swing.JFrame {

    /**
     * Creates new form Barang
     */
    public Customer() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustomer = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIDCust = new javax.swing.JTextField();
        txtNamaCust = new javax.swing.JTextField();
        txtKotaCust = new javax.swing.JTextField();
        txtTelpCust = new javax.swing.JTextField();
        txtAlamatCust = new javax.swing.JTextField();
        btTambah = new javax.swing.JButton();
        btUbah = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        btCetak = new javax.swing.JButton();
        btHalaman = new javax.swing.JButton();
        btKeluar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 576));
        jPanel1.setLayout(null);

        tableCustomer.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableCustomer);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(350, 108, 660, 380);

        jLabel2.setFont(new java.awt.Font("Digital-7 Mono", 0, 70)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(92, 225, 230));
        jLabel2.setText("ZERO | MART");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(650, 30, 360, 70);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 50)); // NOI18N
        jLabel3.setText("DATA CUSTOMER");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 10, 480, 90);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("KODE CUSTOMER          =");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 110, 170, 20);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("NAMA CUSTOMER         =");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 150, 170, 17);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("ALAMAT CUSTOMER     =");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 190, 170, 17);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("KOTA CUSTOMER          =");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 230, 170, 17);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("TELP CUSTOMER            =");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 270, 170, 17);

        txtIDCust.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtIDCust);
        txtIDCust.setBounds(200, 110, 140, 20);

        txtNamaCust.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtNamaCust);
        txtNamaCust.setBounds(200, 150, 140, 23);

        txtKotaCust.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtKotaCust);
        txtKotaCust.setBounds(200, 230, 140, 23);

        txtTelpCust.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtTelpCust);
        txtTelpCust.setBounds(200, 270, 140, 23);

        txtAlamatCust.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtAlamatCust);
        txtAlamatCust.setBounds(200, 190, 140, 23);

        btTambah.setBackground(new java.awt.Color(92, 225, 224));
        btTambah.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btTambah.setText("TAMBAH");
        jPanel1.add(btTambah);
        btTambah.setBounds(60, 320, 110, 50);

        btUbah.setBackground(new java.awt.Color(92, 225, 230));
        btUbah.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btUbah.setText("UBAH");
        jPanel1.add(btUbah);
        btUbah.setBounds(200, 320, 110, 50);

        btHapus.setBackground(new java.awt.Color(92, 225, 230));
        btHapus.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btHapus.setText("HAPUS");
        jPanel1.add(btHapus);
        btHapus.setBounds(60, 400, 110, 50);

        btCetak.setBackground(new java.awt.Color(92, 225, 230));
        btCetak.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btCetak.setText("CETAK");
        jPanel1.add(btCetak);
        btCetak.setBounds(200, 400, 110, 50);

        btHalaman.setBackground(new java.awt.Color(92, 225, 230));
        btHalaman.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btHalaman.setText("HALAMAN");
        btHalaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHalamanActionPerformed(evt);
            }
        });
        jPanel1.add(btHalaman);
        btHalaman.setBounds(730, 500, 110, 60);

        btKeluar.setBackground(new java.awt.Color(92, 225, 230));
        btKeluar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btKeluar.setText("KELUAR");
        btKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKeluarActionPerformed(evt);
            }
        });
        jPanel1.add(btKeluar);
        btKeluar.setBounds(870, 500, 110, 60);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 0);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btHalamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHalamanActionPerformed
       HalamanUtama n = new HalamanUtama();
       n.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btHalamanActionPerformed

    private void btKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKeluarActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCetak;
    private javax.swing.JButton btHalaman;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btKeluar;
    private javax.swing.JButton btTambah;
    private javax.swing.JButton btUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCustomer;
    private javax.swing.JTextField txtAlamatCust;
    private javax.swing.JTextField txtIDCust;
    private javax.swing.JTextField txtKotaCust;
    private javax.swing.JTextField txtNamaCust;
    private javax.swing.JTextField txtTelpCust;
    // End of variables declaration//GEN-END:variables
}
