package pe.cibertec.ecommerce.ApiBoleta.service;

import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiBoleta.dao.CustomerRepository;
import pe.cibertec.ecommerce.ApiBoleta.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository; 
    
    @Override
    public List<Customer> findAll() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).orElseThrow(()-> 
                new EntityNotFoundException("Customer not exist id:"+id.toString()));  
    }

    @Override
    public Customer add(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer update(long id, Customer customer) {
        Customer customerDB = customerRepository.findById(id).get();
        customerDB.setCustomerName(customer.getCustomerName());
        customerDB.setEmail(customer.getEmail());
        customerDB.setPhone(customer.getPhone());
        return customerRepository.save(customerDB);
    }

    @Override
    public void delete(long id) {
        Customer customerDB = customerRepository.findById(id).get();
        customerRepository.delete(customerDB);
    }
}
