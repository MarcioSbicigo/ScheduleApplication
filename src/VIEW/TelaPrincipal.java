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

        calendarPanel1 = new com.github.lgooddatepicker.components.CalendarPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lblDataAtual = new javax.swing.JLabel();
        dateSeparator = new javax.swing.JSeparator();
        menuBar = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        itemAgendamento = new javax.swing.JMenuItem();
        itemImprimir = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        itemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda - Menu Principal");
        setResizable(false);

        lblDataAtual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataAtual.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        lblDataAtual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblDataAtual.setText(getDataAtual());

        menuArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/.images/.icons/icon_folder_page.png"))); // NOI18N
        menuArquivo.setText("Arquivo");

        itemAgendamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/.images/.icons/icon_add.png"))); // NOI18N
        itemAgendamento.setText("Novo Agendamento");
        itemAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgendamentoActionPerformed(evt);
            }
        });
        menuArquivo.add(itemAgendamento);

        itemImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/.images/.icons/icon_print.png"))); // NOI18N
        itemImprimir.setText("Imprimir...");
        menuArquivo.add(itemImprimir);

        menuBar.add(menuArquivo);

        menuAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/.images/.icons/icon_help.png"))); // NOI18N
        menuAjuda.setText("Ajuda");

        itemSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/.images/.icons/icon_information.png"))); // NOI18N
        itemSobre.setText("Sobre");
        itemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(itemSobre);

        menuBar.add(menuAjuda);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDataAtual, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                    .addComponent(dateSeparator))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDataAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(427, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgendamentoActionPerformed
        
        TelaAgendamento telaAgendamento = new TelaAgendamento();
        
        telaAgendamento.setLocationRelativeTo(null);
        
        telaAgendamento.setVisible(true);
    }//GEN-LAST:event_itemAgendamentoActionPerformed

    private void itemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSobreActionPerformed
        InfoTela telaSobre = new InfoTela();
        
        telaSobre.setLocationRelativeTo(null);
        
        telaSobre.setVisible(true);
    }//GEN-LAST:event_itemSobreActionPerformed


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
    private com.github.lgooddatepicker.components.CalendarPanel calendarPanel1;
    private javax.swing.JSeparator dateSeparator;
    private javax.swing.JMenuItem itemAgendamento;
    private javax.swing.JMenuItem itemImprimir;
    private javax.swing.JMenuItem itemSobre;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDataAtual;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables
}
