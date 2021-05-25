package com.project.user.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.user.model.user;

@Repository
public interface userrepository extends JpaRepository<user, Long>{

}