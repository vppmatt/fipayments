package com.neueda.payments.control;

import com.neueda.payments.model.Payment;
import com.neueda.payments.service.PaymentsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/payment")
public class PaymentsController {

    private PaymentsService paymentsService;

    public PaymentsController (PaymentsService paymentsService ) {
        this.paymentsService = paymentsService;
    }

    @GetMapping()
    public List<Payment> getAllPayments() {
        return paymentsService.getAllPayments();
    }

    @GetMapping("/{id}")
    public Payment getPaymentById(@PathVariable("id") Long id){
        return paymentsService.findById(id);
    }
}
