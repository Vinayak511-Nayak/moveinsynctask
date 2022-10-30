package com.example.MoveInSync.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Purchase")
@Getter
@Setter
public class Purchasepojo {
    public  String Product_Name;
    public  int Quantity;
    public  int Pricing;
    public int MRP;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int PurchaseId;
    public int CustomerId;
    /*public Purchasepojo(String Product_Name, int Quantity, int Pricing, int MRP, int PurhcaseId,int CustomerId) {
        this.PurchaseId = PurhcaseId;
        this.Product_Name = Product_Name;
        this.Quantity = Quantity;
        this.Pricing = Pricing;
        this.MRP = MRP;
        this.CustomerId = CustomerId;

    }
    public Purchasepojo()
    {

    }*/



}


