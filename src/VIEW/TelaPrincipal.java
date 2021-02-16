package VIEW;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblDataAtual = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        itemImprimir = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        itemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDataAtual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataAtual.setText(getDataAtual());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDataAtual, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDataAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );

        menuArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/.images/.icons/icon_folder_page.png"))); // NOI18N
        menuArquivo.setText("Arquivo");

        itemImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/.images/.icons/icon_print.png"))); // NOI18N
        itemImprimir.setText("Imprimir...");
        menuArquivo.add(itemImprimir);

        jMenuBar1.add(menuArquivo);

        menuAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/.images/.icons/icon_help.png"))); // NOI18N
        menuAjuda.setText("Ajuda");

        itemSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/.images/.icons/icon_information.png"))); // NOI18N
        itemSobre.setText("Sobre");
        menuAjuda.add(itemSobre);

        jMenuBar1.add(menuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    /*public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }*/
    
    public String getDataAtual(){
        String dataAtual;
        
        Calendar c = Calendar.getInstance();
        
        Date data = c.getTime();
        
        DateFormat df = DateFormat.getDateInstance();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        dataAtual = sdf.format(data) + " - ";
        
        dataAtual += new DateFormatSymbols().getWeekdays()[c.get(Calendar.DAY_OF_WEEK)];
        
        return dataAtual;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemImprimir;
    private javax.swing.JMenuItem itemSobre;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDataAtual;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    // End of variables declaration//GEN-END:variables
}
