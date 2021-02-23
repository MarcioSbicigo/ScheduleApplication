package VIEW;

import java.awt.Cursor;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;


public class InfoTela extends javax.swing.JFrame {

    
    public InfoTela() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInfo = new javax.swing.JPanel();
        lblImageLogo = new javax.swing.JLabel();
        lblCreditImage = new javax.swing.JLabel();
        lblNameProgram = new javax.swing.JLabel();
        lblVersion = new javax.swing.JLabel();
        lblMadeBy = new javax.swing.JLabel();
        lblCreator = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sobre");
        setName("infoFrame"); // NOI18N

        lblImageLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImageLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/.images/schedule.png"))); // NOI18N

        lblCreditImage.setForeground(new java.awt.Color(51, 51, 255));
        lblCreditImage.setText("<html><u>Imagem Fornecida Por Flat Icons</u>");
        lblCreditImage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCreditImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCreditImageMouseClicked(evt);
            }
        });

        lblNameProgram.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNameProgram.setText("Schedule Application");
        lblNameProgram.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVersion.setText("v1.0");
        lblVersion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblMadeBy.setText("Criado por:");
        lblMadeBy.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblCreator.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCreator.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreator.setText("Marcio Junior Sbicigo");

        javax.swing.GroupLayout pnlInfoLayout = new javax.swing.GroupLayout(pnlInfo);
        pnlInfo.setLayout(pnlInfoLayout);
        pnlInfoLayout.setHorizontalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInfoLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCreator)
                    .addComponent(lblCreditImage))
                .addGap(62, 62, 62))
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(lblVersion))
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMadeBy)
                            .addComponent(lblImageLogo)))
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(lblNameProgram)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlInfoLayout.setVerticalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblNameProgram)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImageLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVersion)
                .addGap(12, 12, 12)
                .addComponent(lblMadeBy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCreator)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(lblCreditImage)
                .addContainerGap())
        );

        lblCreditImage.setCursor(new Cursor(Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCreditImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreditImageMouseClicked
    
        try{
            URI link = new URI("https://www.flaticon.com/authors/flat-icons");
            
            Desktop.getDesktop().browse(link);
        }catch(IOException | URISyntaxException error){
            JOptionPane.showMessageDialog(null, "infoTela: " + error.getMessage());
        }
    }//GEN-LAST:event_lblCreditImageMouseClicked

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCreator;
    private javax.swing.JLabel lblCreditImage;
    private javax.swing.JLabel lblImageLogo;
    private javax.swing.JLabel lblMadeBy;
    private javax.swing.JLabel lblNameProgram;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JPanel pnlInfo;
    // End of variables declaration//GEN-END:variables
}
