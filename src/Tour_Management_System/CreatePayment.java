/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tour_Management_System;

import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sachintha
 */
public class CreatePayment extends javax.swing.JFrame {

    /**
     * Creates new form PaymentOptions
     */
    private static int ticketNo;
    private static String payment;
    public CreatePayment(int ticketNo,String payment) {
        initComponents();
        this.ticketNo = ticketNo;
        this.payment = payment;
        txtAmount.setText(payment);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCvv = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCardNumber = new javax.swing.JTextField();
        txtMonth = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        btnPay = new javax.swing.JButton();
        checkMasterCard = new javax.swing.JCheckBox();
        checkVisa = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create Payment");
        setBackground(new java.awt.Color(255, 204, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 30)); // NOI18N
        jLabel1.setText("Create Payment ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N
        jLabel2.setText("Payment Options");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 72, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tour_Management_System/visa.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, 73));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tour_Management_System/masterCard.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, 83));

        txtCvv.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N
        getContentPane().add(txtCvv, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 90, -1));

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N
        jLabel6.setText("Card number");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 187, -1, -1));

        txtCardNumber.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N
        getContentPane().add(txtCardNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 223, 420, -1));

        txtMonth.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N
        getContentPane().add(txtMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 90, -1));

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N
        jLabel7.setText("Expiration date");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N
        jLabel8.setText("CVV");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, -1));

        txtYear.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N
        getContentPane().add(txtYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 90, -1));

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N
        jLabel9.setText("Amount");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        txtAmount.setFont(new java.awt.Font("Liberation Sans", 1, 25)); // NOI18N
        getContentPane().add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 420, -1));

        btnPay.setFont(new java.awt.Font("Liberation Sans", 1, 30)); // NOI18N
        btnPay.setText("Pay");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });
        getContentPane().add(btnPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 150, 60));

        checkMasterCard.setFont(new java.awt.Font("Liberation Sans", 0, 25)); // NOI18N
        checkMasterCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMasterCardActionPerformed(evt);
            }
        });
        getContentPane().add(checkMasterCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        checkVisa.setFont(new java.awt.Font("Liberation Sans", 0, 25)); // NOI18N
        checkVisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkVisaActionPerformed(evt);
            }
        });
        getContentPane().add(checkVisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 630));

        setSize(new java.awt.Dimension(474, 640));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        if(checkVisa.isSelected() == false && checkMasterCard.isSelected() == false)
             JOptionPane.showMessageDialog(this, "Please select one payment method","Error", JOptionPane.ERROR_MESSAGE);
        else if(txtCardNumber.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Please fill card number","Error", JOptionPane.ERROR_MESSAGE);
        else if(txtMonth.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Please fill the month","Error", JOptionPane.ERROR_MESSAGE);
        else if(txtYear.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Please fill the year","Error", JOptionPane.ERROR_MESSAGE);
        else if(txtCvv.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Please fill the CVV","Error", JOptionPane.ERROR_MESSAGE);
        else if(txtAmount.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Please fill the amount","Error", JOptionPane.ERROR_MESSAGE);
        else
        {
            JOptionPane.showMessageDialog(this, "Pyment Successfull \n Your Ticket No : "+ticketNo,"Success", JOptionPane.INFORMATION_MESSAGE);
        }
         
        this.setVisible(false);
            

    }//GEN-LAST:event_btnPayActionPerformed

    private void checkVisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkVisaActionPerformed
       if(checkVisa.isSelected())
           checkMasterCard.setSelected(false);
    }//GEN-LAST:event_checkVisaActionPerformed

    private void checkMasterCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMasterCardActionPerformed
        if(checkMasterCard.isSelected())
            checkVisa.setSelected(false);
    }//GEN-LAST:event_checkMasterCardActionPerformed

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
            java.util.logging.Logger.getLogger(CreatePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreatePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreatePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreatePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreatePayment(ticketNo,payment).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPay;
    private javax.swing.JCheckBox checkMasterCard;
    private javax.swing.JCheckBox checkVisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtCardNumber;
    private javax.swing.JTextField txtCvv;
    private javax.swing.JTextField txtMonth;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
