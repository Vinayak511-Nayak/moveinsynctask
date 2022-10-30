package com.example.MoveInSync.controller;

import com.example.MoveInSync.entity.Customerdata;
import com.example.MoveInSync.repository.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class customer_data {
    @Autowired
    public Customer custrepository;
    @PostMapping
    @ResponseBody
    @RequestMapping(path="/response")
    public void postBody(@RequestBody Customerdata customer) {

              Customerdata customr=new Customerdata();
              customr.setCustomerId(customer.CustomerId);
             customr.setName(customer.Name);
             customr.setCustomerId(customer.CustomerId);
        customr.setEmail(customer.Email);
        customr.setMobile_no(customer.Mobile_no);
        customr.setCity(customer.city);
        custrepository.save(customer);

    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getUsers() {
        return "okay";
    }
}
