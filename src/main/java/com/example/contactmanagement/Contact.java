package com.example.contactmanagement;

public class Contact {
    private String name;
    private String phone;
    private String email;
    private String company;
    
    public Contact(String name, String phone, String email, String company) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.company = company;
    }
    
    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public String getCompany() { return company; }
}
