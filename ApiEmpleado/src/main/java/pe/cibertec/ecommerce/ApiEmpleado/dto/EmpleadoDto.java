/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiEmpleado.dto;

import lombok.Data;
import pe.cibertec.ecommerce.ApiEmpleado.entity.Category;

@Data
public class EmpleadoDto {
     private Long id;
    private String Nombre;
    private String Apellido;
    private int dni;
    private int edad;
    private int numero;
    private String direccion;
    private String fecha_nc;
    private Category category;
}
