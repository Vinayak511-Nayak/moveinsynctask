package com.example.MoveInSync.repository;

import com.example.MoveInSync.entity.Purchasepojo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Purchaserepo extends CrudRepository<Purchasepojo, Integer> {

}
