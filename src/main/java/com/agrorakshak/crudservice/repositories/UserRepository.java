package com.agrorakshak.crudservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agrorakshak.crudservice.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

}
