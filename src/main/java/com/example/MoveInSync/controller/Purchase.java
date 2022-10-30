package com.example.MoveInSync.controller;

import com.example.MoveInSync.entity.Customerdata;
import com.example.MoveInSync.entity.Purchasepojo;
import com.example.MoveInSync.repository.Customer;
import com.example.MoveInSync.repository.Purchaserepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Purchase {
    @Autowired
    public Purchaserepo repository;
    @PostMapping
    @ResponseBody
    @RequestMapping(path="/purchase")
    public String postBody(@RequestBody Purchasepojo customer) {


           if(customer.MRP>=customer.Pricing)
        repository.save(customer);
           else
               return "MRP is greater than Pricing";
        return "AddedSuccesfully";

    }
}
