package top.anyel.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import top.anyel.client.model.Client;
import top.anyel.client.repository.ClientRepository;

import java.util.List;
import java.util.Optional;

/*
 * Author: Anyel EC
 * Github: https://github.com/Anyel-ec
 * Creation date: 05/03/2025
 */
@Service
public class ClientService {
    @Autowired
    private  ClientRepository customerRepository;



    public List<Client> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Optional<Client> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    public Client createCustomer(Client customer) {
        return customerRepository.save(customer);
    }

    public Client updateCustomer(Long id, Client customerDetails) {
        return customerRepository.findById(id).map(customer -> {
            customer.setName(customerDetails.getName());
            customer.setEmail(customerDetails.getEmail());
            customer.setPhone(customerDetails.getPhone());
            return customerRepository.save(customer);
        }).orElseThrow(() -> new RuntimeException("Customer not found"));
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

}
