package pbo.upil.views;

import java.awt.Frame;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import pbo.upil.databases.UpilDatabase;
import pbo.upil.errors.KandidatException;
import pbo.upil.models.TableKandidatModel;
import pbo.upil.services.KandidatDao;

/**
 *
 * @author Achapasya2109
 */
public class TampilanAdmin extends javax.swing.JFrame {
    private TableKandidatModel tableModel;
    public TampilanAdmin() {
        tableModel = new TableKandidatModel();
        initComponents();
        tableKandidat.setModel(tableModel);
    }

    public JTable getTableKandidat() {
        return tableKandidat;
    }
    public void loadDatabase() throws SQLException, KandidatException{
        KandidatDao kdao = UpilDatabase.getKandidatDao();
        tableModel.setList(kdao.selectAllKandidat());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUbah = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnHasil = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKandidat = new javax.swing.JTable();
        pnlExit = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnlMinimize = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pnlBack = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUbah.setBackground(new java.awt.Color(49, 173, 226));
        btnUbah.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnUbah.setForeground(new java.awt.Color(250, 248, 240));
        btnUbah.setText("Ubah");
        btnUbah.setAlignmentY(1.0F);
        btnUbah.setFocusable(false);
        btnUbah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUbahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUbahMouseExited(evt);
            }
        });
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        getContentPane().add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 240, 60));

        btnTambah.setBackground(new java.awt.Color(49, 173, 226));
        btnTambah.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(250, 248, 240));
        btnTambah.setText("Tambah");
        btnTambah.setAlignmentY(1.0F);
        btnTambah.setFocusable(false);
        btnTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTambahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTambahMouseExited(evt);
            }
        });
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 240, 60));

        btnHapus.setBackground(new java.awt.Color(49, 173, 226));
        btnHapus.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(250, 248, 240));
        btnHapus.setText("Hapus");
        btnHapus.setAlignmentY(1.0F);
        btnHapus.setFocusable(false);
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHapusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHapusMouseExited(evt);
            }
        });
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 240, 60));

        btnHasil.setBackground(new java.awt.Color(49, 173, 226));
        btnHasil.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnHasil.setForeground(new java.awt.Color(250, 248, 240));
        btnHasil.setText("Hasil");
        btnHasil.setAlignmentY(1.0F);
        btnHasil.setFocusable(false);
        btnHasil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHasilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHasilMouseExited(evt);
            }
        });
        btnHasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHasilActionPerformed(evt);
            }
        });
        getContentPane().add(btnHasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 240, 60));

        jLabel1.setBackground(new java.awt.Color(250, 248, 240));
        jLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Daftar Kandidat");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1060, -1));

        tableKandidat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {}
            },
            new String [] {

            }
        ));
        tableKandidat.setFocusable(false);
        tableKandidat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKandidatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tableKandidatMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tableKandidat);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 490, 230));

        pnlExit.setBackground(new java.awt.Color(250, 248, 240));

        jLabel4.setBackground(new java.awt.Color(255, 102, 102));
        jLabel4.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(109, 109, 109));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("x");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlExitLayout = new javax.swing.GroupLayout(pnlExit);
        pnlExit.setLayout(pnlExitLayout);
        pnlExitLayout.setHorizontalGroup(
            pnlExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        pnlExitLayout.setVerticalGroup(
            pnlExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pnlExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, 30, -1));

        pnlMinimize.setBackground(new java.awt.Color(250, 248, 240));

        jLabel6.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("_");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlMinimizeLayout = new javax.swing.GroupLayout(pnlMinimize);
        pnlMinimize.setLayout(pnlMinimizeLayout);
        pnlMinimizeLayout.setHorizontalGroup(
            pnlMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlMinimizeLayout.setVerticalGroup(
            pnlMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pnlMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 30, -1));

        pnlBack.setBackground(new java.awt.Color(250, 248, 240));

        jLabel7.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("<");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlBackLayout = new javax.swing.GroupLayout(pnlBack);
        pnlBack.setLayout(pnlBackLayout);
        pnlBackLayout.setHorizontalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlBackLayout.setVerticalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        getContentPane().add(pnlBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jLabel2.setBackground(new java.awt.Color(250, 248, 240));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbo/upil/media/bg.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambahMouseEntered

    private void btnTambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambahMouseExited

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        TambahKandidat tambahKandidat = new TambahKandidat(this, true, tableKandidat);
        tambahKandidat.setVisible(true);
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusMouseEntered

    private void btnHapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusMouseExited

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnHasilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHasilMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHasilMouseEntered

    private void btnHasilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHasilMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHasilMouseExited

    private void btnHasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHasilActionPerformed

    }//GEN-LAST:event_btnHasilActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (tableKandidat.getSelectedRow() < 0) {
            btnUbah.setEnabled(false);
        }
    }//GEN-LAST:event_formWindowActivated

    private void tableKandidatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKandidatMouseEntered
        if (tableKandidat.getSelectedRow() < 0) {
            btnUbah.setEnabled(false);
        } else {
            btnUbah.setEnabled(true);
        }
    }//GEN-LAST:event_tableKandidatMouseEntered

    private void tableKandidatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKandidatMouseClicked
        if (tableKandidat.getSelectedRow() < 0) {
            btnUbah.setEnabled(false);
        } else {
            btnUbah.setEnabled(true);
        }
    }//GEN-LAST:event_tableKandidatMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        pnlExit.setBackground(new java.awt.Color(153,153,153));
        jLabel1.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        pnlExit.setBackground(new java.awt.Color(250,248,240));
        jLabel4.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        pnlMinimize.setBackground(new java.awt.Color(153,153,153));
        jLabel4.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        pnlMinimize.setBackground(new java.awt.Color(250,248,240));
        jLabel4.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_jLabel6MouseExited

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        UbahKandidat dialogUbahKandidat = new UbahKandidat(this, true);
        dialogUbahKandidat.getTxtNomorKandidat().setText(tableKandidat.getValueAt(tableKandidat.getSelectedRow(), 0).toString());
        dialogUbahKandidat.getTxtNamaKandidat().setText(tableKandidat.getValueAt(tableKandidat.getSelectedRow(), 1).toString());
        dialogUbahKandidat.setVisible(true);
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnUbahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUbahMouseExited

    private void btnUbahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahMouseEntered
       pnlBack.setBackground(new java.awt.Color(153,153,153));
        jLabel7.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_btnUbahMouseEntered

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        pnlBack.setBackground(new java.awt.Color(153,153,153));
        jLabel7.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        pnlBack.setBackground(new java.awt.Color(250,248,240));
        jLabel7.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_jLabel7MouseExited

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
            java.util.logging.Logger.getLogger(TampilanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilanAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHasil;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlExit;
    private javax.swing.JPanel pnlMinimize;
    private javax.swing.JTable tableKandidat;
    // End of variables declaration//GEN-END:variables
}
