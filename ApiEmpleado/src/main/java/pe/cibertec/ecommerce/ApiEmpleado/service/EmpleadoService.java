
package pe.cibertec.ecommerce.ApiEmpleado.service;

import java.util.List;
import pe.cibertec.ecommerce.ApiEmpleado.dto.EmpleadoDto;
import pe.cibertec.ecommerce.ApiEmpleado.entity.Empleado;


public interface EmpleadoService {
    
    public Empleado add(Empleado product);
    public EmpleadoDto findById(Long id);
    public Empleado update(long id, Empleado empleado);
     public void delete(long id);
     public List<Empleado> findAll();
}
