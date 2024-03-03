package com.food.ordering.system.order.service.dataaccess.outbox.restaurantApproval.exception;

public class ApprovalOutboxNotFoundException extends RuntimeException {

    public ApprovalOutboxNotFoundException(String message) {
        super(message);
    }
}