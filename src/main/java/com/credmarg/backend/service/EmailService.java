package com.credmarg.backend.service;


import com.credmarg.backend.dto.EmailRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public void sendEmail(EmailRequestDTO emailRequest) {
        emailRequest.getVendorEmails().forEach(email -> {
            System.out.println("Sending email to " + email + ": " + emailRequest.getMessage());
        });
    }
}

