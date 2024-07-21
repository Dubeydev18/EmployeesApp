package com.credmarg.backend.controller;


import com.credmarg.backend.dto.VendorDTO;
import com.credmarg.backend.model.Vendor;
import com.credmarg.backend.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vendors")
public class VendorController {
    @Autowired
    private VendorService vendorService;

    @PostMapping
    public Vendor createVendor(@RequestBody VendorDTO vendorDTO) {
        return vendorService.saveVendor(vendorDTO);
    }

    @GetMapping
    public Iterable<Vendor> getAllVendors() {
        return vendorService.getAllVendors();
    }
}

