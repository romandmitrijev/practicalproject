package com.sda.tallinn4.practicalproject.register.repository;

import com.sda.tallinn4.practicalproject.register.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User findUserByUserName(String username);
}
