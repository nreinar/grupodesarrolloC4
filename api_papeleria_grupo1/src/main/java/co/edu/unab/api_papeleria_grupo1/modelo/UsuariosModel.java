package co.edu.unab.api_papeleria_grupo1.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("usuarios")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UsuariosModel {
    @Id  
    private int idusuario;
    private String nombre;
    private String apellido;
    private String id_cargo;
    private int telefono;
    private String email;
    private String contraseña;
    private String estado;
    

   
}
