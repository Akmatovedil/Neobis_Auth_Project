package com.example.Neobis_Auth_Project.repositories;

import com.example.Neobis_Auth_Project.entity.ActivationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ActivationTokenRepository extends JpaRepository<ActivationToken, Long> {
    Optional<ActivationToken> findByToken(String Token);
}
