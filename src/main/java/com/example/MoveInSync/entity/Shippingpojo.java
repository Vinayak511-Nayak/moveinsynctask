package com.example.MoveInSync.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "Shipping")
@Getter
@Setter
public class Shippingpojo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int shipid;
    public int Purchaseid ;
    public String address;
    public String city;
    public int pincode;
    public int customerid;

}
