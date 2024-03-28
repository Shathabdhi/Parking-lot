package Strategies;

import Models.ParkingSlot;
import Models.Vehicle;
import Models.VehicleType;
import exceptions.ParkingLotFullException;

public interface ParkingPlaceAllotmentStrategy {
    ParkingSlot getParkingSlot(VehicleType vehicleType,Long ParkingLotId)
        throws ParkingLotFullException;
}
