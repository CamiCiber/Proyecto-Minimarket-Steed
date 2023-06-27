
package pe.cibertec.ecommerce.ApiProductos.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiProductos.dao.ProductRepository;
import pe.cibertec.ecommerce.ApiProductos.dto.ProductDto;
import pe.cibertec.ecommerce.ApiProductos.entity.Category;
import pe.cibertec.ecommerce.ApiProductos.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ApiRestClient apiRestClient;
    @Override
    public Product add(Product product) {
        return productRepository.save(product);
        
    }
    @Override
    public ProductDto findById(Long id) {
       Product p= productRepository.findById(id).get();
       
        Category c=apiRestClient.findByIdCategoryId(p.getIdCategory());
        ProductDto productDto=new ProductDto();
        productDto.setId(p.getId());
        productDto.setProductName(p.getProductName());
        productDto.setUnitPrice(p.getUnitPrice());
        productDto.setMarca(p.getMarca());
        productDto.setFecVec(p.getFecVec());
        productDto.setStock(p.getStock());
        productDto.setCategory(c);
        
        return productDto;
    }

    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();    }

    @Override
    public Product update(Long id, Product product) {
      Product productDB = productRepository.findById(id).get();
        productDB.setProductName(product.getProductName());
        productDB.setUnitPrice(product.getUnitPrice());
        productDB.setMarca(product.getMarca());
        productDB.setFecVec(product.getFecVec());
        productDB.setStock(product.getStock());
        productDB.setIdCategory(product.getIdCategory());
        return productRepository.save(productDB);
    }

    @Override
    public void delete(Long id) {
    Product product = productRepository.findById(id).get();
        productRepository.delete(product);
    }
    
}
