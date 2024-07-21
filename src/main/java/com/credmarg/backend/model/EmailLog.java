package com.credmarg.backend.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Data
@Getter
@Setter
public class EmailLog {

    private Long id;
    private String vendorEmail;
    private String message;
    private LocalDateTime timestamp;

}

