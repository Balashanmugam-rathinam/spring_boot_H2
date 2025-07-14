package com.securepay.service;

import com.securepay.model.Payment;
import com.securepay.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository repository;

    public List<Payment> getAllPayments() {
        return repository.findAll();
    }

    public Payment save(Payment payment) {
        return repository.save(payment);
    }
}
