package com.example.demo.Entity.Enum;

import org.hibernate.query.Order;

public enum OrderStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    private OrderStatus(Integer code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static OrderStatus velueOf(int code){
        for (OrderStatus orderStatus: OrderStatus.values()){
            if (orderStatus.code == code){
                return orderStatus;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }
}
