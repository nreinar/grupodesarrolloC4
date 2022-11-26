package co.edu.unab.api_papeleria_grupo1.servicio;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.edu.unab.api_papeleria_grupo1.modelo.CargoModel;
import co.edu.unab.api_papeleria_grupo1.repositorio.CargoRepository;

@Service
public class CargoService {
    @Autowired
    CargoRepository cargoRepository;

    public Iterable<CargoModel> getAllCargos(){
        return cargoRepository.findAll();
    }

    public Optional <CargoModel> getByIdCargo(String id){
        return cargoRepository.findById(id);
    }

    public CargoModel saveCargo(CargoModel cargo){
        return cargoRepository.save(cargo);
    }

    public void deleteByIdCargo(String id){
        cargoRepository.deleteById(id);
    }
}
