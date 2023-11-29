package controller;

import component.Alert;
import java.sql.*;
import javax.swing.JOptionPane;

public class MySql{
    PreparedStatement ps;
    ResultSet rs;
    // Connector
    public Connection connection(){
        Connection con = null;        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/java6_7", "root", "");
        } catch (ClassNotFoundException|SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Connection fail");
        }
        return con;
    }
    // Add Employee
    public void addEmployee(String firstName,String lastName,String gender,String address,String phone,String salary,String image){
        if (firstName.isEmpty() || lastName.isEmpty() || address.isEmpty() || phone.isEmpty() || salary.isEmpty()|| image.isEmpty()) {
            Alert.showError("ERROR MESSAGE", "Please fill all blank fields");
        } else {
            String sql = "INSERT INTO `employee`(`first_name`, `last_name`, `gender`, `address`, `phone`, `salary`, `image`) VALUES (?,?,?,?,?,?,?)";
            try {
                ps = connection().prepareStatement(sql);
                ps.setString(1, firstName);
                ps.setString(2, lastName);
                ps.setString(3, gender);
                ps.setString(4, address);
                ps.setString(5, phone);
                ps.setFloat(6, Float.parseFloat(salary));
                ps.setString(7, image);
                int i = ps.executeUpdate();
                if (i > 0) {
                    Alert.showSuccess("Success Message", "Add Success");
                } else {
                    Alert.showError("Error Message", "Add not Success");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    // Update employee in database
    public void updateEmpoyee(String id,String firstName,String lastName,String gender,String address,String phone,String salary,String image){
        if (id.isEmpty() ||firstName.isEmpty() || lastName.isEmpty() || address.isEmpty() || phone.isEmpty() || salary.isEmpty()|| image.isEmpty()) {
            Alert.showError("ERROR MESSAGE", "Please select employee");
        } else {
            String sql = "UPDATE `employee` SET `first_name`=?,`last_name`=?,`gender`=?,`address`=?,`phone`=?,`salary`=?,`image`=? WHERE id=?";
            try {
                ps = connection().prepareStatement(sql);
                ps.setString(1, firstName);
                ps.setString(2, lastName);
                ps.setString(3, gender);
                ps.setString(4, address);
                ps.setString(5, phone);
                ps.setFloat(6, Float.parseFloat(salary));
                ps.setString(7, image);
                ps.setInt(8, Integer.parseInt(id));
                int i = ps.executeUpdate();
                if (i > 0) {
                    Alert.showSuccess("Success Message", "Update Success");
                } else {
                    Alert.showError("Error Message", "Update not Success");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    // Delete employee in database
    public void deleteEmployee(String id){
        if ( id.isEmpty()) {
            Alert.showError("ERROR MESSAGE", "Please select employee");
        } else {
            String sql = "DELETE FROM `employee` WHERE id=?";
            try {
                ps = connection().prepareStatement(sql);
                ps.setInt(1, Integer.parseInt(id));
                int i = ps.executeUpdate();
                if (i > 0) {
                    Alert.showSuccess("Success Message", "Delete Success");
                } else {
                    Alert.showError("Error Message", "Delete not Success");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}