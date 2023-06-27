package pe.cibertec.ecommerce.ApiBoleta.service;

import pe.cibertec.ecommerce.ApiBoleta.dto.Purchase;
import pe.cibertec.ecommerce.ApiBoleta.dto.PurchaseResponse;
import pe.cibertec.ecommerce.ApiBoleta.entity.Receipt;

public interface ReceiptService {
    
    public PurchaseResponse purchaseResponse(Purchase purchase);
    public Receipt findRecieptById(Long receiptId);
    
}
