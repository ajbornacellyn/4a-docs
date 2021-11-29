package com.team5.shipment_ms.controllers;

import com.team5.shipment_ms.exceptions.DeliveryNotFoundException;
import com.team5.shipment_ms.models.Delivery;
import com.team5.shipment_ms.repositories.DeliveryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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
    // funcion para buscar envíos por número identificador
    @GetMapping("/showDelivers/{shipmentNumber}")
    List<Delivery>SearchShipments(@PathVariable String shipmentNumber){
        Delivery userShipment = deliveryRepository.findById(shipmentNumber).orElse(null);

        if (userShipment == null)
            throw new DeliveryNotFoundException("No se encontró el el envío con id: " + shipmentNumber);
        List<Delivery> deliveries = deliveryRepository.findById(shipmentNumber).stream().collect(Collectors.toList());
        return  deliveries;
    }
}
