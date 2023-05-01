package com.pedroantoniorodrigues.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedroantoniorodrigues.demo.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
