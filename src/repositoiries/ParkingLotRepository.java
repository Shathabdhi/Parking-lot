package repositoiries;

import Models.ParkingLot;
import exceptions.ParkingLotNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    Map<Long,ParkingLot> parkingLotMap = new HashMap<>()
    public ParkingLot getParkingLotById(Long parkingLotId) throws ParkingLotNotFoundException {
        if (parkingLotMap.containsKey(parkingLotId)) {
            parkingLotMap.get(parkingLotId);
        }
        throw new ParkingLotNotFoundException();
    }
}
