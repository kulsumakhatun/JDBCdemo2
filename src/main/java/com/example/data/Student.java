package com.example.data;

public class Student {

    private String name;

    private int rollNo;

    private String email;
    private Address address;
    private Standard standard;

    public Student() {
    }

    public Student(String name, int rollNo, String email, Address address, Standard standard) {
        this.name = name;
        this.rollNo = rollNo;
        this.email = email;
        this.address = address;
        this.standard = standard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(Standard standard) {
        this.standard = standard;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", standard=" + standard +
                '}';
    }
}
