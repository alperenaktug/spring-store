package com.backend.store;

import org.springframework.stereotype.Service;

@Service
public interface PaymentService {
    void processPayment(double amount);


}
