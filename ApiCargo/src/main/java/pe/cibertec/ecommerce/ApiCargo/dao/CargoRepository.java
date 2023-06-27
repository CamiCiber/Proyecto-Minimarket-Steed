
package pe.cibertec.ecommerce.ApiCargo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.ecommerce.ApiCargo.entity.Cargo;


public interface CargoRepository extends JpaRepository<Cargo, Long> {
    Cargo findByIdCategory(String idCategory);
}
