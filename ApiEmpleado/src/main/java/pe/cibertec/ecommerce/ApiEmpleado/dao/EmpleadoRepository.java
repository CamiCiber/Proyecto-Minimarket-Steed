
package pe.cibertec.ecommerce.ApiEmpleado.dao;

import org.springframework.data.repository.CrudRepository;
import pe.cibertec.ecommerce.ApiEmpleado.entity.Empleado;

public interface EmpleadoRepository extends CrudRepository<Empleado, Long> {
    
}
