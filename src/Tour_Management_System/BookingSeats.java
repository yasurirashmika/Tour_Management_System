/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tour_Management_System;

import Database.databaseConnection;
import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;



/**
 *
 * @author sachintha
 */
public class BookingSeats extends javax.swing.JFrame {

    /**
     * Creates new form BookingSeats
     */
    private int count = 0;
    private int halfCharge = 100;
    private int fullCharge = 200;
    private static int vehicleId;
    private static String date;
    private String routeId;
    private boolean S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, S13, S14, S15, S16, S17, S18, S19, S20, S21, S22, S23, S24, S25, S26, S27, S28, S29, S30, S31, S32, S33, S34, S35, S36, S37;
    Connection con;
    Statement stmt;
    
    public BookingSeats(int vehicleId, String date) {
        initComponents();
         this.vehicleId = vehicleId;
         this.date = date;
         this.con = databaseConnection.connection();
         try
        {
            this.stmt = con.createStatement();
            String query = "select * from vehicleroute";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                if(vehicleId == rs.getInt(3))
                {
                    routeId = rs.getString(2);
                }
            }
            
            query = "select * from route";
            rs = stmt.executeQuery(query);
            while(rs.next())
            {
                if(routeId.equals(rs.getString(1)))
                {
                    txtFrom.setText(rs.getString(3));
                    txtTo.setText(rs.getString(4));
                }
            }
            
            txtVehicleNo.setText(Integer.toString(vehicleId));
            txtDate.setText(date);
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
         
         pnl01.setBackground(new Color(242,242,242));
         pnl02.setBackground(new Color(242,242,242));
         pnl03.setBackground(new Color(242,242,242));
         pnl04.setBackground(new Color(242,242,242));
         pnl05.setBackground(new Color(242,242,242));
         pnl06.setBackground(new Color(242,242,242));
         pnl07.setBackground(new Color(242,242,242));
         pnl08.setBackground(new Color(242,242,242));
         pnl09.setBackground(new Color(242,242,242));
         pnl10.setBackground(new Color(242,242,242));
         pnl11.setBackground(new Color(242,242,242));
         pnl12.setBackground(new Color(242,242,242));
         pnl13.setBackground(new Color(242,242,242));
         pnl14.setBackground(new Color(242,242,242));
         pnl15.setBackground(new Color(242,242,242));
         pnl16.setBackground(new Color(242,242,242));
         pnl17.setBackground(new Color(242,242,242));
         pnl18.setBackground(new Color(242,242,242));
         pnl19.setBackground(new Color(242,242,242));
         pnl20.setBackground(new Color(242,242,242));
         pnl21.setBackground(new Color(242,242,242));
         pnl22.setBackground(new Color(242,242,242));
         pnl23.setBackground(new Color(242,242,242));
         pnl24.setBackground(new Color(242,242,242));
         pnl25.setBackground(new Color(242,242,242));
         pnl26.setBackground(new Color(242,242,242));
         pnl27.setBackground(new Color(242,242,242));
         pnl28.setBackground(new Color(242,242,242));
         pnl29.setBackground(new Color(242,242,242));
         pnl30.setBackground(new Color(242,242,242));
         pnl31.setBackground(new Color(242,242,242));
         pnl32.setBackground(new Color(242,242,242));
         pnl33.setBackground(new Color(242,242,242));
         pnl34.setBackground(new Color(242,242,242));
         pnl35.setBackground(new Color(242,242,242));
         pnl36.setBackground(new Color(242,242,242));
         pnl37.setBackground(new Color(242,242,242));
         
         txtNoOfSeats.setText("0");
         txtNoOfFull.setText("0");
         txtNoOfHalf.setText("0");
         this.setColor();
    }

    public void setColor()
    {
        try
        {
            this.stmt = con.createStatement();
            String query = "select * from Booked_Vehicle where Vehicle_ID = "+vehicleId+" and date='"+date+"'";
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            if(rs.getBoolean(3))
            {
                 pnl01.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(4))
            {
                 pnl02.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(5))
            {
                 pnl03.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(6))
            {
                 pnl04.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(7))
            {
                 pnl05.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(8))
            {
                 pnl06.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(9))
            {
                 pnl07.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(10))
            {
                 pnl08.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(11))
            {
                 pnl09.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(12))
            {
                 pnl10.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(13))
            {
                 pnl11.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(14))
            {
                 pnl12.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(15))
            {
                 pnl13.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(16))
            {
                 pnl14.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(17))
            {
                 pnl15.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(18))
            {
                 pnl16.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(19))
            {
                 pnl17.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(20))
            {
                 pnl18.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(21))
            {
                 pnl19.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(22))
            {
                 pnl20.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(23))
            {
                 pnl21.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(24))
            {
                 pnl22.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(25))
            {
                 pnl23.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(26))
            {
                 pnl24.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(27))
            {
                 pnl25.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(28))
            {
                 pnl26.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(29))
            {
                 pnl27.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(30))
            {
                 pnl28.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(31))
            {
                 pnl29.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(32))
            {
                 pnl30.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(33))
            {
                 pnl31.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(34))
            {
                 pnl32.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(35))
            {
                 pnl33.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(36))
            {
                 pnl34.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(37))
            {
                 pnl35.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(38))
            {
                 pnl36.setBackground(Color.RED);
            }
            
            if(rs.getBoolean(39))
            {
                 pnl37.setBackground(Color.RED);
            }
            
            
        }
        catch(Exception e)
        {
            System.out.println(e);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtFrom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtVehicleNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtNIC = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtPassengerName = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        pnl01 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnl02 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        pnl03 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        pnl04 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        pnl05 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        pnl06 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        pnl07 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        pnl08 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        pnl09 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        pnl10 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        pnl11 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        pnl12 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        pnl13 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        pnl14 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        pnl15 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        pnl16 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        pnl17 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        pnl18 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        pnl19 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        pnl20 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        pnl21 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        pnl22 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        pnl23 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        pnl24 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        pnl25 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        pnl26 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        pnl27 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        pnl28 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        pnl29 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        pnl30 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        pnl31 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        pnl32 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        pnl33 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        pnl34 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        pnl36 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        pnl37 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        pnl35 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtNoOfSeats = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtNoOfHalf = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txtNoOfFull = new javax.swing.JTextField();
        btnBookSeats = new javax.swing.JButton();
        txtTotalAmount = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        btnPay = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Booking Seats");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N
        jLabel3.setText("From");

        txtFrom.setEditable(false);
        txtFrom.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N
        jLabel4.setText("To");

        txtTo.setEditable(false);
        txtTo.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N
        jLabel5.setText("Vehicle No");

        txtVehicleNo.setEditable(false);
        txtVehicleNo.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N
        jLabel6.setText("Date");

        txtDate.setEditable(false);
        txtDate.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtVehicleNo, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVehicleNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 54, -1, 220));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N
        jLabel7.setText("NIC No");

        txtNIC.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N
        jLabel8.setText("Passenger Name");

        txtPassengerName.setEditable(false);
        txtPassengerName.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassengerName)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btnSearch))
                            .addComponent(jLabel8))
                        .addGap(0, 133, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassengerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 54, -1, 220));

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));

        pnl01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl01MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel2.setText("01");

        javax.swing.GroupLayout pnl01Layout = new javax.swing.GroupLayout(pnl01);
        pnl01.setLayout(pnl01Layout);
        pnl01Layout.setHorizontalGroup(
            pnl01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl01Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl01Layout.setVerticalGroup(
            pnl01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl01Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl02MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel9.setText("02");

        javax.swing.GroupLayout pnl02Layout = new javax.swing.GroupLayout(pnl02);
        pnl02.setLayout(pnl02Layout);
        pnl02Layout.setHorizontalGroup(
            pnl02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl02Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel9)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl02Layout.setVerticalGroup(
            pnl02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl02Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl03MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel10.setText("03");

        javax.swing.GroupLayout pnl03Layout = new javax.swing.GroupLayout(pnl03);
        pnl03.setLayout(pnl03Layout);
        pnl03Layout.setHorizontalGroup(
            pnl03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl03Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel10)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl03Layout.setVerticalGroup(
            pnl03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl03Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl04MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel11.setText("04");

        javax.swing.GroupLayout pnl04Layout = new javax.swing.GroupLayout(pnl04);
        pnl04.setLayout(pnl04Layout);
        pnl04Layout.setHorizontalGroup(
            pnl04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl04Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel11)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl04Layout.setVerticalGroup(
            pnl04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl04Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl05MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel12.setText("05");

        javax.swing.GroupLayout pnl05Layout = new javax.swing.GroupLayout(pnl05);
        pnl05.setLayout(pnl05Layout);
        pnl05Layout.setHorizontalGroup(
            pnl05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl05Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel12)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl05Layout.setVerticalGroup(
            pnl05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl05Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl06MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel13.setText("06");

        javax.swing.GroupLayout pnl06Layout = new javax.swing.GroupLayout(pnl06);
        pnl06.setLayout(pnl06Layout);
        pnl06Layout.setHorizontalGroup(
            pnl06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl06Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel13)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl06Layout.setVerticalGroup(
            pnl06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl06Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl07MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel14.setText("07");

        javax.swing.GroupLayout pnl07Layout = new javax.swing.GroupLayout(pnl07);
        pnl07.setLayout(pnl07Layout);
        pnl07Layout.setHorizontalGroup(
            pnl07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl07Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel14)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl07Layout.setVerticalGroup(
            pnl07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl07Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl08MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel15.setText("08");

        javax.swing.GroupLayout pnl08Layout = new javax.swing.GroupLayout(pnl08);
        pnl08.setLayout(pnl08Layout);
        pnl08Layout.setHorizontalGroup(
            pnl08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl08Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel15)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl08Layout.setVerticalGroup(
            pnl08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl08Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl09.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl09MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel16.setText("09");

        javax.swing.GroupLayout pnl09Layout = new javax.swing.GroupLayout(pnl09);
        pnl09.setLayout(pnl09Layout);
        pnl09Layout.setHorizontalGroup(
            pnl09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl09Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel16)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl09Layout.setVerticalGroup(
            pnl09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl09Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl10MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel17.setText("10");

        javax.swing.GroupLayout pnl10Layout = new javax.swing.GroupLayout(pnl10);
        pnl10.setLayout(pnl10Layout);
        pnl10Layout.setHorizontalGroup(
            pnl10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl10Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel17)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl10Layout.setVerticalGroup(
            pnl10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl11MouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel18.setText("11");

        javax.swing.GroupLayout pnl11Layout = new javax.swing.GroupLayout(pnl11);
        pnl11.setLayout(pnl11Layout);
        pnl11Layout.setHorizontalGroup(
            pnl11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl11Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel18)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl11Layout.setVerticalGroup(
            pnl11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl12MouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel19.setText("12");

        javax.swing.GroupLayout pnl12Layout = new javax.swing.GroupLayout(pnl12);
        pnl12.setLayout(pnl12Layout);
        pnl12Layout.setHorizontalGroup(
            pnl12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl12Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel19)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl12Layout.setVerticalGroup(
            pnl12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl13MouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel20.setText("13");

        javax.swing.GroupLayout pnl13Layout = new javax.swing.GroupLayout(pnl13);
        pnl13.setLayout(pnl13Layout);
        pnl13Layout.setHorizontalGroup(
            pnl13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl13Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel20)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl13Layout.setVerticalGroup(
            pnl13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl14MouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel21.setText("14");

        javax.swing.GroupLayout pnl14Layout = new javax.swing.GroupLayout(pnl14);
        pnl14.setLayout(pnl14Layout);
        pnl14Layout.setHorizontalGroup(
            pnl14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl14Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel21)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl14Layout.setVerticalGroup(
            pnl14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl15MouseClicked(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel22.setText("15");

        javax.swing.GroupLayout pnl15Layout = new javax.swing.GroupLayout(pnl15);
        pnl15.setLayout(pnl15Layout);
        pnl15Layout.setHorizontalGroup(
            pnl15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl15Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel22)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl15Layout.setVerticalGroup(
            pnl15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl16MouseClicked(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel23.setText("16");

        javax.swing.GroupLayout pnl16Layout = new javax.swing.GroupLayout(pnl16);
        pnl16.setLayout(pnl16Layout);
        pnl16Layout.setHorizontalGroup(
            pnl16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl16Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel23)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl16Layout.setVerticalGroup(
            pnl16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl17MouseClicked(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel24.setText("17");

        javax.swing.GroupLayout pnl17Layout = new javax.swing.GroupLayout(pnl17);
        pnl17.setLayout(pnl17Layout);
        pnl17Layout.setHorizontalGroup(
            pnl17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl17Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel24)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl17Layout.setVerticalGroup(
            pnl17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl18MouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel25.setText("18");

        javax.swing.GroupLayout pnl18Layout = new javax.swing.GroupLayout(pnl18);
        pnl18.setLayout(pnl18Layout);
        pnl18Layout.setHorizontalGroup(
            pnl18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl18Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel25)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl18Layout.setVerticalGroup(
            pnl18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl19MouseClicked(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel26.setText("19");

        javax.swing.GroupLayout pnl19Layout = new javax.swing.GroupLayout(pnl19);
        pnl19.setLayout(pnl19Layout);
        pnl19Layout.setHorizontalGroup(
            pnl19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl19Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel26)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl19Layout.setVerticalGroup(
            pnl19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl20MouseClicked(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel27.setText("20");

        javax.swing.GroupLayout pnl20Layout = new javax.swing.GroupLayout(pnl20);
        pnl20.setLayout(pnl20Layout);
        pnl20Layout.setHorizontalGroup(
            pnl20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl20Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel27)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl20Layout.setVerticalGroup(
            pnl20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl21MouseClicked(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel28.setText("21");

        javax.swing.GroupLayout pnl21Layout = new javax.swing.GroupLayout(pnl21);
        pnl21.setLayout(pnl21Layout);
        pnl21Layout.setHorizontalGroup(
            pnl21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl21Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel28)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl21Layout.setVerticalGroup(
            pnl21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl22MouseClicked(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel29.setText("22");

        javax.swing.GroupLayout pnl22Layout = new javax.swing.GroupLayout(pnl22);
        pnl22.setLayout(pnl22Layout);
        pnl22Layout.setHorizontalGroup(
            pnl22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl22Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel29)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl22Layout.setVerticalGroup(
            pnl22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl23MouseClicked(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel30.setText("23");

        javax.swing.GroupLayout pnl23Layout = new javax.swing.GroupLayout(pnl23);
        pnl23.setLayout(pnl23Layout);
        pnl23Layout.setHorizontalGroup(
            pnl23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl23Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel30)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl23Layout.setVerticalGroup(
            pnl23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl24MouseClicked(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel31.setText("24");

        javax.swing.GroupLayout pnl24Layout = new javax.swing.GroupLayout(pnl24);
        pnl24.setLayout(pnl24Layout);
        pnl24Layout.setHorizontalGroup(
            pnl24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl24Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel31)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl24Layout.setVerticalGroup(
            pnl24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl25MouseClicked(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel32.setText("25");

        javax.swing.GroupLayout pnl25Layout = new javax.swing.GroupLayout(pnl25);
        pnl25.setLayout(pnl25Layout);
        pnl25Layout.setHorizontalGroup(
            pnl25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl25Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel32)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl25Layout.setVerticalGroup(
            pnl25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl26MouseClicked(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel33.setText("26");

        javax.swing.GroupLayout pnl26Layout = new javax.swing.GroupLayout(pnl26);
        pnl26.setLayout(pnl26Layout);
        pnl26Layout.setHorizontalGroup(
            pnl26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl26Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel33)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl26Layout.setVerticalGroup(
            pnl26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl27MouseClicked(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel34.setText("27");

        javax.swing.GroupLayout pnl27Layout = new javax.swing.GroupLayout(pnl27);
        pnl27.setLayout(pnl27Layout);
        pnl27Layout.setHorizontalGroup(
            pnl27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl27Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel34)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl27Layout.setVerticalGroup(
            pnl27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl28MouseClicked(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel35.setText("28");

        javax.swing.GroupLayout pnl28Layout = new javax.swing.GroupLayout(pnl28);
        pnl28.setLayout(pnl28Layout);
        pnl28Layout.setHorizontalGroup(
            pnl28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl28Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel35)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl28Layout.setVerticalGroup(
            pnl28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl29MouseClicked(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel36.setText("29");

        javax.swing.GroupLayout pnl29Layout = new javax.swing.GroupLayout(pnl29);
        pnl29.setLayout(pnl29Layout);
        pnl29Layout.setHorizontalGroup(
            pnl29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl29Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel36)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl29Layout.setVerticalGroup(
            pnl29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl30MouseClicked(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel37.setText("30");

        javax.swing.GroupLayout pnl30Layout = new javax.swing.GroupLayout(pnl30);
        pnl30.setLayout(pnl30Layout);
        pnl30Layout.setHorizontalGroup(
            pnl30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl30Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel37)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl30Layout.setVerticalGroup(
            pnl30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl31MouseClicked(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel38.setText("31");

        javax.swing.GroupLayout pnl31Layout = new javax.swing.GroupLayout(pnl31);
        pnl31.setLayout(pnl31Layout);
        pnl31Layout.setHorizontalGroup(
            pnl31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl31Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel38)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl31Layout.setVerticalGroup(
            pnl31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl32MouseClicked(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel39.setText("32");

        javax.swing.GroupLayout pnl32Layout = new javax.swing.GroupLayout(pnl32);
        pnl32.setLayout(pnl32Layout);
        pnl32Layout.setHorizontalGroup(
            pnl32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl32Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel39)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl32Layout.setVerticalGroup(
            pnl32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl33MouseClicked(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel40.setText("33");

        javax.swing.GroupLayout pnl33Layout = new javax.swing.GroupLayout(pnl33);
        pnl33.setLayout(pnl33Layout);
        pnl33Layout.setHorizontalGroup(
            pnl33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl33Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel40)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl33Layout.setVerticalGroup(
            pnl33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl34MouseClicked(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel41.setText("34");

        javax.swing.GroupLayout pnl34Layout = new javax.swing.GroupLayout(pnl34);
        pnl34.setLayout(pnl34Layout);
        pnl34Layout.setHorizontalGroup(
            pnl34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl34Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel41)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl34Layout.setVerticalGroup(
            pnl34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl36MouseClicked(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel42.setText("36");

        javax.swing.GroupLayout pnl36Layout = new javax.swing.GroupLayout(pnl36);
        pnl36.setLayout(pnl36Layout);
        pnl36Layout.setHorizontalGroup(
            pnl36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl36Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel42)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl36Layout.setVerticalGroup(
            pnl36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl37MouseClicked(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel43.setText("37");

        javax.swing.GroupLayout pnl37Layout = new javax.swing.GroupLayout(pnl37);
        pnl37.setLayout(pnl37Layout);
        pnl37Layout.setHorizontalGroup(
            pnl37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl37Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel43)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl37Layout.setVerticalGroup(
            pnl37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl35MouseClicked(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel44.setText("35");

        javax.swing.GroupLayout pnl35Layout = new javax.swing.GroupLayout(pnl35);
        pnl35.setLayout(pnl35Layout);
        pnl35Layout.setHorizontalGroup(
            pnl35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl35Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel44)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl35Layout.setVerticalGroup(
            pnl35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pnl13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(pnl15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pnl33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnl35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pnl29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(pnl31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pnl25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(pnl27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pnl21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(pnl23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pnl17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(pnl19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pnl01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(pnl03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pnl09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(pnl11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pnl05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(pnl07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl08, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl07, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl06, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl05, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 293, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 204, 153));

        txtNoOfSeats.setEditable(false);
        txtNoOfSeats.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N
        txtNoOfSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoOfSeatsActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N
        jLabel45.setText("No of seats");

        jLabel46.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N
        jLabel46.setText("No of half");

        txtNoOfHalf.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N
        txtNoOfHalf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoOfHalfActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N
        jLabel47.setText("No of full");

        txtNoOfFull.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N
        txtNoOfFull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoOfFullActionPerformed(evt);
            }
        });

        btnBookSeats.setFont(new java.awt.Font("Liberation Sans", 1, 30)); // NOI18N
        btnBookSeats.setText("Book Seats");
        btnBookSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookSeatsActionPerformed(evt);
            }
        });

        txtTotalAmount.setEditable(false);
        txtTotalAmount.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N
        txtTotalAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalAmountActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N
        jLabel48.setText("Total Amount");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel47)
                                    .addGap(72, 72, 72))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(45, 45, 45)))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNoOfSeats, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                .addComponent(txtNoOfHalf)
                                .addComponent(txtNoOfFull))
                            .addGap(99, 99, 99))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(btnBookSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addGap(184, 184, 184))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(txtNoOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(txtNoOfHalf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(txtNoOfFull, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(btnBookSeats)
                .addGap(18, 18, 18)
                .addComponent(jLabel48)
                .addGap(14, 14, 14)
                .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 293, -1, -1));

        btnPay.setFont(new java.awt.Font("Liberation Sans", 1, 30)); // NOI18N
        btnPay.setText("Pay");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });
        getContentPane().add(btnPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 723, 252, 53));

        jPanel5.setBackground(new java.awt.Color(0, 0, 51));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Booking Seats");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(435, 435, 435)
                .addComponent(jLabel1)
                .addContainerGap(457, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(802, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -7, 1140, 850));

        setSize(new java.awt.Dimension(1125, 868));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        
    }//GEN-LAST:event_txtDateActionPerformed

    private void pnl01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl01MouseClicked

       if(pnl01.getBackground().equals(new Color(242,242,242)))
       {
           pnl01.setBackground(new Color(82,176,232));
           count++;
           S1 = true;
       }
           
       else
       {
            pnl01.setBackground(new Color(242,242,242));
            count--;
            S1 = false;
       }
       txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl01MouseClicked

    private void pnl02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl02MouseClicked
       if(pnl02.getBackground().equals(new Color(242,242,242)))
       {
           pnl02.setBackground(new Color(82,176,232)); 
           count++;
           S2 = true;
       }
           
       else
       {
           pnl02.setBackground(new Color(242,242,242));
           count--;
           S2 = false;
       }
       txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl02MouseClicked

    private void pnl03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl03MouseClicked
         if(pnl03.getBackground().equals(new Color(242,242,242)))
         {
           pnl03.setBackground(new Color(82,176,232));
           count++;
           S3 = true;
         }
         
       else
         {
           pnl03.setBackground(new Color(242,242,242));
           count--;
           S3 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl03MouseClicked

    private void pnl04MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl04MouseClicked
        if(pnl04.getBackground().equals(new Color(242,242,242)))
         {
           pnl04.setBackground(new Color(82,176,232));
           count++;
           S4 = true;
         }
         
       else
         {
           pnl04.setBackground(new Color(242,242,242));
           count--;
           S4 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl04MouseClicked

    private void pnl05MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl05MouseClicked
       if(pnl05.getBackground().equals(new Color(242,242,242)))
         {
           pnl05.setBackground(new Color(82,176,232));
           count++;
           S5 = true;
         }
         
       else
         {
           pnl05.setBackground(new Color(242,242,242));
           count--;
           S5 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl05MouseClicked

    private void pnl06MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl06MouseClicked
        if(pnl06.getBackground().equals(new Color(242,242,242)))
         {
           pnl06.setBackground(new Color(82,176,232));
           count++;
           S6 = true;
         }
         
       else
         {
           pnl06.setBackground(new Color(242,242,242));
           count--;
           S6 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl06MouseClicked

    private void pnl07MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl07MouseClicked
      if(pnl07.getBackground().equals(new Color(242,242,242)))
         {
           pnl07.setBackground(new Color(82,176,232));
           count++;
            S7 = true;
         }
         
       else
         {
           pnl07.setBackground(new Color(242,242,242));
           count--;
           S7 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl07MouseClicked

    private void pnl08MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl08MouseClicked
        if(pnl08.getBackground().equals(new Color(242,242,242)))
         {
           pnl08.setBackground(new Color(82,176,232));
           count++;
           S8 = true;
         }
         
       else
         {
           pnl08.setBackground(new Color(242,242,242));
           count--;
           S8 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl08MouseClicked

    private void pnl09MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl09MouseClicked
        if(pnl09.getBackground().equals(new Color(242,242,242)))
         {
           pnl09.setBackground(new Color(82,176,232));
           count++;
           S9 = true;
         }
         
       else
         {
           pnl09.setBackground(new Color(242,242,242));
           count--;
           S9 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl09MouseClicked

    private void pnl10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl10MouseClicked
       if(pnl10.getBackground().equals(new Color(242,242,242)))
         {
           pnl10.setBackground(new Color(82,176,232));
           count++;
           S10 = true;
         }
         
       else
         {
           pnl10.setBackground(new Color(242,242,242));
           count--;
           S10 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl10MouseClicked

    private void pnl11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl11MouseClicked
        if(pnl11.getBackground().equals(new Color(242,242,242)))
         {
           pnl11.setBackground(new Color(82,176,232));
           count++;
           S11 = true;
         }
         
       else
         {
           pnl11.setBackground(new Color(242,242,242));
           count--;
           S11 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl11MouseClicked

    private void pnl12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl12MouseClicked
       if(pnl12.getBackground().equals(new Color(242,242,242)))
         {
           pnl12.setBackground(new Color(82,176,232));
           count++;
           S12 = true;
         }
         
       else
         {
           pnl12.setBackground(new Color(242,242,242));
           count--;
           S12 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl12MouseClicked

    private void pnl13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl13MouseClicked
       if(pnl13.getBackground().equals(new Color(242,242,242)))
         {
           pnl13.setBackground(new Color(82,176,232));
           count++;
           S13 = true;
         }
         
       else
         {
           pnl13.setBackground(new Color(242,242,242));
           count--;
           S13 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl13MouseClicked

    private void pnl14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl14MouseClicked
       if(pnl14.getBackground().equals(new Color(242,242,242)))
         {
           pnl14.setBackground(new Color(82,176,232));
           count++;
           S14 = true;
         }
         
       else
         {
           pnl14.setBackground(new Color(242,242,242));
           count--;
           S14 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl14MouseClicked

    private void pnl15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl15MouseClicked
       if(pnl15.getBackground().equals(new Color(242,242,242)))
         {
           pnl15.setBackground(new Color(82,176,232));
           count++;
           S15 = true;
         }
         
       else
         {
           pnl15.setBackground(new Color(242,242,242));
           count--;
           S15 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl15MouseClicked

    private void pnl16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl16MouseClicked
       if(pnl16.getBackground().equals(new Color(242,242,242)))
         {
           pnl16.setBackground(new Color(82,176,232));
           count++;
           S16 = true;
         }
         
       else
         {
           pnl16.setBackground(new Color(242,242,242));
           count--;
           S16 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl16MouseClicked

    private void pnl17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl17MouseClicked
        if(pnl17.getBackground().equals(new Color(242,242,242)))
         {
           pnl17.setBackground(new Color(82,176,232));
           count++;
           S17 = true;
         }
         
       else
         {
           pnl17.setBackground(new Color(242,242,242));
           count--;
           S17 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl17MouseClicked

    private void pnl18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl18MouseClicked
       if(pnl18.getBackground().equals(new Color(242,242,242)))
         {
           pnl18.setBackground(new Color(82,176,232));
           count++;
           S18 = true;
         }
         
       else
         {
           pnl18.setBackground(new Color(242,242,242));
           count--;
           S18 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl18MouseClicked

    private void pnl19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl19MouseClicked
        if(pnl19.getBackground().equals(new Color(242,242,242)))
         {
           pnl19.setBackground(new Color(82,176,232));
           count++;
           S19 = true;
         }
         
       else
         {
           pnl19.setBackground(new Color(242,242,242));
           count--;
           S19 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl19MouseClicked

    private void pnl20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl20MouseClicked
        if(pnl20.getBackground().equals(new Color(242,242,242)))
         {
           pnl20.setBackground(new Color(82,176,232));
           count++;
           S20 = true;
         }
         
       else
         {
           pnl20.setBackground(new Color(242,242,242));
           count--;
           S20 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl20MouseClicked

    private void pnl21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl21MouseClicked
        if(pnl21.getBackground().equals(new Color(242,242,242)))
         {
           pnl21.setBackground(new Color(82,176,232));
           count++;
           S21 = true;
         }
         
       else
         {
           pnl21.setBackground(new Color(242,242,242));
           count--;
           S21 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl21MouseClicked

    private void pnl22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl22MouseClicked
        if(pnl22.getBackground().equals(new Color(242,242,242)))
         {
           pnl22.setBackground(new Color(82,176,232));
           count++;
           S22 = true;
         }
         
       else
         {
           pnl22.setBackground(new Color(242,242,242));
           count--;
           S22 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl22MouseClicked

    private void pnl23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl23MouseClicked
       if(pnl23.getBackground().equals(new Color(242,242,242)))
         {
           pnl23.setBackground(new Color(82,176,232));
           count++;
           S23 = true;
         }
         
       else
         {
           pnl23.setBackground(new Color(242,242,242));
           count--;
           S23 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl23MouseClicked

    private void pnl24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl24MouseClicked
      if(pnl24.getBackground().equals(new Color(242,242,242)))
         {
           pnl24.setBackground(new Color(82,176,232));
           count++;
           S24 = true;
         }
         
       else
         {
           pnl24.setBackground(new Color(242,242,242));
           count--;
           S24 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl24MouseClicked

    private void pnl25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl25MouseClicked
       if(pnl25.getBackground().equals(new Color(242,242,242)))
         {
           pnl25.setBackground(new Color(82,176,232));
           count++;
           S25 = true;
         }
         
       else
         {
           pnl25.setBackground(new Color(242,242,242));
           count--;
           S25 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl25MouseClicked

    private void pnl26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl26MouseClicked
       if(pnl26.getBackground().equals(new Color(242,242,242)))
         {
           pnl26.setBackground(new Color(82,176,232));
           count++;
           S26 = true;
         }
         
       else
         {
           pnl26.setBackground(new Color(242,242,242));
           count--;
           S26 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl26MouseClicked

    private void pnl27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl27MouseClicked
        if(pnl27.getBackground().equals(new Color(242,242,242)))
         {
           pnl27.setBackground(new Color(82,176,232));
           count++;
           S27 = true;
         }
         
       else
         {
           pnl27.setBackground(new Color(242,242,242));
           count--;
           S27 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl27MouseClicked

    private void pnl28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl28MouseClicked
        if(pnl28.getBackground().equals(new Color(242,242,242)))
         {
           pnl28.setBackground(new Color(82,176,232));
           count++;
           S28 = true;
         }
         
       else
         {
           pnl28.setBackground(new Color(242,242,242));
           count--;
           S28 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl28MouseClicked

    private void pnl29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl29MouseClicked
       if(pnl29.getBackground().equals(new Color(242,242,242)))
         {
           pnl29.setBackground(new Color(82,176,232));
           count++;
           S29 = true;
         }
         
       else
         {
           pnl29.setBackground(new Color(242,242,242));
           count--;
           S29 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl29MouseClicked

    private void pnl30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl30MouseClicked
        if(pnl30.getBackground().equals(new Color(242,242,242)))
         {
           pnl30.setBackground(new Color(82,176,232));
           count++;
           S30 = true;
         }
         
       else
         {
           pnl30.setBackground(new Color(242,242,242));
           count--;
           S30 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl30MouseClicked

    private void pnl31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl31MouseClicked
         if(pnl31.getBackground().equals(new Color(242,242,242)))
         {
           pnl31.setBackground(new Color(82,176,232));
           count++;
           S31 = true;
         }
         
       else
         {
           pnl31.setBackground(new Color(242,242,242));
           count--;
           S31 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl31MouseClicked

    private void pnl32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl32MouseClicked
         if(pnl32.getBackground().equals(new Color(242,242,242)))
         {
           pnl32.setBackground(new Color(82,176,232));
           count++;
           S32 = true;
         }
         
       else
         {
           pnl32.setBackground(new Color(242,242,242));
           count--;
           S32 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl32MouseClicked

    private void pnl33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl33MouseClicked
         if(pnl33.getBackground().equals(new Color(242,242,242)))
         {
           pnl33.setBackground(new Color(82,176,232));
           count++;
           S33 = true;
         }
         
       else
         {
           pnl33.setBackground(new Color(242,242,242));
           count--;
           S33 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl33MouseClicked

    private void pnl34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl34MouseClicked
         if(pnl34.getBackground().equals(new Color(242,242,242)))
         {
           pnl34.setBackground(new Color(82,176,232));
           count++;
           S34 = true;
         }
         
       else
         {
           pnl34.setBackground(new Color(242,242,242));
           count--;
           S34 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl34MouseClicked

    private void pnl35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl35MouseClicked
        if(pnl35.getBackground().equals(new Color(242,242,242)))
         {
           pnl35.setBackground(new Color(82,176,232));
           count++;
           S35 = true;
         }
         
       else
         {
           pnl35.setBackground(new Color(242,242,242));
           count--;
           S35 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl35MouseClicked

    private void pnl36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl36MouseClicked
         if(pnl36.getBackground().equals(new Color(242,242,242)))
         {
           pnl36.setBackground(new Color(82,176,232));
           count++;
           S36 = true;
         }
         
       else
         {
           pnl36.setBackground(new Color(242,242,242));
           count--;
           S36 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl36MouseClicked

    private void pnl37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl37MouseClicked
         if(pnl37.getBackground().equals(new Color(242,242,242)))
         {
           pnl37.setBackground(new Color(82,176,232));
           count++;
           S37 = true;
         }
         
       else
         {
           pnl37.setBackground(new Color(242,242,242));
           count--;
           S37 = false;
         }
         
         txtNoOfSeats.setText(Integer.toString(count));
    }//GEN-LAST:event_pnl37MouseClicked

    private void txtNoOfSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoOfSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoOfSeatsActionPerformed

    private void txtNoOfHalfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoOfHalfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoOfHalfActionPerformed

    private void txtNoOfFullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoOfFullActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoOfFullActionPerformed

    private void txtTotalAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalAmountActionPerformed

    private void btnBookSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookSeatsActionPerformed
      
        
       int noOfHalf,noOfFull,noOfSeats,totalAmount;
       noOfSeats = Integer.parseInt(txtNoOfSeats.getText());
       noOfHalf = Integer.parseInt(txtNoOfHalf.getText());
       noOfFull = Integer.parseInt(txtNoOfFull.getText());
       
       if(noOfSeats == 0)
             JOptionPane.showMessageDialog(this,"You haven't selected any seat","Alert",JOptionPane.WARNING_MESSAGE); 
       else
       {
            if(noOfSeats == (noOfFull + noOfHalf))
            {
                 totalAmount = noOfFull*fullCharge + noOfHalf*halfCharge;
                 txtTotalAmount.setText("Rs  : " + Integer.toString(totalAmount));
            }
            else
            {
                Component f = null;
                JOptionPane.showMessageDialog(f,"Values are not matching","Alert",JOptionPane.WARNING_MESSAGE);  
                txtTotalAmount.setText(" ");
            }
       }
       
      
       
    }//GEN-LAST:event_btnBookSeatsActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       try
        {
            this.stmt = con.createStatement();
            String query = "select * from Passenger";
            
            String NIC = txtNIC.getText();
            
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                if(NIC.equals(rs.getString(1)))
                {
                    txtPassengerName.setText(rs.getString(2));
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        if(txtPassengerName.getText().isEmpty())
            JOptionPane.showMessageDialog(this,"Please enter passenger details","Alert",JOptionPane.WARNING_MESSAGE);
        if(txtTotalAmount.getText().isEmpty())
             JOptionPane.showMessageDialog(this,"Please fill amount details","Alert",JOptionPane.WARNING_MESSAGE);
        else
        {
             
        try
        {
            this.stmt = con.createStatement();
            String query;
            query = "select ID from Booked_Vehicle where Vehicle_ID = "+vehicleId+" and date='"+date+"'";
            ResultSet rs = stmt.executeQuery(query);
            
           
           if(rs.next())
            {
                int bookedId = rs.getInt(1);
                
                if(pnl01.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S1 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl02.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S2 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl03.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S3 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl04.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S4 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl05.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S5 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl06.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S6 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl07.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S7 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                if(pnl08.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S8 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl09.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S9 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl10.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S10 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl11.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S11 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl12.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S12 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl13.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S13 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl14.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S14 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl15.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S15 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl16.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S16 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl17.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S17 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl18.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S18 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl19.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S19 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl20.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S20 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl21.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S21 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl22.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S22 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl23.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S23 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl24.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S24 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl25.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S25 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl26.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S26 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl27.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S27 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl28.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S28 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl29.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S29 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl30.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S30 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl31.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S31 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl32.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S32 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl33.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S33 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl34.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S34 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl35.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S35 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl36.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S36 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                if(pnl37.getBackground().equals(new Color(82,176,232)))
                {
                    query = "update Booked_Vehicle set S37 = ? where ID = ?";
                    java.sql.PreparedStatement st = con.prepareStatement(query);
                    st.setBoolean(1, true);
                    st.setInt(2, bookedId);
                    int count = st.executeUpdate();
                }
                
                
            }
            else
            {
                int vehicleId = Integer.parseInt( txtVehicleNo.getText());
                //query = "insert into Booked_Vehicle (Vehicle_ID, S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, S13, S14, S15, S16, S17, S18, S19, S20, S21, S22, S23, S24, S25, S26, S27, S28, S29, S30, S31, S32, S33, S34, S35, S36, S37, date) values("+ vehicleId + S1 +","+ S2 +","+ S3 +","+ S4 +","+ S5 +","+ S6 +","+ S7 +","+ S8 +","+ S9 +","+ S10 +","+ S11 +","+ S12 +","+ S13 +","+ S14 +","+ S15 +","+ S16 +","+ S17 +","+ S18 +","+ S19 +","+ S20 +","+ S21 +","+ S22 +","+ S23 +","+ S23 +","+ S24 +","+ S25 +","+ S26 +","+ S27 +","+ S28 +","+ S29 +","+ S30 +","+ S31 +","+ S32 +","+ S33 +","+ S34 +","+ S35 +","+ S36 +"," + S37 +"'"+ date +"')";
                query = "insert into Booked_Vehicle (Vehicle_ID, S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, S13, S14, S15, S16, S17, S18, S19, S20, S21, S22, S23, S24, S25, S26, S27, S28, S29, S30, S31, S32, S33, S34, S35, S36, S37, date) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                java.sql.PreparedStatement st = con.prepareStatement(query);
                
                st.setInt(1, vehicleId);
                st.setBoolean(2, S1);
                st.setBoolean(3, S2);
                st.setBoolean(4, S3);
                st.setBoolean(5, S4);
                st.setBoolean(6, S5);
                st.setBoolean(7, S6);
                st.setBoolean(8, S7);
                st.setBoolean(9, S8);
                st.setBoolean(10, S9);
                st.setBoolean(11, S10);
                st.setBoolean(12, S11);
                st.setBoolean(13, S12);
                st.setBoolean(14, S13);
                st.setBoolean(15, S14);
                st.setBoolean(16, S15);
                st.setBoolean(17, S16);
                st.setBoolean(18, S17);
                st.setBoolean(19, S18);
                st.setBoolean(20, S19);
                st.setBoolean(21, S20);
                st.setBoolean(22, S21);
                st.setBoolean(23, S22);
                st.setBoolean(24, S23);
                st.setBoolean(25, S24);
                st.setBoolean(26, S25);
                st.setBoolean(27, S26);
                st.setBoolean(28, S27);
                st.setBoolean(29, S28);
                st.setBoolean(30, S29);
                st.setBoolean(31, S30);
                st.setBoolean(32, S31);
                st.setBoolean(33, S32);
                st.setBoolean(34, S33);
                st.setBoolean(35, S34);
                st.setBoolean(36, S35);
                st.setBoolean(37, S36);
                st.setBoolean(38, S37);
                st.setString(39, date);
                
                int count = st.executeUpdate();
                System.out.println("Done"+ count);
            }
            
            
            /*String query = "insert into Ticket(Passesnger_ID, Seats, noOfHalf, noOfFull, date) values(?,?,?,?,?)";
            String passenger_ID, seats, date;
            passenger_ID = txtNIC.getText();
            seats
            java.sql.PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, WIDTH);
            int count = st.executeUpdate(query);
            */
            query = "insert into Ticket(Passenger_ID,Seats,noOfHalf,noOfFull,payment,date) values(?,?,?,?,?,?)"; 
            java.sql.PreparedStatement st = con.prepareStatement(query);
            String passengerId,seats="",noOfHalf,noOfFull,payment; 
            passengerId = txtNIC.getText();
            st.setString(1, passengerId);
            if(S1)
                seats = seats + "1 ";
            if(S2)
                seats = seats + "2 ";
            if(S3)
                seats = seats + "3 ";
            if(S4)
                seats = seats + "4 ";
            if(S5)
                seats = seats + "5 ";
            if(S6)
                seats = seats + "6 ";
            if(S7)
                seats = seats + "7 ";
            if(S8)
                seats = seats + "8 ";
            if(S9)
                seats = seats + "9 ";
            if(S10)
                seats = seats + "10 ";
            if(S11)
                seats = seats + "11 ";
            if(S12)
                seats = seats + "12 ";
            if(S13)
                seats = seats + "13 ";
            if(S14)
                seats = seats + "14 ";
            if(S15)
                seats = seats + "15 ";
            if(S16)
                seats = seats + "16 ";
            if(S17)
                seats = seats + "17 ";
            if(S18)
                seats = seats + "18 ";
            if(S19)
                seats = seats + "19 ";
            if(S20)
                seats = seats + "20 ";
            if(S21)
                seats = seats + "21 ";
            if(S22)
                seats = seats + "22 ";
            if(S23)
                seats = seats + "23 ";
            if(S24)
                seats = seats + "24 ";
            if(S25)
                seats = seats + "25 ";
            if(S26)
                seats = seats + "26 ";
            if(S27)
                seats = seats + "27 ";
            if(S28)
                seats = seats + "28 ";
            if(S29)
                seats = seats + "29 ";
            if(S30)
                seats = seats + "30 ";
            if(S31)
                seats = seats + "31 ";
            if(S32)
                seats = seats + "32 ";
            if(S33)
                seats = seats + "33 ";
            if(S34)
                seats = seats + "34 ";
            if(S35)
                seats = seats + "35 ";
            if(S36)
                seats = seats + "36 ";
            if(S37)
                seats = seats + "137 ";
            
            noOfHalf = txtNoOfHalf.getText();
            noOfFull = txtNoOfFull.getText();
            payment = txtTotalAmount.getText();
            st.setString(2, seats);
            st.setString(3, noOfHalf);
            st.setString(4, noOfFull);
            st.setString(5, payment);
            st.setString(6, date);
            
            int count = st.executeUpdate();
            System.out.println("Done "+ count);
            
            query = "select ID from Ticket order by ID desc limit 1";
            rs = stmt.executeQuery(query);
            rs.next();
            
            CreatePayment newPayment = new CreatePayment(rs.getInt(1),payment);
            newPayment.setVisible(true);
            
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
      
        
      
        }
       
    }//GEN-LAST:event_btnPayActionPerformed

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
            java.util.logging.Logger.getLogger(BookingSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingSeats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingSeats(vehicleId, date).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookSeats;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel pnl01;
    private javax.swing.JPanel pnl02;
    private javax.swing.JPanel pnl03;
    private javax.swing.JPanel pnl04;
    private javax.swing.JPanel pnl05;
    private javax.swing.JPanel pnl06;
    private javax.swing.JPanel pnl07;
    private javax.swing.JPanel pnl08;
    private javax.swing.JPanel pnl09;
    private javax.swing.JPanel pnl10;
    private javax.swing.JPanel pnl11;
    private javax.swing.JPanel pnl12;
    private javax.swing.JPanel pnl13;
    private javax.swing.JPanel pnl14;
    private javax.swing.JPanel pnl15;
    private javax.swing.JPanel pnl16;
    private javax.swing.JPanel pnl17;
    private javax.swing.JPanel pnl18;
    private javax.swing.JPanel pnl19;
    private javax.swing.JPanel pnl20;
    private javax.swing.JPanel pnl21;
    private javax.swing.JPanel pnl22;
    private javax.swing.JPanel pnl23;
    private javax.swing.JPanel pnl24;
    private javax.swing.JPanel pnl25;
    private javax.swing.JPanel pnl26;
    private javax.swing.JPanel pnl27;
    private javax.swing.JPanel pnl28;
    private javax.swing.JPanel pnl29;
    private javax.swing.JPanel pnl30;
    private javax.swing.JPanel pnl31;
    private javax.swing.JPanel pnl32;
    private javax.swing.JPanel pnl33;
    private javax.swing.JPanel pnl34;
    private javax.swing.JPanel pnl35;
    private javax.swing.JPanel pnl36;
    private javax.swing.JPanel pnl37;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JTextField txtNIC;
    private javax.swing.JTextField txtNoOfFull;
    private javax.swing.JTextField txtNoOfHalf;
    private javax.swing.JTextField txtNoOfSeats;
    private javax.swing.JTextField txtPassengerName;
    private javax.swing.JTextField txtTo;
    private javax.swing.JTextField txtTotalAmount;
    private javax.swing.JTextField txtVehicleNo;
    // End of variables declaration//GEN-END:variables

    private String String(int count) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
