
package pe.cibertec.ecommerce.ApiCategory.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiCategory.dao.CategoryRepository;
import pe.cibertec.ecommerce.ApiCategory.entity.Category;

@Service
public class CategoryServiceImpl implements CategoryService{
    
    @Autowired
    private CategoryRepository CategoryRepository;

    @Override
    public List<Category> findAll() {
        return CategoryRepository.findAll();
    }

    @Override
    public Category findByIdCategory(String idCategory) {
        return CategoryRepository.findByIdCategory(idCategory); 
    }

    @Override
    public Category add(Category category) {
        return CategoryRepository.save(category); 
    }
    
}
