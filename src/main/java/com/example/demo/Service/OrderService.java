package com.example.demo.Service;

import com.example.demo.Entity.OrderEntity;
import com.example.demo.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public void save(OrderEntity orderEntity){
        orderRepository.save(orderEntity);
    }

    public List<OrderEntity> findAll(){
        return orderRepository.findAll();
    }

    public Optional<OrderEntity> findById(Long id){
        return orderRepository.findById(id);
    }
}
