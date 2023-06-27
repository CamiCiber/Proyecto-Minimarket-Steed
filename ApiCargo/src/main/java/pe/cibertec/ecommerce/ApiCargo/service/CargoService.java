
package pe.cibertec.ecommerce.ApiCargo.service;

import java.util.List;
import pe.cibertec.ecommerce.ApiCargo.entity.Cargo;


public interface CargoService {
    public List<Cargo> findAll();
    public Cargo findByIdCategory(String idCategory);
    public Cargo add(Cargo category);
     public Cargo update(long id, Cargo cargo);
     public void delete(long id);
    
}
