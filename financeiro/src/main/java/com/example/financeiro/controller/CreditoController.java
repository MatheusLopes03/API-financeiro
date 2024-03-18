package com.example.financeiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.financeiro.model.Credito;
import com.example.financeiro.service.CreditoService;


@RestController
@RequestMapping("/creditos")
public class CreditoController {
    @Autowired
    private CreditoService creditoService;

    @GetMapping("/{id}")
    public ResponseEntity<Credito> getCreditoById(@PathVariable Long id) {
        Credito credito = creditoService.getCreditoById(id);
        if (credito != null) {
            return ResponseEntity.ok(credito);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Credito> updateCredito(@PathVariable Long id, @RequestBody Credito credito) {
        Credito updatedCredito = creditoService.updateCredito(id, credito);
        if (updatedCredito != null) {
            return ResponseEntity.ok(updatedCredito);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCredito(@PathVariable Long id) {
        boolean deleted = creditoService.deleteCredito(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}