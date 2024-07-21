package com.credmarg.backend.service;


import com.credmarg.backend.dto.VendorDTO;
import com.credmarg.backend.model.Vendor;
import com.credmarg.backend.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorService {
    @Autowired
    private VendorRepository vendorRepository;

    public Vendor saveVendor(VendorDTO vendorDTO) {
        Vendor vendor = new Vendor();
        vendor.setName(vendorDTO.getName());
        vendor.setEmail(vendorDTO.getEmail());
        vendor.setUpi(vendorDTO.getUpi());
        return vendorRepository.save(vendor);
    }

    public Iterable<Vendor> getAllVendors() {
        return vendorRepository.findAll();
    }
}
