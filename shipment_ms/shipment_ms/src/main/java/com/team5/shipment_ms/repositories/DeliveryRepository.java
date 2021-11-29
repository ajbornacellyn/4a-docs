package com.team5.shipment_ms.repositories;

import com.team5.shipment_ms.models.Delivery;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;

public interface DeliveryRepository extends MongoRepository<Delivery, String> {
}