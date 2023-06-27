
package pe.cibertec.ecommerce.ApiEmpleado.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Nombre;
    private String Apellido;
    private int dni;
    private int edad;
    private int numero;
    private String direccion;
    private String fecha_nc;
    private String idCategory;
    
}
