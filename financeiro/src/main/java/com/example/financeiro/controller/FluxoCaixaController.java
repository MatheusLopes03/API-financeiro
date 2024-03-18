import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.financeiro.service.CreditoService;
import com.example.financeiro.service.DebitoService;

@RestController
@RequestMapping("/fluxo-caixa")
public class FluxoCaixaController {
    
    @Autowired
    private DebitoService debitoService;
    
    @Autowired
    private CreditoService creditoService;
    
    // Endpoint para obter o fluxo de caixa
    @GetMapping("/fluxo")
    public ResponseEntity<FluxoCaixaDTO> getFluxoCaixa() {
        double totalPagar = debitoService.getTotalAPagar();
        double totalReceber = creditoService.getTotalAReceber();
        
        FluxoCaixaDTO fluxoCaixaDTO = new FluxoCaixaDTO(totalPagar, totalReceber);
        
        return ResponseEntity.ok(fluxoCaixaDTO);
    }
    
    // Endpoint para obter o total a pagar
    @GetMapping("/total-a-pagar")
    public ResponseEntity<Double> getTotalAPagar() {
        double totalPagar = debitoService.getTotalAPagar();
        return ResponseEntity.ok(totalPagar);
    }
    
    // Endpoint para obter o total a receber
    @GetMapping("/total-a-receber")
    public ResponseEntity<Double> getTotalAReceber() {
        double totalReceber = creditoService.getTotalAReceber();
        return ResponseEntity.ok(totalReceber);
    }
}
