package com.sda.tallinn4.practicalproject.repository;

import com.sda.tallinn4.practicalproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
