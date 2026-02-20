package com.codein.store;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service

public class OrderService {
    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService){
        System.out.println("Order Service Created");
        this.paymentService=paymentService;
    }

    @PostConstruct
    public void init()
    {
        System.out.println("OrderService PostConstruct");
    }

    @PreDestroy
    public void cleanup()
    {
        System.out.println("OrderService PreDestroy");
    }


    public void placeOrder()
    {
        paymentService.processPayment(10);
    }

//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

}
