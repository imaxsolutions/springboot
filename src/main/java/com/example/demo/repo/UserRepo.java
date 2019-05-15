package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Users;

public interface UserRepo extends CrudRepository<Users, Long> {

}
