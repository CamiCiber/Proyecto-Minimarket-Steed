
package pe.cibertec.ecommerce.ApiCategory.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiCategory.entity.Category;
import pe.cibertec.ecommerce.ApiCategory.service.CategoryService;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    
    @Autowired
    private CategoryService CategoryService;
    
    @GetMapping("/findAll")
    public ResponseEntity<List<Category>> findAll(){
        return new ResponseEntity<>(
        CategoryService.findAll(),HttpStatus.OK);
    }
    
    @GetMapping("/findByIdCategory/{idCategory}")
    public ResponseEntity<Category> findByIdCategory(
            @PathVariable String idCategory){
        return new ResponseEntity<>(
        CategoryService.findByIdCategory(idCategory),HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Category> add(
            @RequestBody Category category){
        return new ResponseEntity<>(
        CategoryService.add(category),HttpStatus.CREATED);
    }
    
}
