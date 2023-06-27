
package pe.cibertec.ecommerce.ApiCargo.controller;

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
import pe.cibertec.ecommerce.ApiCargo.entity.Cargo;
import pe.cibertec.ecommerce.ApiCargo.service.CargoService;

@RestController
@RequestMapping("/api/cargo")
public class CargoController {
    
    @Autowired
    private CargoService cargoService;
    
    @GetMapping("/findAll")
    public ResponseEntity<List<Cargo>> findAll(){
        return new ResponseEntity<>(
        cargoService.findAll(),HttpStatus.OK);
    }
    
    @GetMapping("/findByIdCargo/{idCargo}")
    public ResponseEntity<Cargo> findByIdCategory(
            @PathVariable String idCategory){
        return new ResponseEntity<>(
        cargoService.findByIdCategory(idCategory),HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Cargo> add(
            @RequestBody Cargo category){
        return new ResponseEntity<>(
        cargoService.add(category),HttpStatus.CREATED);
    }
     @PutMapping("/update/{id}")
    public  ResponseEntity< Cargo> update(@PathVariable Long id,@RequestBody Cargo cargo){
    return new ResponseEntity<>(cargoService.update(id, cargo),HttpStatus.OK)   ;
    }
      @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
    cargoService.delete(id);}
    
}
