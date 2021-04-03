package BaseDeDatos;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Agarwal
 */
public class Connect {
    Connection con=null;
   
        public static Connection ConnectDB(){
        try{
           Class.forName("com.mysql.jdbc.Driver");
//           Class.forName("com.mysql.cj.jdbc.Driver");

//           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagmentsystem?verifyServerCertificate=false&useSSL=true","root","");
//           Connection con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/mCJFkaxM76?verifyServerCertificate=false&useSSL=true","mCJFkaxM76","ABIozc1wa3");
             Connection con = DriverManager.getConnection("jdbc:mysql://instancia-db-hospital.cstv4jyg5vif.us-east-1.rds.amazonaws.com:3306/hospitalmanagmentsystem?verifyServerCertificate=false&useSSL=true","root","passwordadmin");
           return con;
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }      
     }
}
