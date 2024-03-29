/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Route;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 * 
 *
 * @author ADMIN
 */
public class RegisterRoute extends javax.swing.JFrame {

    /**
     * Creates new form RegisterRoute
     */
    public RegisterRoute() {
        initComponents();
        table_update();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtdistance = new javax.swing.JTextField();
        txtend = new javax.swing.JTextField();
        txtstart = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        search = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        txtexit = new javax.swing.JButton();
        txtclear = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Route Registration");
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 153));
        jLabel1.setText("Route Registration");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 350, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Record Entry", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(153, 0, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(102, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Route ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 31, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Route Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 59, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Start Place");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 93, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("End Place");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 127, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Distance(km)");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 161, -1, -1));

        txtid.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 28, 71, -1));

        txtdistance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdistanceActionPerformed(evt);
            }
        });
        jPanel1.add(txtdistance, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 158, 71, -1));
        jPanel1.add(txtend, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 124, 71, -1));
        jPanel1.add(txtstart, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 90, 71, -1));
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 56, 71, -1));

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 218, -1, -1));

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 218, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 218, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 70, 280, 260));

        table.setBackground(new java.awt.Color(242, 242, 242));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Route_ID", "Route_Name", "From", "To", "Distance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 410, 220));

        search.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        search.setForeground(new java.awt.Color(51, 0, 51));
        search.setText("Search by Root ID");
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        txtsearch.setBackground(new java.awt.Color(153, 153, 255));
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        getContentPane().add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 220, -1));

        txtexit.setBackground(new java.awt.Color(153, 153, 255));
        txtexit.setText("Exit");
        txtexit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexitActionPerformed(evt);
            }
        });
        getContentPane().add(txtexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 99, 30));

        txtclear.setBackground(new java.awt.Color(153, 153, 255));
        txtclear.setText("Clear");
        txtclear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclearActionPerformed(evt);
            }
        });
        getContentPane().add(txtclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 87, 30));

        jButton4.setBackground(new java.awt.Color(51, 102, 255));
        jButton4.setText("Next Page");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 90, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Route/route.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void table_update(){
        int c;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/Tour_Management_DataBase","root","");
            PreparedStatement insert=con1.prepareStatement("select * from route");
            ResultSet rs=insert.executeQuery();
            ResultSetMetaData Rss=rs.getMetaData();
            c=Rss.getColumnCount();
            
            DefaultTableModel Df=(DefaultTableModel)table.getModel();
            Df.setRowCount(0);
            
             while(rs.next()){
                 Vector v2=new Vector();
                 for(int a=1;a<=c;a++){
                     v2.add(rs.getString("Route_ID"));
                     v2.add(rs.getString("Route_Name"));
                     v2.add(rs.getString("Start_Place"));
                     v2.add(rs.getString("End_Place"));
                     v2.add(rs.getString("Distance"));
                 }     
                 Df.addRow(v2);
             }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegisterRoute.class.getName()).log(Level.SEVERE, null, ex);
        }catch(SQLException ex){
           Logger.getLogger(RegisterRoute.class.getName()).log(Level.SEVERE, null, ex); 
        }
    }
    
    private void txtdistanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdistanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdistanceActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String id=txtid.getText();
        String name=txtname.getText();
        String start=txtstart.getText();
        String end=txtend.getText();
        String distance=txtdistance.getText();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/Tour_Management_DataBase","root","");
            PreparedStatement insert=con1.prepareStatement("insert into route(Route_ID,Route_Name,Start_Place,End_Place,Distance)values(?,?,?,?,?)");
            insert.setString(1,id);
            insert.setString(2,name);
            insert.setString(3,start);
            insert.setString(4,end);
            insert.setString(5,distance);
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Record Added!!!");
            table_update();
            
            txtid.setText("");
            txtname.setText("");
            txtstart.setText("");
            txtend.setText("");
            txtdistance.setText("");
            txtname.requestFocus();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegisterRoute.class.getName()).log(Level.SEVERE, null, ex);
        }catch(SQLException ex){
           Logger.getLogger(RegisterRoute.class.getName()).log(Level.SEVERE, null, ex); 
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel Df=(DefaultTableModel)table.getModel();
        int selectedIndex=table.getSelectedRow();

        //Get values from the table
        String id=Df.getValueAt(selectedIndex,0).toString();
        String name=txtname.getText();
        String start=txtstart.getText();
        String end=txtend.getText();
        String distance=txtdistance.getText();

        //Update the database record
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/Tour_Management_DataBase","root","");
        PreparedStatement insert=con1.prepareStatement("update route set Route_Name=?,Start_Place=?,End_Place=?,Distance=? where Route_ID=?");
        insert.setString(1,name);
        insert.setString(2,start);
        insert.setString(3,end);
        insert.setString(4,distance);
        insert.setString(5,id);
        int rowsAffected = insert.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Record Updated!!!");
            table_update();

            txtid.setText("");
            txtname.setText("");
            txtstart.setText("");
            txtend.setText("");
            txtdistance.setText("");
            txtname.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update record!");
        }

        con1.close();
    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(RegisterRoute.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       DefaultTableModel Df=(DefaultTableModel)table.getModel();
       int selectedIndex=table.getSelectedRow(); 
       try {
           //int distance=Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());
           String id=(Df.getValueAt(selectedIndex,0).toString());
           int dialogResult=JOptionPane.showConfirmDialog(null,"Do you want to Delete the Record","Warning",JOptionPane.YES_NO_OPTION);
           if(dialogResult==JOptionPane.YES_OPTION){
               Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/Tour_Management_DataBase","root","");
                PreparedStatement insert=con1.prepareStatement("delete from route where Route_ID=?");
                insert.setString(1,id);
                
                insert.executeUpdate();
            
                JOptionPane.showMessageDialog(this, "Record Deleted!!!");
                table_update();

                txtid.setText("");
                txtname.setText("");
                txtstart.setText("");
                txtend.setText("");
                txtdistance.setText("");
                txtname.requestFocus();
           } 
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegisterRoute.class.getName()).log(Level.SEVERE, null, ex);
        }catch(SQLException ex){
           Logger.getLogger(RegisterRoute.class.getName()).log(Level.SEVERE, null, ex); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        DefaultTableModel Df=(DefaultTableModel)table.getModel();
        int selectedIndex=table.getSelectedRow();

        txtid.setText(Df.getValueAt(selectedIndex,0).toString());
        txtname.setText(Df.getValueAt(selectedIndex,1).toString());
        txtstart.setText(Df.getValueAt(selectedIndex,2).toString());
        txtend.setText(Df.getValueAt(selectedIndex,3).toString());
        txtdistance.setText(Df.getValueAt(selectedIndex,4).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
     try {
    // String search=txtsearch.getText();       
    String id = txtsearch.getText();
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tour_Management_DataBase", "root", "");
    PreparedStatement insert = con1.prepareStatement("SELECT Route_Name, Start_Place, End_Place, Distance FROM route WHERE Route_Id = ?");
    insert.setString(1, id);
    ResultSet rs = insert.executeQuery();

    if (rs.next()==true) {
        String name = rs.getString(1);
        String start = rs.getString(2);
        String end = rs.getString(3);
        String distance = rs.getString(4);

        txtname.setText(name);
        txtstart.setText(start);
        txtend.setText(end);
        txtdistance.setText(distance);
        JOptionPane.showMessageDialog(this, "Data found for ID: " + id,"Found", JOptionPane.INFORMATION_MESSAGE);
    } else {
        txtname.setText("");
        txtstart.setText("");
        txtend.setText("");
        txtdistance.setText("");
        JOptionPane.showMessageDialog(this, "No data found for ID: " + id,"Not Found", JOptionPane.INFORMATION_MESSAGE);
    }

    rs.close();
    insert.close();
    con1.close();
} catch (ClassNotFoundException | SQLException ex) {
    ex.printStackTrace(); // Print the exception stack trace for debugging purposes
    }
    }//GEN-LAST:event_txtsearchActionPerformed

    private void txtexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_txtexitActionPerformed

    private void txtclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclearActionPerformed
                txtid.setText("");
                txtname.setText("");
                txtstart.setText("");
                txtend.setText("");
                txtdistance.setText("");
    }//GEN-LAST:event_txtclearActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        CreateVehicleRoute create = new CreateVehicleRoute();
        create.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterRoute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterRoute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterRoute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterRoute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterRoute().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel search;
    private javax.swing.JTable table;
    private javax.swing.JButton txtclear;
    private javax.swing.JTextField txtdistance;
    private javax.swing.JTextField txtend;
    private javax.swing.JButton txtexit;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtstart;
    // End of variables declaration//GEN-END:variables
}
