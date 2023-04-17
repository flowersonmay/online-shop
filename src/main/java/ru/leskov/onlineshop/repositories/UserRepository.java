package ru.leskov.onlineshop.repositories;

import ru.leskov.onlineshop.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
