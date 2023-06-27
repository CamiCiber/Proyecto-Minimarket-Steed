
package pe.cibertec.ecommerce.ApiProductos.dto;

import java.util.Date;
import lombok.Data;
import pe.cibertec.ecommerce.ApiProductos.entity.Category;

@Data
public class ProductDto {
    private Long id;
    private String productName;
    private Double unitPrice;
    private String marca;
    private Date fecVec;
    private int stock;
    private Category category;
}
