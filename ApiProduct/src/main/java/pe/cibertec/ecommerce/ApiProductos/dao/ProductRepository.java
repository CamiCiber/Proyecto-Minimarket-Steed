
package pe.cibertec.ecommerce.ApiProductos.dao;

import org.springframework.data.repository.CrudRepository;
import pe.cibertec.ecommerce.ApiProductos.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
