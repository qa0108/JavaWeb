/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;
import java.util.*;
import Models.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author DELL
 */
public class DBConnection {
    private ArrayList<Student> stdList;
    private HashMap<String,Department> departHm;
    public String status;
    Connection con;

    public DBConnection() {
        try {
            con = new DBContext().getConnection();
        } catch (Exception ex) {
            status = "Error connection" + ex.getMessage();
        }
    }
    
    public void loadStudent(){
        stdList = new ArrayList<Student>();
        String sql= "select * from Student";
        try {
            PreparedStatement ps =con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String id = rs.getString(1);
                String name = rs.getString(2);
                String departId = rs.getString(3);
                boolean gender = rs.getBoolean(4);
                float gpa = rs.getFloat(5);
                String add = rs.getString(6);
                stdList.add(new Student(id,name, departId,gender,gpa,add));
            }
        } catch (Exception e) {
            status = "Error Student" + e.getMessage();
        }
    }    
}
