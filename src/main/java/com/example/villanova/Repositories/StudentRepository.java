package com.example.villanova.Repositories;

import com.example.villanova.Models.Students;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Students,Integer> {

}
