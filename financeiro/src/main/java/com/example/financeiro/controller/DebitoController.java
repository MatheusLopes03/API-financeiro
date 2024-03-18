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
import com.example.financeiro.model.Debito;
import com.example.financeiro.service.DebitoService;

@RestController
@RequestMapping("/debitos")
public class DebitoController {
    @Autowired
    private DebitoService debitoService;

    @GetMapping("/{id}")
    public ResponseEntity<Debito> getDebitoById(@PathVariable Long id) {
        Debito debito = debitoService.getDebitoById(id);
        if (debito != null) {
            return ResponseEntity.ok(debito);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Debito> updateDebito(@PathVariable Long id, @RequestBody Debito debito) {
        Debito updatedDebito = debitoService.updateDebito(id, debito);
        if (updatedDebito != null) {
            return ResponseEntity.ok(updatedDebito);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDebito(@PathVariable Long id) {
        boolean deleted = debitoService.deleteDebito(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
