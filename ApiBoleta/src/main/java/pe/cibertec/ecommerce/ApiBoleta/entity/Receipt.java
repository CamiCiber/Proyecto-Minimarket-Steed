package pe.cibertec.ecommerce.ApiBoleta.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import lombok.Data;

@Entity
@Data
public class Receipt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long receiptId;
    
    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;
    
    private String receiptNumber;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date receiptDate;
    
    private BigDecimal totalAmount;
    
    @OneToMany(mappedBy = "receipt",cascade = CascadeType.ALL)
    private Set<ReceiptDetail> details;
    
    // Método para agregar un detalle de compra al recibo
    public void addReceiptDetail(ReceiptDetail detail) {
        if (details == null){
            details = new HashSet<>();
        }
        details.add(detail);
        detail.setReceipt(this);
    }
}
