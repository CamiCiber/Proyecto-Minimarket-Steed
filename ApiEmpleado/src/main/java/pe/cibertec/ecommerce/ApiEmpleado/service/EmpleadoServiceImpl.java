
package pe.cibertec.ecommerce.ApiEmpleado.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiEmpleado.dto.EmpleadoDto;
import pe.cibertec.ecommerce.ApiEmpleado.entity.Category;
import pe.cibertec.ecommerce.ApiEmpleado.entity.Empleado;
import pe.cibertec.ecommerce.ApiEmpleado.dao.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {
    
    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Autowired
    private ApiRestClient apiRestClient;
    @Override
    public Empleado add(Empleado product) {
        return empleadoRepository.save(product);
        
    }
    @Override
    public EmpleadoDto findById(Long id) {
       Empleado e= empleadoRepository.findById(id).get();
        Category c=apiRestClient.findByIdCategoryId(e.getIdCategory());
        
        EmpleadoDto empleadoDto=new EmpleadoDto();
         
        empleadoDto.setNombre(e.getNombre());
        empleadoDto.setApellido(e.getApellido());
        empleadoDto.setDni(e.getDni());
        empleadoDto.setNumero(e.getNumero());
        empleadoDto.setDireccion(e.getDireccion());
        empleadoDto.setFecha_nc(e.getFecha_nc());
        empleadoDto.setCategory(c);
        return empleadoDto;
  
    }

    @Override
    public Empleado update(long id, Empleado empleado) {
        Empleado EmpleadoDB = empleadoRepository.findById(id).get();
        EmpleadoDB.setNombre(empleado.getNombre());
        EmpleadoDB.setApellido(empleado.getApellido());
        EmpleadoDB.setDni(empleado.getDni());
        EmpleadoDB.setNumero(empleado.getNumero());
        EmpleadoDB.setDireccion(empleado.getDireccion());
        EmpleadoDB.setFecha_nc(empleado.getFecha_nc());
        
        return empleadoRepository.save(EmpleadoDB);
    }

    @Override
    public void delete(long id) {
   Empleado EmpleadoDB = empleadoRepository.findById(id).get();
        empleadoRepository.delete(EmpleadoDB);
    }

    @Override
    public List<Empleado> findAll() {
        return (List<Empleado>) empleadoRepository.findAll();
    }
    
}
