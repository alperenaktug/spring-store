package com.backend.store;

public class OrderService implements PaymentService {

    @Override
    public void placeOrder(){

        var paymentService = new StripePaymentService();
        paymentService.processPayment(100);
    }
}
