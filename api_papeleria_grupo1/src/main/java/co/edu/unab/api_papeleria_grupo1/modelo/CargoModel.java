package co.edu.unab.api_papeleria_grupo1.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Document("cargos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CargoModel {
    @Id
    private String idcargo;
    private String nombre;
    private String estado;
    
    
}
