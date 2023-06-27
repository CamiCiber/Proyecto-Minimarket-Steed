/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiEmpleado.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.cibertec.ecommerce.ApiEmpleado.entity.Category;

@FeignClient(value="feign-client",url= "http://localhost:8085")
public interface ApiRestClient {
    @GetMapping("/api/role/findByIdRole/{idRole}")
    public Category findByIdCategoryId(@PathVariable String idCategory);
}
