package com.example.multipleloginpages.Repository;

import com.example.multipleloginpages.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    public User findByEmail(String Email);
}
