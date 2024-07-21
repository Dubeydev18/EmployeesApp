package com.credmarg.backend.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter
@Setter
public class EmployeeDTO {
    private String name;
    private String designation;
    private Double ctc;
    private String email;


}
