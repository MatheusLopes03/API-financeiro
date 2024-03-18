package com.example.financeiro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.financeiro.model.Debito;
import com.example.financeiro.repository.DebitoRepository;

@Service
public class DebitoService {
    @Autowired
    private DebitoRepository debitoRepository;

    public List<Debito> getAllDebitos() {
        return debitoRepository.findAll();
    }

    @SuppressWarnings("null")
    public Debito getDebitoById(Long id) {
        return debitoRepository.findById(id).orElse(null);
    }

    @SuppressWarnings("null")
    public Debito createDebito(Debito debito) {
        return debitoRepository.save(debito);
    }

    @SuppressWarnings("null")
    public Debito updateDebito(Long id, Debito debito) {
        if (debitoRepository.existsById(id)) {
            debito.setId(id);
            return debitoRepository.save(debito);
        } else {
            return null;
        }
    }

    @SuppressWarnings("null")
    public boolean deleteDebito(Long id) {
        if (debitoRepository.existsById(id)) {
            debitoRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}