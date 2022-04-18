/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebbillpayment;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Ragul
 */
public class DatabaseConnection {

Connection con = null;
public Connection connectDb(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebbill","root","mysql");
        //JOptionPane.showMessageDialog(null,"Connection Successfull");
        return con;
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
}

}
