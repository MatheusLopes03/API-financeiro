package com.example.financeiro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.financeiro.model.Credito;
import com.example.financeiro.repository.CreditoRepository;

@Service
public class CreditoService {
    @Autowired
    private CreditoRepository creditoRepository;

    public List<Credito> getAllCreditos() {
        return creditoRepository.findAll();
    }

    @SuppressWarnings("null")
    public Credito getCreditoById(Long id) {
        return creditoRepository.findById(id).orElse(null);
    }

    @SuppressWarnings("null")
    public Credito createCredito(Credito credito) {
        return creditoRepository.save(credito);
    }

    @SuppressWarnings("null")
    public Credito updateCredito(Long id, Credito credito) {
        if (creditoRepository.existsById(id)) {
            credito.setId(id);
            return creditoRepository.save(credito);
        } else {
            return null;
        }
    }

    @SuppressWarnings("null")
    public boolean deleteCredito(Long id) {
        if (creditoRepository.existsById(id)) {
            creditoRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}