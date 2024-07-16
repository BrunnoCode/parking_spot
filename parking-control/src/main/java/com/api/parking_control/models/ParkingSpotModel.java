package com.api.parking_control.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "PLAZAS_PARKING")
public class ParkingSpotModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
}
