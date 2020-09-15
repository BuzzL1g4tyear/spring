package com.example.spring.repos;

import com.example.spring.domen.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRep extends CrudRepository<Users,Long > {
}
