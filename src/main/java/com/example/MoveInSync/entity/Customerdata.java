package com.example.MoveInSync.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Customer")
public class Customerdata {


    public int   CustomerId;
     public String Name;
   public    String Email;
   public int Mobile_no;
     public String city;


    public Customerdata()
    {

    }
    public Customerdata(int   CustomerId, String Name, String Email, int Mobile_no, String city)
    {
        this.CustomerId=CustomerId;
        this.Name=Name;
        this.Email=Email;
        this.Mobile_no=Mobile_no;
        this.city=city;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getCustomerId() {
        return CustomerId;
    }

    public int setCustomerId(int id)
   {  this.CustomerId=id;
        return id;
    }
    public String getName()
    {
        return Name;
    }
    public String setName( String Name)
    {
        this.Name=Name;
        return Name;
    }
    public String getEmail()
    {
        return Email;
    }
    public String setEmail(String Email)
    {
        this.Email=Email;
        return Email;
    }
    public int getMobile_no()
    {
        return Mobile_no;
    }
    public int setMobile_no( int Number)
    {
        this.Mobile_no=Number;
        return Mobile_no;
    }
    public String getCity()
    {
        return city;
    }

    public String setCity( String city)
    {
        this.city=city;
        return city;
    }

}
