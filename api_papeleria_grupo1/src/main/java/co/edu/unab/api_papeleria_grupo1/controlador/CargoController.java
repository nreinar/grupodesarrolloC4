package co.edu.unab.api_papeleria_grupo1.controlador;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unab.api_papeleria_grupo1.modelo.CargoModel;
import co.edu.unab.api_papeleria_grupo1.servicio.CargoService;

@RestController
@RequestMapping(path ="/cargo")
public class CargoController {
    @Autowired
    CargoService cargoService;

    @GetMapping
    public Iterable<CargoModel>getAllCargos(){
        return cargoService.getAllCargos();
    }

    @GetMapping(path = "/{id}")
    public Optional<CargoModel> getByIdCargo(@PathVariable("id")String id){
        return cargoService.getByIdCargo(id);
    }

    @PostMapping()
    public CargoModel setCargo(@RequestBody CargoModel cargo){
        return cargoService.saveCargo(cargo);
    }

    @DeleteMapping(path ="/{id}")
    public void deleteById(@PathVariable("id")String id){
        cargoService.deleteByIdCargo(id);
    }

}
