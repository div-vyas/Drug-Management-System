/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
/**
 *
 * @author divya
 */
public class Tables {
    public static void main(String[] args) {
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();

            st.executeUpdate("create table bill (bill_pk int AUTO_INCREMENT primary key, billId varchar(200), billDate varchar(200), totalPaid bigint,generatedBy varchar(50))");
            JOptionPane.showMessageDialog(null,"Table Created Sucessfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
