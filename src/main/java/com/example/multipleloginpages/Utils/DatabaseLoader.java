package com.example.multipleloginpages.Utils;

import com.example.multipleloginpages.Entity.User;
import com.example.multipleloginpages.Enums.Role;
import com.example.multipleloginpages.Repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.List;

public class DatabaseLoader {
    private UserRepository repo;

    public DatabaseLoader(UserRepository repo) {
        this.repo = repo;
    }

    @Bean
    public CommandLineRunner initializeDatabase() {
        return args -> {
            User user1 = new User("david@gmail.com", "david123", Role.ADMIN);
            User user2 = new User("john@yahoo.com", "john2020", Role.ADMIN);
            User user3 = new User("nam@codejava.net", "nam2022", Role.USER);
            User user4 = new User("ravi@gmail.com", "ravi2121", Role.USER);

            repo.saveAll(List.of(user1, user2, user3, user4));

            System.out.println("Database initialized");
        };
    }
}
