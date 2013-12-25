/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * meter.java
 *
 * Created on Jul 3, 2012, 1:01:11 PM
 */
package cyber.medallians;

import DBManage.DBManager;
import DBManage.DatabaseConnector;
import UniqueClasses.Metermodel;
import UniqueClasses.metercontroller;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import resources.ApplyTheme;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author DELL
 */
public class meter extends javax.swing.JFrame {
    DefaultTableModel defaultTableModel;
    String ownerID;
    String name;

    /** Creates new form meter */
    public meter() {
        initComponents();
        setLocationRelativeTo(null);
         defaultTableModel=(DefaultTableModel)jtbInMeterWindow.getModel();
    }

    public meter(String name) {
        initComponents();
        setLocationRelativeTo(null);
        defaultTableModel=(DefaultTableModel)jtbInMeterWindow.getModel();
        //throw new UnsupportedOperationException("Not yet implemented");
        ownerID = name;
        System.out.println(ownerID);
     runonload();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbInMeterWindow = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jtfmeterno = new javax.swing.JTextField();
        jtfrpu = new javax.swing.JTextField();
        jtfmadein = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jtfconnecteddate = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lbl = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Meter Details [Ceylon Electricity Board]");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel1.setText("Meter Deatails");
        jLabel1.setBounds(310, 10, 150, 22);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 182, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jtbInMeterWindow.setBackground(new java.awt.Color(204, 255, 255));
        jtbInMeterWindow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Customer Name", "Customer Nic", "Customer ID", "Meter ID", "Meter No"
            }
        ));
        jtbInMeterWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbInMeterWindowMouseClicked(evt);
            }
        });
        jtbInMeterWindow.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtbInMeterWindowKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtbInMeterWindow);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBounds(0, 40, 580, 250);
        jLayeredPane1.add(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.setBounds(110, 180, 270, 40);
        jLayeredPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Meter"));

        jLabel13.setText("Meter No");

        jLabel14.setText("RPU");

        jLabel15.setText("Made IN");

        jtfmadein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfmadeinActionPerformed(evt);
            }
        });

        jLabel16.setText("Connected date");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(14, 14, 14))))
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtfconnecteddate, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtfmadein, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                    .addComponent(jtfrpu, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(jtfmeterno, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfmeterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfrpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfmadein, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfconnecteddate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBounds(600, 50, 300, 132);
        jLayeredPane1.add(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton3.setText("MAIN");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jButton3)
                .addGap(94, 94, 94)
                .addComponent(jButton2)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel5.setBounds(600, 210, 310, 50);
        jLayeredPane1.add(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lbl.setFont(new java.awt.Font("Tahoma", 0, 14));
        lbl.setForeground(new java.awt.Color(0, 51, 255));
        lbl.setText("             ");
        lbl.setBounds(600, 20, 300, 17);
        jLayeredPane1.add(lbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 public void runonload(){
 System.out.println(ownerID);
   // lbl.setText(ownerID);
 String searchbyname = "select name,m.meter_id,name,c.owner_id,nic,meter_no,rpu,made_in,connected_date from consumer c,meter m where c.owner_id=m.owner_id and c.owner_id='"+ownerID+"' ";

 int rowcount=jtbInMeterWindow.getRowCount();
 for(int i=0;i<rowcount;i++){
  defaultTableModel.removeRow(0);
 }
    try {
        Connection connection = null;
            try {
                connection = DatabaseConnector.makeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(meter.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane,"SQL exception ekak bolaw 1");
            }
        ResultSet resultSet =DBManager.getData(connection, searchbyname);
        while(resultSet.next()){
            Object dataRow[]= {resultSet.getString("name"),resultSet.getString("nic"),resultSet.getString("owner_id"),resultSet.getString("meter_id"),resultSet.getString("meter_no")};
            defaultTableModel.addRow(dataRow);
            
            
           name =(resultSet.getString("name"));
     //       for(int j=0 ;j<=10;j++){
          //  System.out.println(dataRow[j]);
            //}
          /*  jtfconnecteddate.setText(resultSet.getString("connected_date"));
            jtfmadein.setText(resultSet.getString("made_in"));
            jtfrpu.setText(resultSet.getString("rpu"));
            jtfmeterno.setText(resultSet.getString("meter_no"));*/
            
        }
        lbl.setText(name);
        
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(consumeraccounts.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane,"SQL exception ekak bolaw 2");
        } catch (SQLException ex) {
            Logger.getLogger(consumeraccounts.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(rootPane,"Ko yako class eka?");
      }
 
     
 }
    
private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.setVisible(false);
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
this.setVisible(false);
//MainWindow MainWindow=new MainWindow();
///MainWindow.setVisible(true);// TODO add your handling code here:
//SearchConsumer searchConsumer =new SearchConsumer();
//searchConsumer.setVisible(false);
}//GEN-LAST:event_jButton3ActionPerformed

private void jtfmadeinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfmadeinActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jtfmadeinActionPerformed

private void jtbInMeterWindowKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtbInMeterWindowKeyPressed
 //TODO add your handling code here:
}//GEN-LAST:event_jtbInMeterWindowKeyPressed

private void jtbInMeterWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbInMeterWindowMouseClicked
  int row=jtbInMeterWindow.getSelectedRow();
    System.out.println(row);
    String meterNo=(String) defaultTableModel.getValueAt(row, 4);
    String meterid=(String) defaultTableModel.getValueAt(row,3);
    
    System.out.println(meterNo);
    System.out.println(meterid);
    
    
    
    ResultSet resultSet=null;
    Metermodel metermodel=new Metermodel();
    metermodel.setMeterID(meterid);
        try {
            resultSet=metercontroller.searchMeterByMeterId(metermodel);
            while(resultSet.next()){
                jtfmeterno.setText(resultSet.getString("Meter_no"));
                jtfrpu.setText(resultSet.getString("rpu"));
                jtfmadein.setText(resultSet.getString("made_in"));
                jtfconnecteddate.setText(resultSet.getString("connected_date"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(removeandchange.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane,"SQL exception ekak bolaw 2");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(removeandchange.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(rootPane,"Ko yako class eka?");
        }
}//GEN-LAST:event_jtbInMeterWindowMouseClicked

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
            java.util.logging.Logger.getLogger(meter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(meter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(meter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(meter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                ApplyTheme.Theme();
                new meter().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbInMeterWindow;
    private javax.swing.JTextField jtfconnecteddate;
    private javax.swing.JTextField jtfmadein;
    private javax.swing.JTextField jtfmeterno;
    private javax.swing.JTextField jtfrpu;
    private javax.swing.JLabel lbl;
    // End of variables declaration//GEN-END:variables
}