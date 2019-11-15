package com.cgi.paris.fs.comex.white.core.jpa.repository;

import com.cgi.paris.fs.comex.white.core.jpa.entity.CustomerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity, Long> {
}
