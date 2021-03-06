/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebbillpayment;

import java.awt.Color;
import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Ragul
 */

public class Consumer extends javax.swing.JFrame {

    /**
     * Creates new form Consumer
     */
    private int ServiceNum;
    private String username;
    public Consumer() {
        initComponents();
    }
    public Consumer(int serviceNo, String uname) {
        initComponents();
        ServiceNum=serviceNo;
        username=uname;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Consumer = new javax.swing.JTabbedPane();
        viewConsDetails = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        month = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        reading = new javax.swing.JTextField();
        billAmount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        year = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        errmessage = new javax.swing.JLabel();
        PayBill = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PaymentDet = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        serviceNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        totalbill = new javax.swing.JTextField();
        payBill = new javax.swing.JButton();
        paymentMessage = new javax.swing.JLabel();
        ViewBill = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bills = new javax.swing.JTable();
        ChangePassword = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        oldPass = new javax.swing.JPasswordField();
        newPass = new javax.swing.JPasswordField();
        message = new javax.swing.JLabel();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Consumer.setBackground(new java.awt.Color(204, 204, 204));
        Consumer.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        viewConsDetails.setBackground(new java.awt.Color(255, 255, 255));
        viewConsDetails.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                viewConsDetailsComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Month:");

        month.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Reading:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Bill Amount:");

        reading.setEditable(false);
        reading.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        billAmount.setEditable(false);
        billAmount.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Year:");

        year.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        Search.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewConsDetailsLayout = new javax.swing.GroupLayout(viewConsDetails);
        viewConsDetails.setLayout(viewConsDetailsLayout);
        viewConsDetailsLayout.setHorizontalGroup(
            viewConsDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewConsDetailsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(errmessage, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(viewConsDetailsLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(viewConsDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewConsDetailsLayout.createSequentialGroup()
                        .addGroup(viewConsDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(viewConsDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(viewConsDetailsLayout.createSequentialGroup()
                                .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(reading, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(billAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(viewConsDetailsLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(Search)))
                .addContainerGap(333, Short.MAX_VALUE))
        );
        viewConsDetailsLayout.setVerticalGroup(
            viewConsDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewConsDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(errmessage)
                .addGap(49, 49, 49)
                .addGroup(viewConsDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(Search)
                .addGap(30, 30, 30)
                .addGroup(viewConsDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(reading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(viewConsDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(billAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        Consumer.addTab("View Consumption Details", viewConsDetails);

        PayBill.setBackground(new java.awt.Color(255, 255, 255));
        PayBill.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                PayBillComponentShown(evt);
            }
        });

        PaymentDet.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        PaymentDet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Year", "Month", "Reading", "Bill Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PaymentDet.setGridColor(new java.awt.Color(255, 255, 255));
        PaymentDet.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(PaymentDet);
        if (PaymentDet.getColumnModel().getColumnCount() > 0) {
            PaymentDet.getColumnModel().getColumn(0).setResizable(false);
            PaymentDet.getColumnModel().getColumn(1).setResizable(false);
            PaymentDet.getColumnModel().getColumn(2).setResizable(false);
            PaymentDet.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Service Number:");

        serviceNo.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Total:");

        totalbill.setEditable(false);

        payBill.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        payBill.setText("Pay");
        payBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });

        paymentMessage.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        javax.swing.GroupLayout PayBillLayout = new javax.swing.GroupLayout(PayBill);
        PayBill.setLayout(PayBillLayout);
        PayBillLayout.setHorizontalGroup(
            PayBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayBillLayout.createSequentialGroup()
                .addGroup(PayBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PayBillLayout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(totalbill, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(payBill))
                    .addGroup(PayBillLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(serviceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PayBillLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PayBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PayBillLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PayBillLayout.createSequentialGroup()
                        .addComponent(paymentMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(237, 237, 237))))
        );
        PayBillLayout.setVerticalGroup(
            PayBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PayBillLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(PayBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(serviceNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paymentMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(PayBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(totalbill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payBill))
                .addGap(99, 99, 99))
        );

        Consumer.addTab("Pay Bill", PayBill);

        ViewBill.setBackground(new java.awt.Color(255, 255, 255));
        ViewBill.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                ViewBillComponentShown(evt);
            }
        });

        bills.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        bills.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Year", "Month", "Reading", "Bill Amount", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(bills);
        if (bills.getColumnModel().getColumnCount() > 0) {
            bills.getColumnModel().getColumn(0).setResizable(false);
            bills.getColumnModel().getColumn(1).setResizable(false);
            bills.getColumnModel().getColumn(2).setResizable(false);
            bills.getColumnModel().getColumn(3).setResizable(false);
            bills.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout ViewBillLayout = new javax.swing.GroupLayout(ViewBill);
        ViewBill.setLayout(ViewBillLayout);
        ViewBillLayout.setHorizontalGroup(
            ViewBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewBillLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        ViewBillLayout.setVerticalGroup(
            ViewBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewBillLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        Consumer.addTab("View Bill", ViewBill);

        ChangePassword.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Current: Password:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("New Password:");

        update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        oldPass.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        newPass.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        javax.swing.GroupLayout ChangePasswordLayout = new javax.swing.GroupLayout(ChangePassword);
        ChangePassword.setLayout(ChangePasswordLayout);
        ChangePasswordLayout.setHorizontalGroup(
            ChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangePasswordLayout.createSequentialGroup()
                .addGroup(ChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChangePasswordLayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ChangePasswordLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(ChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ChangePasswordLayout.createSequentialGroup()
                                .addGroup(ChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(29, 29, 29)
                                .addGroup(ChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(oldPass)
                                    .addComponent(newPass, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ChangePasswordLayout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(update)))))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        ChangePasswordLayout.setVerticalGroup(
            ChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangePasswordLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(message)
                .addGap(64, 64, 64)
                .addGroup(ChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(oldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(ChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(newPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(update)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        Consumer.addTab("Change Password", ChangePassword);

        logout.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Consumer)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Consumer, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        if(year.getText().toString().equals("")!=true){
            errmessage.setText("");
            String mon=month.getSelectedItem().toString();
            int year1=Integer.parseInt(year.getText());
            DatabaseConnection db=new DatabaseConnection();
            ResultSet rs=null;
            db.connectDb();
            String query="SELECT * FROM consumptiondetails WHERE Year="+year1+" AND Month='"+mon+"' AND ServiceNum="+ServiceNum;
            try {
                PreparedStatement pst = db.con.prepareStatement(query);
                rs = pst.executeQuery();
                if(rs.next()){
                    reading.setText(rs.getString("Reading"));
                    billAmount.setText(rs.getString("BillAmount"));
                }
                else{
                    reading.setText("Not Available");
                    billAmount.setText("Not Available");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            errmessage.setText("*Enter all the details");
            errmessage.setForeground(Color.red);
        }
        
    }//GEN-LAST:event_SearchActionPerformed

    private void PayBillComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_PayBillComponentShown
        // TODO add your handling code here:
        serviceNo.setText(String.valueOf(ServiceNum));
        String query1="SELECT * FROM consumptiondetails WHERE ServiceNum="+ServiceNum+" AND Status='Not Paid'";
        String query2="SELECT COUNT(*) FROM consumptiondetails WHERE ServiceNum="+ServiceNum+" AND Status='Not Paid'";
        DatabaseConnection db = new DatabaseConnection();
        ResultSet rs,rs1=null;
        db.connectDb();
        try {
            PreparedStatement pst1 = db.con.prepareStatement(query1);
            PreparedStatement pst2 = db.con.prepareStatement(query2);
            rs1 = pst2.executeQuery();
            rs1.next();
            int size = rs1.getInt(1);
            rs1.close();
            rs = pst1.executeQuery();
            String [][]tbBillData=new String[size][4];
            int i =0;
            float total = 0.0f;
            while(rs.next()){
                String year=rs.getString("Year");
                String month=String.valueOf(rs.getString("Month"));
                String reading=rs.getString("Reading");
                String billAmount=rs.getString("BillAmount");
                tbBillData[i][0]=year;
                tbBillData[i][1]=month;
                tbBillData[i][2]=reading;
                tbBillData[i][3]=billAmount;
                total += Float.parseFloat(billAmount);
                i+=1;
            }
            
            DefaultTableModel tblModel1 = (DefaultTableModel)PaymentDet.getModel();
            String []cols1={"Year","Month","Reading","Bill amount"};
            tblModel1.setDataVector(tbBillData, cols1);
            
            totalbill.setText(String.valueOf(total));
            if(total==0.0)
                payBill.setEnabled(false);
            
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PayBillComponentShown

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void ViewBillComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ViewBillComponentShown
        // TODO add your handling code here:4
        String query1="SELECT * FROM consumptiondetails WHERE ServiceNum="+ServiceNum;
        String query2="SELECT COUNT(*) FROM consumptiondetails WHERE ServiceNum="+ServiceNum;
        DatabaseConnection db = new DatabaseConnection();
        ResultSet rs,rs1=null;
        db.connectDb();
        try {
            PreparedStatement pst1 = db.con.prepareStatement(query1);
            PreparedStatement pst2 = db.con.prepareStatement(query2);
            rs1 = pst2.executeQuery();
            rs1.next();
            int size = rs1.getInt(1);
            rs1.close();
            rs = pst1.executeQuery();
            String [][]tbBillData=new String[size][5];
            int i =0;
            while(rs.next()){
                String year=rs.getString("Year");
                String month=String.valueOf(rs.getString("Month"));
                String reading=rs.getString("Reading");
                String billAmount=rs.getString("BillAmount");
                String status=rs.getString("Status");
                tbBillData[i][0]=year;
                tbBillData[i][1]=month;
                tbBillData[i][2]=reading;
                tbBillData[i][3]=billAmount;
                tbBillData[i][4]=status;
                i+=1;
            }
            DefaultTableModel tblModel1 = (DefaultTableModel)bills.getModel();
            String []cols1={"Year","Month","Reading","Bill amount","Status"};
            tblModel1.setDataVector(tbBillData, cols1);
            
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ViewBillComponentShown

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        String oldpass=oldPass.getText();
        String newpass=newPass.getText();
        DatabaseConnection db = new DatabaseConnection();
        ResultSet rs=null;
        db.connectDb();
        String query1="SELECT * FROM logindetails WHERE username='"+username+"'";
        try {
            PreparedStatement pst = db.con.prepareStatement(query1);
            rs=pst.executeQuery();
            if(rs.next()){
                if(oldpass.equals(rs.getString("password"))){
                    String query="UPDATE logindetails SET password='"+newpass+"' WHERE username='"+username+"'";
                    try {
                        Statement st = db.con.createStatement();
                        int upd = st.executeUpdate(query);
                        if(upd>0){
                            message.setText("Updated Successfully");
                            message.setForeground(Color.blue);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    message.setText("Current Password is not correct");
                    message.setForeground(Color.red);
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_updateActionPerformed

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        // TODO add your handling code here:
        DatabaseConnection db = new DatabaseConnection();
        ResultSet rs=null;
        db.connectDb();
        String query1="UPDATE consumptiondetails SET Status = 'PAID' WHERE ServiceNum ="+ServiceNum;
        try {
            PreparedStatement pst = db.con.prepareStatement(query1);
            int pay = pst.executeUpdate();
            if(pay > 0){
                JOptionPane.showMessageDialog(null, "Payment successful");
                paymentMessage.setText("No Pending Bills !");
                paymentMessage.setForeground(Color.BLUE);
                totalbill.setText("0");
                PaymentDet.setVisible(false);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_payActionPerformed

    private void viewConsDetailsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_viewConsDetailsComponentShown
        // TODO add your handling code here:
        year.setText("");
        reading.setText("");
        billAmount.setText("");
    }//GEN-LAST:event_viewConsDetailsComponentShown

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
            java.util.logging.Logger.getLogger(Consumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consumer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ChangePassword;
    private javax.swing.JTabbedPane Consumer;
    private javax.swing.JPanel PayBill;
    private javax.swing.JTable PaymentDet;
    private javax.swing.JButton Search;
    private javax.swing.JPanel ViewBill;
    private javax.swing.JTextField billAmount;
    private javax.swing.JTable bills;
    private javax.swing.JLabel errmessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logout;
    private javax.swing.JLabel message;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JPasswordField newPass;
    private javax.swing.JPasswordField oldPass;
    private javax.swing.JButton payBill;
    private javax.swing.JLabel paymentMessage;
    private javax.swing.JTextField reading;
    private javax.swing.JTextField serviceNo;
    private javax.swing.JTextField totalbill;
    private javax.swing.JButton update;
    private javax.swing.JPanel viewConsDetails;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
