package pe.cibertec.ecommerce.ApiBoleta.service;

import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiBoleta.dao.CustomerRepository;
import pe.cibertec.ecommerce.ApiBoleta.dao.ReceiptRepository;
import pe.cibertec.ecommerce.ApiBoleta.dto.Purchase;
import pe.cibertec.ecommerce.ApiBoleta.dto.PurchaseResponse;
import pe.cibertec.ecommerce.ApiBoleta.entity.Customer;
import pe.cibertec.ecommerce.ApiBoleta.entity.Receipt;

@Service
public class ReceiptServiceImpl implements ReceiptService{
   
    @Autowired
    private ReceiptRepository receiptRepository;
    @Autowired
    private CustomerRepository customerRepository;
    
    @Override
    public PurchaseResponse purchaseResponse(Purchase purchase) {
        Receipt receipt = purchase.getReceipt();
        receipt.setReceiptNumber(getTrackingNumber());
        purchase.getReceiptDetails().forEach(i->{
            receipt.addReceiptDetail(i);  
        });
        receiptRepository.save(receipt);
        
        return new PurchaseResponse(receipt.getReceiptNumber());
        
    }
    
    private String getTrackingNumber(){
        return UUID.randomUUID().toString();
    } 

    @Override
    public Receipt findRecieptById(Long receiptId) {
        return receiptRepository.findById(receiptId).orElse(null);
    }
}
