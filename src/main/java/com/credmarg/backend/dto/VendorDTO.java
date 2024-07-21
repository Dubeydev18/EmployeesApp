package com.credmarg.backend.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class VendorDTO {

    private String name;
    private String email;
    private String upi;

}
