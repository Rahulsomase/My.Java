package question5;

import java.io.Serializable;

public class Student implements Serializable {
    private int roll;
    private String name;
    private int marks;
    private String mail;
    private String password;
    private String address;
    
    public Student() {
        
    }
    
    

    @Override
    public String toString() {
        return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", mail=" + mail + ", password="
                + password + ", address=" + address + "]";
    }



    public Student(int roll, String name, int marks, String mail, String password, String string) {
        super();
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        this.mail = mail;
        this.password = password;
        this.address = string;
    }



    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
