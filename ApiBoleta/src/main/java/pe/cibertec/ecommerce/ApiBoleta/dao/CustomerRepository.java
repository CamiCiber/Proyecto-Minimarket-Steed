package pe.cibertec.ecommerce.ApiBoleta.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.ecommerce.ApiBoleta.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
    
}
