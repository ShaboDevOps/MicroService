package com.kayaTech.Repostory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kayaTech.Models.User;

public interface UserRepo extends JpaRepository<User, String> {}
