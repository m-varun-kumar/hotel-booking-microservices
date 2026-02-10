package com.micro.payment_service.controller;

import com.micro.payment_service.entity.Payment;
import com.micro.payment_service.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private PaymentRepository repo;

    @PostMapping("/pay")
    public Payment doPayment(@RequestBody Payment payment){
        payment.setStatus("SUCCESS");
        return repo.save(payment);
    }

    @GetMapping("/all")
    public Object getAll(){
        return repo.findAll();
    }
}