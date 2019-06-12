package com.sda.tallinn4.practicalproject.register.repository;

import com.sda.tallinn4.practicalproject.register.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
