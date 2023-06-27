package pe.cibertec.ecommerce.ApiBoleta.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Product {
    private Long productId;
    private String productName;
    private Double unitPrice;
    private String idCategory; 
}
