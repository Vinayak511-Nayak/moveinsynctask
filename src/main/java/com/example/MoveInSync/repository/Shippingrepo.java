package com.example.MoveInSync.repository;

import com.example.MoveInSync.entity.Purchasepojo;
import com.example.MoveInSync.entity.Shippingpojo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Shippingrepo extends CrudRepository<Shippingpojo, Integer> {


  List<Shippingpojo> findallbycity(String city);

}
