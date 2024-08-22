package com.costara.project_dikaion.repositories;

import org.springframework.data.jpa.repository.JpaRepository; 

import com.costara.project_dikaion.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
