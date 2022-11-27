package com.example.phonemanagement.repository;

import com.example.phonemanagement.model.SmartPhone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISmartphoneRepository extends CrudRepository<SmartPhone, Long> {
}
