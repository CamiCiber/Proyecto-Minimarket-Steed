package pe.cibertec.ecommerce.ApiBoleta.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.ecommerce.ApiBoleta.entity.Receipt;

public interface ReceiptRepository extends JpaRepository<Receipt, Long>{
    
}
