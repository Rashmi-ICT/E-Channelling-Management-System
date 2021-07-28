/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chanelling;


import java.sql.SQLException;


import java.sql.Connection;
import java.sql.PreparedStatement;



import chanelling.connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;  //connect databas 

/**
 *csc
 * @author Rashmi
 */
public class DocDetails extends javax.swing.JFrame {
    
        Connection conn = connection.connect();

    /**
     * Creates new form DocDetails
     */
    public DocDetails() {
        initComponents();
          setLocationRelativeTo(null);// window
    }
    
    public final void DocGridView(){
        
        try{
            
       
            PreparedStatement ps = conn.prepareStatement("Select * from doctor"); // get data 
            ResultSet rs=ps.executeQuery();
            DefaultTableModel tm = (DefaultTableModel)jTable1.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                
                Object o[] = {rs.getInt("id"),rs.getString("name"),rs.getString("address"),rs.getString("tp"),
                    rs.getString("email"),rs.getString("room"),rs.getString("specialist"),rs.getString("charges"),rs.getString("gender"),rs.getString("day"),rs.getString("zoomLink")};
                tm.addRow(o);
                
                
                
            }
            
            
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null,"Error in Attendance Grid View..... "+e);
        }
        
        
        
    }
    
  

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtname1 = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txttp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtroom = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtsp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtch = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtgend = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtday = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtZOOM = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jTextField2.setText("jTextField1");

        jLabel12.setBackground(new java.awt.Color(255, 153, 51));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 51));
        jLabel12.setText("DOCTOR DETAILS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 153, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("E - Chanelling System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(666, 666, 666)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("DOCTOR DETAILS");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, 306, 40));
        jPanel4.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 207, 37));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DOC ID");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 103, 46));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("DOC NAME");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 111, 30));
        jPanel4.add(txtname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 207, 37));
        jPanel4.add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 207, 36));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ADDRESS");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, 28));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TP");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 86, 28));

        txttp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttpActionPerformed(evt);
            }
        });
        jPanel4.add(txttp, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 207, 36));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("E-MAIL");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 86, 28));

        txtmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmailActionPerformed(evt);
            }
        });
        jPanel4.add(txtmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 207, 34));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ROOM");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 86, 28));

        txtroom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel4.add(txtroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 207, 32));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SPECIALIST");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, -1, 28));
        jPanel4.add(txtsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 207, 36));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CHARGERS");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, -1, 28));
        jPanel4.add(txtch, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 207, 37));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("GENDER");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, 106, 28));

        txtgend.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male ", "female" }));
        jPanel4.add(txtgend, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 580, 207, 38));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DAY");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 640, -1, 28));

        txtday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sunday", "monday", "tuesday", "wendsday", "thuesday", "friday", "saterday" }));
        jPanel4.add(txtday, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 640, 209, 34));

        jButton6.setBackground(new java.awt.Color(51, 153, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("ADD");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 820, 104, 33));

        jButton1.setBackground(new java.awt.Color(255, 153, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 820, 104, 33));

        jButton3.setBackground(new java.awt.Color(255, 51, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 820, 104, 33));

        jButton5.setBackground(new java.awt.Color(51, 153, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("BACK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 390, 104, 33));

        jButton4.setBackground(new java.awt.Color(0, 204, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("REFRESH");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 820, 104, 33));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ZOOM LINK");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 700, -1, 28));
        jPanel4.add(txtZOOM, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 700, 207, 36));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "DOCNAME", "ADDRESS", "TP", "E-MAIL", "ROOM", "SPRECIALIST", "CHARGERS", "GENDER", "DATE", "ZOOM LINK"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 1044, 180));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("DOCTOR DETAILS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(450, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(410, 410, 410))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 1040, 40));

        jLabel4.setBackground(new java.awt.Color(0, 153, 153));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chanelling/AdobeStock_306896548-scaled.jpeg"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1880, 960));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1862, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // delete data
        try{
            String sql = "DELETE FROM doctor where id  =?";
        
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                
                
                int id = Integer.parseInt(txtid.getText());
                
                
                  
                    preparedStatement.setInt(1, id);

                    preparedStatement.executeUpdate();
                    
                 
                    JOptionPane.showMessageDialog(null,"data deleted") ;
                    System.out.println("Data deleted");
                    DocGridView();
                    
        }catch(SQLException e){
            System.out.println(e);
        }
        
        
     

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txttpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttpActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        
          
        try{
            String sql = "INSERT INTO doctor VALUES (?,?,?,?,?,?,?,?,?,?,?)"; // insert data 
        
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                
                
                int id = Integer.parseInt(txtid.getText());
                String name = txtname1.getText();
                String address =txtaddress .getText();
                String tp = txttp.getText();
                String email =txtmail.getText();
                String room = txtroom.getSelectedItem().toString();
                String specialist = txtsp.getText();
                String charge = txtch.getText();
                String gender = txtgend.getSelectedItem().toString();
                String date = txtday.getSelectedItem().toString();
                String zoom = txtZOOM.getText();
                
                
                  
                    preparedStatement.setInt(1, id);
                    preparedStatement.setString(2,  name);
                    preparedStatement.setString(3, address);
                    preparedStatement.setString(4, tp);
                    preparedStatement.setString(5,email);
                    preparedStatement.setString(6, room);
                    preparedStatement.setString(7, specialist);
                    preparedStatement.setString(8,charge);
                    preparedStatement.setString(9,gender);
                    preparedStatement.setString(10,date);
                    preparedStatement.setString(11,zoom);
                    
                    
                    


                    preparedStatement.executeUpdate();
                    
                 
                    JOptionPane.showMessageDialog(null,"data inserted") ;
                    System.out.println("Data Inserted");
                    DocGridView();
                    
        }catch(SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        DocGridView();
        
       
        
        
    }//GEN-LAST:event_formWindowOpened

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         DocGridView();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
// update data 
        
           
        try{
            String sql = "UPDATE doctor  SET name =? ,address =? ,tp =? ,email = ? ,room =? ,specialist = ? , charges = ? , gender =? where id =? ";
        
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                
                
                int id = Integer.parseInt(txtid.getText());
                String name = txtname1.getText();
                String address =txtaddress .getText();
                String tp = txttp.getText();
                String email =txtmail.getText();
                String room = txtroom.getSelectedItem().toString();
                String specialist = txtsp.getText();
                String charge = txtch.getText();
                String gender = txtgend.getSelectedItem().toString();
                
                
                  
                   
                    preparedStatement.setString(1,  name);
                    preparedStatement.setString(2, address);
                    preparedStatement.setString(3, tp);
                    preparedStatement.setString(4,email);
                    preparedStatement.setString(5, room);
                    preparedStatement.setString(6, specialist);
                    preparedStatement.setString(7,charge);
                    preparedStatement.setString(8,gender);
                     preparedStatement.setInt(9, id);
                   
                    
                    


                    preparedStatement.executeUpdate();
                    
                 
                    JOptionPane.showMessageDialog(null,"data updated") ;
                    System.out.println("Data Updated");
                    DocGridView();
                    
        }catch(SQLException e){
            System.out.println(e);
        }
        
        
      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        Doctor  dd = new  Doctor();
        dd.setVisible(true); 
        this.hide();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(DocDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DocDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DocDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DocDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DocDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField txtZOOM;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtch;
    private javax.swing.JComboBox<String> txtday;
    private javax.swing.JComboBox<String> txtgend;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtname1;
    private javax.swing.JComboBox<String> txtroom;
    private javax.swing.JTextField txtsp;
    private javax.swing.JTextField txttp;
    // End of variables declaration//GEN-END:variables
}
