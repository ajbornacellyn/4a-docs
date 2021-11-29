package com.team5.shipment_ms.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Delivery {
    @Id
    private String shipmentNumber;
    private String senderName;
    private String senderId; //cedula
    private String senderPhone;
    private String senderEmail;
    private String originCity;
    private String receiverName;
    private String receiverId; //cedula
    private String destinyCity;
    private String destinyAddress;
    private String shipmentDescription;
    private Date shipmentDate;

    public Delivery(String shipmentNumber, String senderName, String senderId, String senderPhone, String senderEmail, String originCity, String receiverName, String receiverId, String destinyCity, String destinyAddress, String shipmentDescription, Date shipmentDate) {
        this.shipmentNumber = shipmentNumber;
        this.senderName = senderName;
        this.senderId = senderId;
        this.senderPhone = senderPhone;
        this.senderEmail = senderEmail;
        this.originCity = originCity;
        this.receiverName = receiverName;
        this.receiverId = receiverId;
        this.destinyCity = destinyCity;
        this.destinyAddress = destinyAddress;
        this.shipmentDescription = shipmentDescription;
        this.shipmentDate = shipmentDate;
    }

    public String getShipmentNumber() {
        return shipmentNumber;
    }

    public void setShipmentNumber(String shipmentNumber) {
        this.shipmentNumber = shipmentNumber;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getSenderPhone() {
        return senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String getOriginCity() {
        return originCity;
    }

    public void setOriginCity(String originCity) {
        this.originCity = originCity;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public String getDestinyCity() {
        return destinyCity;
    }

    public void setDestinyCity(String destinyCity) {
        this.destinyCity = destinyCity;
    }

    public String getDestinyAddress() {
        return destinyAddress;
    }

    public void setDestinyAddress(String destinyAddress) {
        this.destinyAddress = destinyAddress;
    }

    public String getShipmentDescription() {
        return shipmentDescription;
    }

    public void setShipmentDescription(String shipmentDescription) {
        this.shipmentDescription = shipmentDescription;
    }

    public Date getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(Date shipmentDate) {
        this.shipmentDate = shipmentDate;
    }
}
