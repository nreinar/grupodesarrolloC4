package co.edu.unab.api_papeleria_grupo1.servicio;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unab.api_papeleria_grupo1.modelo.UsuariosModel;
import co.edu.unab.api_papeleria_grupo1.repositorio.UsuariosRepositorio;

@Service
public class UsuariosService {
    @Autowired
    UsuariosRepositorio usuarioRespository;

    public ArrayList<UsuariosModel> getAllusuarios(){
        return (ArrayList<UsuariosModel>)usuarioRespository.findAll();
    }

    public Optional <UsuariosModel> getUsuariosModelById(String id){
        return usuarioRespository.findById(id);
    }

    public void saveusuarios(UsuariosModel usuariosModel){
        usuarioRespository.save(usuariosModel);
    }
    
    public boolean deleteUsuariosById(String id){
    try {
        usuarioRespository.deleteById(id);
        return true;
    } catch (Exception e) {
        return false;
    }
       
    }
}
