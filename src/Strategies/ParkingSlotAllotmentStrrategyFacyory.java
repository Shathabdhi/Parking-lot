package Strategies;

import repositoiries.ParkingLotRepository;

public class ParkingSlotAllotmentStrrategyFacyory {
    public static ParkingPlaceAllotmentStrategy getParkingAllotmentStrategyForType(ParkingPlaceAllotmentStrategy parkingPlaceAllotmentStrategy){
        return new SimpleParkingAllotmentStrategy();
    }

}
