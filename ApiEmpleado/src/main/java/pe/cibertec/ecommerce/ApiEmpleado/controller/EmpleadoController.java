    
package pe.cibertec.ecommerce.ApiEmpleado.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiEmpleado.dto.EmpleadoDto;
import pe.cibertec.ecommerce.ApiEmpleado.entity.Empleado;
import pe.cibertec.ecommerce.ApiEmpleado.service.EmpleadoService;

@RestController
@RequestMapping("/api/empleado")
public class EmpleadoController {
    
    @Autowired
    private EmpleadoService empleadoService;
    
    @PostMapping("/add")
    public ResponseEntity<Empleado> add(@RequestBody Empleado product){
        return new ResponseEntity<>(empleadoService.add(product),
                HttpStatus.CREATED);
    }
     @GetMapping("/findById/{id}")
    public ResponseEntity<EmpleadoDto> findById(@PathVariable Long id){
        return new ResponseEntity<>(empleadoService.findById(id),
                HttpStatus.OK);
    }
         @PutMapping("/update/{id}")
    public  ResponseEntity< Empleado> update(@PathVariable Long id,@RequestBody Empleado empleado){
    return new ResponseEntity<>(empleadoService.update(id, empleado),HttpStatus.OK)   ;
    }
      @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
    empleadoService.delete(id);
    }
     @GetMapping("/findAll")
    public ResponseEntity<List<Empleado>> findAll(){
        return new ResponseEntity<>(
        empleadoService.findAll(),HttpStatus.OK);
    }
}
