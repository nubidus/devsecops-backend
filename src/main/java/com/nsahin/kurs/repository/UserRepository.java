package com.nsahin.kurs.repository;
import com.nsahin.kurs.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Özel sorgu metotları gerektiğinde buraya eklenebilir
}
