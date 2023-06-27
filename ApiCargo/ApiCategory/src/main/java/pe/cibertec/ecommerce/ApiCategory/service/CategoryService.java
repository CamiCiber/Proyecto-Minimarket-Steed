
package pe.cibertec.ecommerce.ApiCategory.service;

import java.util.List;
import pe.cibertec.ecommerce.ApiCategory.entity.Category;


public interface CategoryService {
    public List<Category> findAll();
    public Category findByIdCategory(String idCategory);
    public Category add(Category category);
    
}
