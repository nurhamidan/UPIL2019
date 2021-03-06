/*
 *  Nama : Tassyakur Pasya
 *  Kelas : IF01
 *  NIM : 10118009
 *  Deskripsi Program : 
 */
package pbo.upil.views;

import javax.swing.JLabel;

/**
 *
 * @author Achapasya2109
 */
public class KartuHasil extends javax.swing.JPanel {

    /**
     * Creates new form KartuHasil
     */
    public KartuHasil() {
        initComponents();
    }

    public JLabel getLblJumlahSuara() {
        return lblJumlahSuara;
    }

    public JLabel getLblNamaKandidat() {
        return lblNamaKandidat;
    }

    public JLabel getLblNomorKandidat() {
        return lblNomorKandidat;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomorKandidat = new javax.swing.JLabel();
        pnlNamaKandidat = new javax.swing.JPanel();
        lblNamaKandidat = new javax.swing.JLabel();
        pnlJumlahSuara = new javax.swing.JPanel();
        lblJumlahSuara = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(260, 161));
        setPreferredSize(new java.awt.Dimension(261, 161));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNomorKandidat.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblNomorKandidat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomorKandidat.setText("jLabel1");
        add(lblNomorKandidat, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 236, 65));

        pnlNamaKandidat.setBackground(new java.awt.Color(49, 173, 226));

        lblNamaKandidat.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNamaKandidat.setForeground(new java.awt.Color(255, 255, 255));
        lblNamaKandidat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNamaKandidat.setText("Nama Kandidat");

        javax.swing.GroupLayout pnlNamaKandidatLayout = new javax.swing.GroupLayout(pnlNamaKandidat);
        pnlNamaKandidat.setLayout(pnlNamaKandidatLayout);
        pnlNamaKandidatLayout.setHorizontalGroup(
            pnlNamaKandidatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNamaKandidat, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );
        pnlNamaKandidatLayout.setVerticalGroup(
            pnlNamaKandidatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNamaKandidat, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        add(pnlNamaKandidat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 260, 40));

        pnlJumlahSuara.setBackground(new java.awt.Color(17, 30, 54));

        lblJumlahSuara.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblJumlahSuara.setForeground(new java.awt.Color(255, 255, 255));
        lblJumlahSuara.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJumlahSuara.setText("Jumlah Suara");

        javax.swing.GroupLayout pnlJumlahSuaraLayout = new javax.swing.GroupLayout(pnlJumlahSuara);
        pnlJumlahSuara.setLayout(pnlJumlahSuaraLayout);
        pnlJumlahSuaraLayout.setHorizontalGroup(
            pnlJumlahSuaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblJumlahSuara, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );
        pnlJumlahSuaraLayout.setVerticalGroup(
            pnlJumlahSuaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJumlahSuaraLayout.createSequentialGroup()
                .addComponent(lblJumlahSuara, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(pnlJumlahSuara, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 260, 40));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 160));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblJumlahSuara;
    private javax.swing.JLabel lblNamaKandidat;
    private javax.swing.JLabel lblNomorKandidat;
    private javax.swing.JPanel pnlJumlahSuara;
    private javax.swing.JPanel pnlNamaKandidat;
    // End of variables declaration//GEN-END:variables
}
