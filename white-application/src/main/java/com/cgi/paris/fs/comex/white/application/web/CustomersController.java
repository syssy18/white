package com.cgi.paris.fs.comex.white.application.web;

import com.cgi.paris.fs.comex.white.core.bean.Customer;
import com.cgi.paris.fs.comex.white.core.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomersController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<Customer> create(@RequestBody final Customer customer) {
        final Customer result = this.customerService.create(customer);
        return ResponseEntity.created(UriComponentsBuilder.fromPath("/api/customers/{id}").build(result.getId())).body(result);
    }

    @GetMapping
    public ResponseEntity<List<Customer>> findAll() {
        return ResponseEntity.ok(this.customerService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> find(@PathVariable final Long id) {
        return ResponseEntity.of(this.customerService.find(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> update(@PathVariable final Long id, @RequestBody final Customer customer) {
        return ResponseEntity.of(this.customerService.update(id, customer));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Customer> delete(@PathVariable final Long id) {
        return ResponseEntity.of(this.customerService.delete(id));
    }

}
