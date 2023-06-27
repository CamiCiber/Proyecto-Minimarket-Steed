
package pe.cibertec.ecommerce.ApiCargo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiCargo.entity.Cargo;
import pe.cibertec.ecommerce.ApiCargo.dao.CargoRepository;

@Service
public class CargoServiceImpl implements CargoService{
    
    @Autowired
    private CargoRepository cargoRepository;

    @Override
    public List<Cargo> findAll() {
        return cargoRepository.findAll();
    }

    @Override
    public Cargo findByIdCategory(String idCategory) {
        return cargoRepository.findByIdCategory(idCategory); 
    }

    @Override
    public Cargo add(Cargo category) {
        return cargoRepository.save(category); 
    }

    @Override
    public Cargo update(long id, Cargo cargo) {
          Cargo cargoDB = cargoRepository.findById(id).get();
        cargoDB.setName(cargo.getName());
       
        return cargoRepository.save(cargoDB);
    }

    @Override
    public void delete(long id) {
       Cargo cargoDB = cargoRepository.findById(id).get();
        cargoRepository.delete(cargoDB);
    }
    
}
