
package pe.cibertec.ecommerce.ApiProductos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Data;


@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private Double unitPrice;
    private String marca;
    private Date fecVec;
    private int stock;
    private String idCategory;
}
