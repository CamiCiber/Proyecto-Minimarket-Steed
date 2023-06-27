
package pe.cibertec.ecommerce.ApiProductos.service;

import java.util.List;
import pe.cibertec.ecommerce.ApiProductos.dto.ProductDto;
import pe.cibertec.ecommerce.ApiProductos.entity.Product;


public interface ProductService {
    
    public Product add(Product product);
    public ProductDto findById(Long id);
    public List<Product> findAll();
    public Product update(Long id, Product product);
    public void delete(Long id);
}
