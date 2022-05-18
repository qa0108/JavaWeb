/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author DELL
 */
public class Student {
    private String id;
    private String name;
    private String departId;
    private boolean gender;
    private float GPA;
    private String address;

    public Student() {
    }

    public Student(String id, String name, String departId, boolean gender, float GPA, String address) {
        this.id = id;
        this.name = name;
        this.departId = departId;
        this.gender = gender;
        this.GPA = GPA;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String toRow(){
        String s = "<tr>";
        s+="<td>" + id + "</td>";
        s+="<td>" + name + "</td>";
        s+="<td>" + departId + "</td>";
        s+="<td>" + (gender?"Male":"Female") + "</td>";
        s+="<td>" + GPA + "</td>";
        s+="<td>" + address + "</td>";
        s+= "</tr>";
        return s;
    }
}
