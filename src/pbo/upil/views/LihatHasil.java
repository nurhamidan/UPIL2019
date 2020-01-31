/*
 *  Nama : Tassyakur Pasya
 *  Kelas : IF01
 *  NIM : 10118009
 *  Deskripsi Program : 
 */
package pbo.upil.views;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pbo.upil.koneksi.Koneksi;

/**
 *
 * @author Achapasya2109
 */
public class LihatHasil extends javax.swing.JFrame {
    
    private static LihatHasil lihatHasil;
    

    /**
     * Creates new form LihatHasil
     */
    private LihatHasil() {
        initComponents();
    }
    
    public static LihatHasil getInstance() {
        if (lihatHasil == null) {
            lihatHasil = new LihatHasil();
        }
        return lihatHasil;
    }
    
    public void refreshPnlKandidat() {
        String sql = "SELECT * FROM kandidat";
        try {
            PreparedStatement ps = Koneksi.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KartuHasil kartuHasil = new KartuHasil();
                kartuHasil.getLblNomorKandidat().setText(Integer.toString(rs.getInt("no_kandidat")));
                kartuHasil.getLblNamaKandidat().setText(rs.getString("nama"));
                String sql2 = "SELECT * FROM pemilih WHERE no_kandidat = ?";
                try {
                    PreparedStatement ps2 = Koneksi.getConnection().prepareStatement(sql2);
                    ps2.setInt(1, rs.getInt("no_kandidat"));
                    ResultSet rs2 = ps2.executeQuery();
                    rs2.last();
                    kartuHasil.getLblJumlahSuara().setText(Integer.toString(rs2.getRow()));
                    
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                pnlKandidat.add(kartuHasil);
            }
            ps.close();
            JOptionPane.showMessageDialog(this, "Refresh Berhasil", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal Refresh", "Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlKandidat = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1060, 600));

        pnlContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hasil Pemilihan");
        pnlContainer.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1060, -1));

        jScrollPane1.setViewportView(pnlKandidat);

        pnlContainer.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 1030, 180));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbo/upil/media/Frame.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(1060, 600));
        pnlContainer.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LihatHasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LihatHasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LihatHasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LihatHasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LihatHasil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlKandidat;
    // End of variables declaration//GEN-END:variables
}