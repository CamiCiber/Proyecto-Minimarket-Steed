package pe.cibertec.ecommerce.ApiBoleta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiBoleta.dto.Purchase;
import pe.cibertec.ecommerce.ApiBoleta.dto.PurchaseResponse;
import pe.cibertec.ecommerce.ApiBoleta.entity.Receipt;
import pe.cibertec.ecommerce.ApiBoleta.service.ReceiptService;

@RestController
@RequestMapping("/api/receipt")
public class ReceiptController {
    
    @Autowired
    private ReceiptService receiptService;
    
    @PostMapping("/placeReceipt")
    public PurchaseResponse placeReceipt(@RequestBody Purchase purchase){
        return receiptService.purchaseResponse(purchase);
    }
    
    @GetMapping("/search/findReceiptWithDetailsById/{receiptId}")
    public ResponseEntity<Receipt> findRecieptById(@PathVariable Long receiptId) {
        Receipt receipt = receiptService.findRecieptById(receiptId);
        if (receipt != null) {
            return ResponseEntity.ok(receipt);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
}

