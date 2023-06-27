
package pe.cibertec.ecommerce.ApiProductos.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.cibertec.ecommerce.ApiProductos.entity.Category;

@FeignClient(name= "apicategoria")
public interface ApiRestClient {
    @GetMapping("/api/categoria/findByIdCategory/{idCategory}")
    public Category findByIdCategoryId(@PathVariable String idCategory);
}
