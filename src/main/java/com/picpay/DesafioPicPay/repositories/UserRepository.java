package com.picpay.DesafioPicPay.repositories;

import com.picpay.DesafioPicPay.entities.user.User;
import org.aspectj.apache.bcel.util.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
        Optional<User> findUserByDocument(String document);
        Optional<User> findUserById(Long id);
}
