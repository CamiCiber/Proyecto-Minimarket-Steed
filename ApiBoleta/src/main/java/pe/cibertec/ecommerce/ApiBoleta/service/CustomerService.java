package pe.cibertec.ecommerce.ApiBoleta.service;

import java.util.List;
import pe.cibertec.ecommerce.ApiBoleta.entity.Customer;

public interface CustomerService {
    public List<Customer> findAll();
    public Customer findById(Long id);
    public Customer add(Customer customer);
    public Customer update(long id, Customer customer);
    public void delete(long id);
}
