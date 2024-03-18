package com.example.financeiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.financeiro.model.Debito;

@Repository
public interface DebitoRepository extends JpaRepository<Debito, Long> {
}