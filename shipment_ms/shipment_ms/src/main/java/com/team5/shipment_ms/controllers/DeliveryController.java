package com.team5.shipment_ms.controllers;

import com.team5.shipment_ms.models.Delivery;
import com.team5.shipment_ms.repositories.DeliveryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeliveryController {
    private final DeliveryRepository deliveryRepository;

    public DeliveryController(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    @PostMapping("/delivery")
    Delivery newDelivery(@RequestBody Delivery delivery){
        return deliveryRepository.save(delivery);
    }

    @GetMapping("/showDelivers")
    List<Delivery> showDelivers(){
        List<Delivery> delivers = deliveryRepository.findAll();
        return delivers;
    }

}
