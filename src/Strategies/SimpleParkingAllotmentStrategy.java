package Strategies;

import Models.ParkingSlot;
import Models.VehicleType;
import exceptions.ParkingLotFullException;

public class SimpleParkingAllotmentStrategy implements ParkingPlaceAllotmentStrategy{


    @Override
    public ParkingSlot getParkingSlot(VehicleType vehicleType, Long ParkingLotId)
    throws ParkingLotFullException {
        //get all the floors fot parking lot which are free
        //go through the floors and return any spot for the vehicle type
        return null;
    }
}
