package com.example.lab1_fullstack.repositories;

import com.example.lab1_fullstack.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}
