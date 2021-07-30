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
import java.sql.Statement;
import javax.swing.JOptionPane;


//  connect database

public class Chanel extends javax.swing.JFrame {
        Connection conn = connection.connect();

    /**
     * Creates new form Chanel
     */
    public Chanel() {
        initComponents();
          setLocationRelativeTo(null); //  window open
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        txtRoom1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbPid1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtPname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAd = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTp = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtPath = new javax.swing.JTextField();
        cmbDid = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCh = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtHc = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtRoom = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtZOOM = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("PATIENT ID");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("HOSPITLE CHARGE");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("SUBMIT");

        txtRoom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoom1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("HOSPITLE CHARGE");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("E - Chanelling System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("CREATE CHANELL");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 21, 308, 38));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("PATIENT ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 106, 119, -1));

        cmbPid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPid1ActionPerformed(evt);
            }
        });
        jPanel2.add(cmbPid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 103, 209, 34));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("PATEINT NAME");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 175, -1, -1));
        jPanel2.add(txtPname, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 164, 209, 33));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("ADRESS");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 240, -1, -1));
        jPanel2.add(txtAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 229, 209, 33));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("TP");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 308, -1, -1));
        jPanel2.add(txtTp, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 280, 209, 33));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("PATHOLOGEI");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 368, -1, -1));
        jPanel2.add(txtPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 344, 209, 33));

        cmbDid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDidActionPerformed(evt);
            }
        });
        jPanel2.add(cmbDid, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 415, 209, 38));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("DOCTOR ID");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 420, 119, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("DOCTOR NAME");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 490, 148, -1));
        jPanel2.add(txtDname, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 488, 209, 33));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("DOC CHARGE");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 539, 132, 34));

        txtCh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChActionPerformed(evt);
            }
        });
        jPanel2.add(txtCh, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 543, 209, 33));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("HOSPITLE CHARGES");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 603, -1, 32));

        txtHc.setText("500");
        txtHc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHcActionPerformed(evt);
            }
        });
        jPanel2.add(txtHc, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 606, 209, 33));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("ROOM NO");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 666, -1, 32));

        txtRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomActionPerformed(evt);
            }
        });
        jPanel2.add(txtRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 669, 209, 33));

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("SUBMIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 813, -1, -1));

        jButton5.setBackground(new java.awt.Color(51, 153, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("CANCEL");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 813, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("ZOOM LINK");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 730, -1, 32));

        txtZOOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZOOMActionPerformed(evt);
            }
        });
        jPanel2.add(txtZOOM, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 733, 209, 33));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chanelling/AAAnhs-dental-appointment.jpg"))); // NOI18N
        jLabel17.setText("jLabel17");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 880));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
         try{
            String sql = "INSERT INTO chanel VALUES (?,?,?,?,?,?,?,?,?,?,?,now(),?)"; // input data
        
                PreparedStatement preparedStatement = conn.prepareStatement(sql); // database connect
                
                
                int id = Integer.parseInt(cmbPid1.getSelectedItem().toString()); // add combobox
                String name = txtPname.getText();
                 String address = txtAd.getText();
                 String tp = txtTp.getText();
                 String patho = txtPath.getText();
                 int did =Integer.parseInt(cmbDid.getSelectedItem().toString());
                 String dname =txtDname.getText();
                String dcharge =txtCh.getText();
                String hcharge = txtHc.getText();
                String room = txtRoom.getText();
                String zoom = txtZOOM.getText();
                
                
               
                
                
                    preparedStatement.setInt(1, 0);
                    preparedStatement.setInt(2, id);
                    preparedStatement.setString(3, name);
                    preparedStatement.setString(4, address);
                    preparedStatement.setString(5, tp);
                    preparedStatement.setString(6,  patho);
                    preparedStatement.setInt(7,did );
                    preparedStatement.setString(8, dname);
                    preparedStatement.setString(9,dcharge);
                    preparedStatement.setString(10, hcharge);
                    preparedStatement.setString(11, room);
                    preparedStatement.setString(12, zoom);
               
                    


                    preparedStatement.executeUpdate();
                    
                 
                    JOptionPane.showMessageDialog(null,"created chanel") ;
                    System.out.println("Data Inserted");
                   
                    
        }catch(SQLException e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
   
            try{
                
         Statement st = conn.createStatement();

         ResultSet r=st.executeQuery("select * from patient");

         while (r.next()) {  

            cmbPid1.addItem(r.getString("id"));  
             
         }
         
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null,"Error in Attendance Grid View..... "+e);
        }
            
            
            
            
            
          //Doc Id For Combo
          
          try{
                
        Statement st = conn.createStatement();

         ResultSet r=st.executeQuery("select * from doctor");

         while (r.next()) {  

            cmbDid.addItem(r.getString("id"));  
             
         }
         
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null,"Error in Attendance Grid View..... "+e);
        }
        
        
    }//GEN-LAST:event_formWindowOpened

    private void cmbDidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDidActionPerformed
        // TODO add your handling code here:
        
      
       
        String Did = cmbDid.getSelectedItem().toString();
        
        
         try{
                
        Statement st = conn.createStatement();

         ResultSet r=st.executeQuery("select * from doctor where id = "+Did+";");

         while (r.next()) {  

            
             txtDname.setText(r.getString("name"));
             txtRoom.setText(r.getString("room"));
             txtCh.setText(r.getString("charge"));
             txtZOOM.setText(r.getString("zoom"));
             
         }
         
        }
        catch(SQLException e){
            
            JOptionPane.showMessageDialog(null,"Error in Attendance Grid View..... "+e);
        }
        
    }//GEN-LAST:event_cmbDidActionPerformed

    private void cmbPid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPid1ActionPerformed
        // TODO add your handling code here:
        
       String Pid = cmbPid1.getSelectedItem().toString();
        
        
         try{
                
        Statement st = conn.createStatement();

         ResultSet r=st.executeQuery("select * from patient where id = "+Pid+";");

         while (r.next()) {  

            
             txtPname.setText(r.getString("name"));
             txtAd.setText(r.getString("address"));
             txtTp.setText(r.getString("tp"));
                txtPath.setText(r.getString("pathologie"));
             
         }
         
        }
        catch(SQLException e){
            
            JOptionPane.showMessageDialog(null,"Error in Attendance Grid View..... "+e);
        }
        
    }//GEN-LAST:event_cmbPid1ActionPerformed

    private void txtRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomActionPerformed

    private void txtChActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChActionPerformed

    private void txtRoom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoom1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoom1ActionPerformed

    private void txtHcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHcActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        Reseption rr = new Reseption();
        rr.setVisible(true);
        this.hide();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtZOOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZOOMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZOOMActionPerformed

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
            java.util.logging.Logger.getLogger(Chanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbDid;
    private javax.swing.JComboBox<String> cmbPid1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField txtAd;
    private javax.swing.JTextField txtCh;
    private javax.swing.JTextField txtDname;
    private javax.swing.JTextField txtHc;
    private javax.swing.JTextField txtPath;
    private javax.swing.JTextField txtPname;
    private javax.swing.JTextField txtRoom;
    private javax.swing.JTextField txtRoom1;
    private javax.swing.JTextField txtTp;
    private javax.swing.JTextField txtZOOM;
    // End of variables declaration//GEN-END:variables
}
