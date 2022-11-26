package co.edu.unab.api_papeleria_grupo1.controlador;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unab.api_papeleria_grupo1.modelo.UsuariosModel;
import co.edu.unab.api_papeleria_grupo1.servicio.UsuariosService;

@RestController
@RequestMapping(path ="/tpapeleria")

public class UsuariosController {
    @Autowired
    UsuariosService usuariServi;

    @GetMapping()
    public ArrayList<UsuariosModel> getAllusuarios(){
        return usuariServi.getAllusuarios();
    }

    @GetMapping(path ="/{id}")
    public Optional<UsuariosModel>obtenerPorId(@PathVariable("id") String id){
        return usuariServi.getUsuariosModelById(id);
    }

    @PostMapping()
    public void guardarusuario(@RequestBody UsuariosModel usuariosModel){
        usuariServi.saveusuarios(usuariosModel);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarusuarios(@PathVariable("id") String id){
        boolean ok = usuariServi.deleteUsuariosById(id);
        if (ok) return "Se elimino el usuario con id:"+id;
        else return "No elimino el usuario con id:"+id;
            
        }
    }

