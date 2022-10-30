package com.example.MoveInSync.repository;

import com.example.MoveInSync.entity.Customerdata;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Customer extends CrudRepository<Customerdata, Integer> {

}
