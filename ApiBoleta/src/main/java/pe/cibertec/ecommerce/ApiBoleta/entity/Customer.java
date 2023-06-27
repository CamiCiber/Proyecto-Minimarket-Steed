package pe.cibertec.ecommerce.ApiBoleta.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.Set;
import lombok.Data;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String customerName;
    private String email;
    private String phone;
    
    @OneToMany(mappedBy = "customer")
    private Set<Receipt> receipts;
}