
package pe.cibertec.ecommerce.ApiProductos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiProductos.dto.ProductDto;
import pe.cibertec.ecommerce.ApiProductos.entity.Product;
import pe.cibertec.ecommerce.ApiProductos.service.ProductService;

@RestController
@RequestMapping("/api/producto")
public class ProductController {
    
    @Autowired
    private ProductService productService;
    
    @PostMapping("/add")
    public ResponseEntity<Product> add(@RequestBody Product product){
        return new ResponseEntity<>(productService.add(product),
                HttpStatus.CREATED);
    }
     @GetMapping("/findById/{id}")
    public ResponseEntity<ProductDto> findById(@PathVariable Long id){
        return new ResponseEntity<>(productService.findById(id),
                HttpStatus.OK);
    }
     @PutMapping("/update/{id}")
    public  ResponseEntity<Product> update(@PathVariable Long id,@RequestBody Product product){
    return new ResponseEntity<>(productService.update(id, product),HttpStatus.OK)   ;
    }
    
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
    productService.delete(id);
    }
}
