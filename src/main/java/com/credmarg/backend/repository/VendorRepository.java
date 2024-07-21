package com.credmarg.backend.repository;

import com.credmarg.backend.model.Vendor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepository extends CrudRepository<Vendor,Long> {

    Vendor findByEmail(String email);

}
