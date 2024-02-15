package Staff;

import com.mysql.cj.exceptions.DataTruncationException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.io.FileNotFoundException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Amila
 */
public class Staff extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs1 = null;
    String path1;
    String path2 = null; //Create a string path2 to get the path of the image from the JLabel
    
    public Staff() {
        initComponents();
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        conn = DatabaseConnection.connect();
    }
    
    public void staffDetailsShow(){
        try {
            String sql = "select * from staff where Staff_ID = ?";
            pst = conn.prepareStatement(sql);
            String id = search.getText();
            pst.setString(1, id);
            rs1 = pst.executeQuery();
            if(rs1.next()==false)
            {
                staffidtxt.setText("");
                firstnametxt.setText("");
                lastnametxt.setText("");
                designationtxt.setText("");
                salarytxt.setText("");
                doj.setDate(null);
                dob.setDate(null);
                addresstxt.setText("");
                String COUNTRY = null;
                countrytxt.setText("");
                countrycb.setSelectedItem(COUNTRY);
                mobilenotxt.setText("");
                String GENDER = null;
                gendertxt.setText("");
                gendercb.setSelectedItem(GENDER);
                emailtxt.setText("");
                qualificationtxt.setText("");
                homephonetxt.setText("");
                String BLOODGROUP = null;
                bloodgrouptxt.setText("");
                bloodgroupcb.setSelectedItem(BLOODGROUP);
                picture.setIcon(null); 
                path1 = "";
                path2 = "";
            }
            else{
                staffidtxt.setText(rs1.getString("Staff_ID"));
                firstnametxt.setText(rs1.getString("First_Name"));
                lastnametxt.setText(rs1.getString("Last_Name"));
                designationtxt.setText(rs1.getString("Designation"));
                salarytxt.setText(String.valueOf(rs1.getInt("Salary")));
                doj.setDate(rs1.getDate("Date_of_Join"));
                dob.setDate(rs1.getDate("Date_of_Birth"));
                addresstxt.setText(rs1.getString("Address1"));
                countrytxt.setText(rs1.getString("Country"));
                countrycb.setSelectedItem(rs1.getString("Country"));
                mobilenotxt.setText(rs1.getString("Mobile_No"));
                gendertxt.setText(rs1.getString("Gender"));
                gendercb.setSelectedItem(rs1.getString("Gender"));
                emailtxt.setText(rs1.getString("Email_ID"));
                qualificationtxt.setText(rs1.getString("Qualification"));
                homephonetxt.setText(rs1.getString("Home_Phone"));
                bloodgrouptxt.setText(rs1.getString("Blood_Group"));
                bloodgroupcb.setSelectedItem(rs1.getString("Blood_Group"));
                Blob image = rs1.getBlob("Profile_Pic");
                String destinationPath = System.getProperty("user.home") + "/Downloads"; // Retrieve the user's home directory dynamically
                String fileName = "downloaded_photo.jpg"; // Replace this with the desired file name

                String path = destinationPath + "/" + fileName;

                // Rest of the code to download the photo to the filePath
                //String path = "D:\\img.jpg";
                byte [] bytea = image.getBytes(1,(int)image.length());
                FileOutputStream fos = new FileOutputStream(path);
                fos.write(bytea);
                ImageIcon icon = new ImageIcon(bytea);
                Image im = icon.getImage();
                Image myimg = im.getScaledInstance(picture.getWidth(), picture.getHeight(),Image.SCALE_SMOOTH );
                ImageIcon newImage = new ImageIcon(myimg);
                picture.setIcon(newImage);
                path1 = path;
                path2 = path;
            }
        } catch (Exception e) {
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        staffidtxt = new javax.swing.JTextField();
        firstnametxt = new javax.swing.JTextField();
        lastnametxt = new javax.swing.JTextField();
        designationtxt = new javax.swing.JTextField();
        salarytxt = new javax.swing.JTextField();
        doj = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        picture = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        addresstxt = new javax.swing.JTextField();
        countrytxt = new javax.swing.JTextField();
        mobilenotxt = new javax.swing.JTextField();
        emailtxt = new javax.swing.JTextField();
        qualificationtxt = new javax.swing.JTextField();
        homephonetxt = new javax.swing.JTextField();
        bloodgrouptxt = new javax.swing.JTextField();
        dob = new com.toedter.calendar.JDateChooser();
        gendertxt = new javax.swing.JTextField();
        gendercb = new javax.swing.JComboBox<>();
        bloodgroupcb = new javax.swing.JComboBox<>();
        countrycb = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STAFF RECORD");

        jPanel2.setBackground(new java.awt.Color(51, 255, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Staff ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("First Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Last Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Designation");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Salary");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Date of Join");

        staffidtxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        staffidtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffidtxtActionPerformed(evt);
            }
        });

        firstnametxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnametxtActionPerformed(evt);
            }
        });

        lastnametxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lastnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnametxtActionPerformed(evt);
            }
        });

        designationtxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        designationtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                designationtxtActionPerformed(evt);
            }
        });

        salarytxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        salarytxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarytxtActionPerformed(evt);
            }
        });

        doj.setDateFormatString("yyyy-MM-dd");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Select Image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        picture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        picture.setOpaque(true);
        picture.setPreferredSize(new java.awt.Dimension(128, 128));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staffidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(designationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(firstnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salarytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doj, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(picture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(staffidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(firstnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel4)
                                .addGap(4, 4, 4)
                                .addComponent(lastnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(designationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(salarytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(doj, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(51, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Personal Information", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Date of Birth");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Address");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Country");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Mobile No");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Email");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Qualification");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Gender");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Landline");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Blood Group");

        addresstxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addresstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresstxtActionPerformed(evt);
            }
        });

        countrytxt.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        countrytxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countrytxtActionPerformed(evt);
            }
        });

        mobilenotxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mobilenotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobilenotxtActionPerformed(evt);
            }
        });

        emailtxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtxtActionPerformed(evt);
            }
        });

        qualificationtxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        qualificationtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qualificationtxtActionPerformed(evt);
            }
        });

        homephonetxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        homephonetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homephonetxtActionPerformed(evt);
            }
        });

        bloodgrouptxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bloodgrouptxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodgrouptxtActionPerformed(evt);
            }
        });

        dob.setDateFormatString("yyyy-MM-dd");

        gendertxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gendertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gendertxtActionPerformed(evt);
            }
        });

        gendercb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));
        gendercb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gendercbActionPerformed(evt);
            }
        });

        bloodgroupcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-", " " }));
        bloodgroupcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodgroupcbActionPerformed(evt);
            }
        });

        countrycb.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        countrycb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia", "Cameroon", "Canada", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo, Democratic Republic of the", "Congo, Republic of the", "Costa Rica", "Cote d'Ivoire", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor (Timor-Leste)", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, North", "Korea, South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar (Burma)", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Macedonia (formerly Macedonia)", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe", " " }));
        countrycb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countrycbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addresstxt)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(countrycb, 0, 92, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(countrytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(homephonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(bloodgroupcb, 0, 1, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bloodgrouptxt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mobilenotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(gendercb, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(gendertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(qualificationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dob, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel12)
                        .addComponent(jLabel14)
                        .addComponent(mobilenotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(qualificationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homephonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gendertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gendercb, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel17)
                    .addComponent(countrytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloodgrouptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloodgroupcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countrycb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanel4.setBackground(new java.awt.Color(51, 255, 204));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Search ID");

        search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("View");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("Save");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(342, 342, 342))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void staffidtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffidtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffidtxtActionPerformed

    private void firstnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnametxtActionPerformed

    private void lastnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnametxtActionPerformed

    private void designationtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_designationtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_designationtxtActionPerformed

    private void salarytxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarytxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salarytxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        path1 = f.getAbsolutePath();
        try {
            BufferedImage bi = ImageIO.read(new File(path1));
            Image img = bi.getScaledInstance(picture.getWidth(), picture.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            picture.setIcon(icon);
            path2 = path1;
        } catch (IOException ex) {
            Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addresstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresstxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addresstxtActionPerformed

    private void countrytxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countrytxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countrytxtActionPerformed

    private void mobilenotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobilenotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobilenotxtActionPerformed

    private void emailtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtxtActionPerformed

    private void qualificationtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qualificationtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qualificationtxtActionPerformed

    private void homephonetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homephonetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homephonetxtActionPerformed

    private void bloodgrouptxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodgrouptxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodgrouptxtActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String Staffid = staffidtxt.getText();
        String Firstname = firstnametxt.getText();
        String Lastname = lastnametxt.getText();
        String Designation = designationtxt.getText();
        String Salary = salarytxt.getText();
        String Address = addresstxt.getText();
        String Country = countrytxt.getText();
        String Mobileno = mobilenotxt.getText();
        String Gender = gendertxt.getText();
        String Email = emailtxt.getText();
        String Qualification = qualificationtxt.getText();
        String Homephone = homephonetxt.getText();
        String Bloodgroup = bloodgrouptxt.getText();
        
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        
        if(staffidtxt.getText().equals("")||firstnametxt.getText().equals("")||lastnametxt.getText().equals("")||designationtxt.getText().equals("")||salarytxt.getText().equals("")||addresstxt.getText().equals("")||countrytxt.getText().equals("")||mobilenotxt.getText().equals("")||gendertxt.getText().equals("")||emailtxt.getText().equals("")||qualificationtxt.getText().equals("")||homephonetxt.getText().equals("")||bloodgrouptxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "All fields must be filled");
        }else if(!mobilenotxt.getText().matches("^[0-9]*$")||mobilenotxt.getText().length()!=10){    
            JOptionPane.showMessageDialog(null, "Please enter a valid mobile no");
        }else if(!homephonetxt.getText().matches("^[0-9]*$")||homephonetxt.getText().length()!=10){    
            JOptionPane.showMessageDialog(null, "Please enter a valid mobile no");
        }else if (!pattern.matcher(emailtxt.getText()).matches()) {
            JOptionPane.showMessageDialog(null, "Please enter a valid email");
        }else{        
        
        try {
            String sql = "update staff set First_Name = ?,Last_Name = ?,Designation = ?,Salary = ?,Date_of_Join = ?,Profile_Pic = ?,Date_of_Birth = ?,Address1 = ?,Country = ?,Qualification = ?,Gender = ?,Mobile_No = ?,Home_Phone = ?,Email_ID = ?,Blood_Group = ? where Staff_ID = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, Firstname);
            pst.setString(2, Lastname);
            pst.setString(3, Designation);
            pst.setInt(4, Integer.parseInt(Salary));
            pst.setString(5,((JTextField)doj.getDateEditor().getUiComponent()).getText());
            pst.setString(7,((JTextField)dob.getDateEditor().getUiComponent()).getText());
            pst.setString(8, Address);
            pst.setString(9, Country);
            pst.setString(10, Qualification);
            pst.setString(11, Gender);
            pst.setString(12, Mobileno);
            pst.setString(13, Homephone);
            pst.setString(14, Email);
            pst.setString(15, Bloodgroup);
            pst.setString(16, Staffid);
            InputStream is = new FileInputStream(new File(path2));
            pst.setBlob(6,is);
            pst.execute();
            
            staffidtxt.setText("");
            firstnametxt.setText("");
            lastnametxt.setText("");
            designationtxt.setText("");
            salarytxt.setText("");
            doj.setDate(null);
            dob.setDate(null);
            addresstxt.setText("");
            countrytxt.setText("");
            mobilenotxt.setText("");
            gendertxt.setText("");
            emailtxt.setText("");
            qualificationtxt.setText("");
            homephonetxt.setText("");
            bloodgrouptxt.setText("");
            picture.setIcon(null);
            search.setText("");
            path1 = "";
            path2 ="";
            JOptionPane.showMessageDialog(null, "Updated Successfully");
            
      }catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "All fields must be filled");
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "All fields must be filled");
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input salary in numbers");
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "All fields must be filled");
        }catch(Exception e){
            System.err.println(e);
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         String Staffid = staffidtxt.getText();
        String Firstname = firstnametxt.getText();
        String Lastname = lastnametxt.getText();
        String Designation = designationtxt.getText();
        String Salary = salarytxt.getText();
        String Address = addresstxt.getText();
        String Country = countrytxt.getText();
        String Mobileno = mobilenotxt.getText();
        String Gender = gendertxt.getText();
        String Email = emailtxt.getText();
        String Qualification = qualificationtxt.getText();
        String Homephone = homephonetxt.getText();
        String Bloodgroup = bloodgrouptxt.getText();
        
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);

        
        if(staffidtxt.getText().equals("")||firstnametxt.getText().equals("")||lastnametxt.getText().equals("")||designationtxt.getText().equals("")||salarytxt.getText().equals("")||addresstxt.getText().equals("")||countrytxt.getText().equals("")||mobilenotxt.getText().equals("")||gendertxt.getText().equals("")||emailtxt.getText().equals("")||qualificationtxt.getText().equals("")||homephonetxt.getText().equals("")||bloodgrouptxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "All fields must be filled");
        }else if(!mobilenotxt.getText().matches("^[0-9]*$")||mobilenotxt.getText().length()!=10){    
            JOptionPane.showMessageDialog(null, "Please enter a valid mobile no");
        }else if(!homephonetxt.getText().matches("^[0-9]*$")||homephonetxt.getText().length()!=10){    
            JOptionPane.showMessageDialog(null, "Please enter a valid mobile no");
        }else if (!pattern.matcher(emailtxt.getText()).matches()) {
            JOptionPane.showMessageDialog(null, "Please enter a valid email");
        }else{
        try {
            String sql = "INSERT INTO staff(Staff_ID,First_Name,Last_Name,Designation,Salary,Date_of_Join,Profile_Pic,Date_of_Birth,Address1,Country,Qualification,Gender,Mobile_No,Home_Phone,Email_ID,Blood_Group) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, Staffid);
            pst.setString(2, Firstname);
            pst.setString(3, Lastname);
            pst.setString(4, Designation);
            pst.setInt(5, Integer.parseInt(Salary));
            pst.setString(6,((JTextField)doj.getDateEditor().getUiComponent()).getText());
            pst.setString(8,((JTextField)dob.getDateEditor().getUiComponent()).getText());
            pst.setString(9, Address);
            pst.setString(10, Country);
            pst.setString(11, Qualification);
            pst.setString(12, Gender);
            pst.setString(13, Mobileno);
            pst.setString(14, Homephone);
            pst.setString(15, Email);
            pst.setString(16, Bloodgroup);
            InputStream is = new FileInputStream(new File(path2));
            pst.setBlob(7,is);
            pst.execute();
            
            staffidtxt.setText("");
            firstnametxt.setText("");
            lastnametxt.setText("");
            designationtxt.setText("");
            salarytxt.setText("");
            doj.setDate(null);
            dob.setDate(null);
            addresstxt.setText("");
            countrytxt.setText("");
            mobilenotxt.setText("");
            gendertxt.setText("");
            emailtxt.setText("");
            qualificationtxt.setText("");
            homephonetxt.setText("");
            bloodgrouptxt.setText("");
            picture.setIcon(null);
            path1 = "";
            path2 = "";
            JOptionPane.showMessageDialog(null, "Data Inserted");
            //StaffListView slv1 = new StaffListView();
            
        }catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "All fields must be filled");
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "All fields must be filled or Staff ID is already taken");
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input salary in numbers");
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "All fields must be filled");
        }catch(Exception e){
            System.err.println(e);
        }
        
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        staffDetailsShow();
    }//GEN-LAST:event_searchKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        StaffDetails SD = new StaffDetails();
        SD.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String id = staffidtxt.getText();
        
        try {
            String sql = "delete from staff where Staff_ID = '"+id+"'";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deleted");
            
            staffidtxt.setText("");
            firstnametxt.setText("");
            lastnametxt.setText("");
            designationtxt.setText("");
            salarytxt.setText("");
            doj.setDate(null);
            dob.setDate(null);
            addresstxt.setText("");
            countrytxt.setText("");
            mobilenotxt.setText("");
            gendertxt.setText("");
            emailtxt.setText("");
            qualificationtxt.setText("");
            homephonetxt.setText("");
            bloodgrouptxt.setText("");
            picture.setIcon(null);
            search.setText("");
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void gendertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gendertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gendertxtActionPerformed

    private void gendercbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gendercbActionPerformed
        // TODO add your handling code here:
        String slectedValue = (String) gendercb.getSelectedItem();
        gendertxt.setText(slectedValue);
    }//GEN-LAST:event_gendercbActionPerformed

    private void bloodgroupcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodgroupcbActionPerformed
        // TODO add your handling code here:
        String slectedValue = (String) bloodgroupcb.getSelectedItem();
        bloodgrouptxt.setText(slectedValue);
    }//GEN-LAST:event_bloodgroupcbActionPerformed

    private void countrycbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countrycbActionPerformed
        // TODO add your handling code here:
        String slectedValue = (String) countrycb.getSelectedItem();
        countrytxt.setText(slectedValue);
    }//GEN-LAST:event_countrycbActionPerformed

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
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addresstxt;
    private javax.swing.JComboBox<String> bloodgroupcb;
    private javax.swing.JTextField bloodgrouptxt;
    private javax.swing.JComboBox<String> countrycb;
    private javax.swing.JTextField countrytxt;
    private javax.swing.JTextField designationtxt;
    private com.toedter.calendar.JDateChooser dob;
    private com.toedter.calendar.JDateChooser doj;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JTextField firstnametxt;
    private javax.swing.JComboBox<String> gendercb;
    private javax.swing.JTextField gendertxt;
    private javax.swing.JTextField homephonetxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField lastnametxt;
    private javax.swing.JTextField mobilenotxt;
    private javax.swing.JLabel picture;
    private javax.swing.JTextField qualificationtxt;
    private javax.swing.JTextField salarytxt;
    private javax.swing.JTextField search;
    private javax.swing.JTextField staffidtxt;
    // End of variables declaration//GEN-END:variables
}
