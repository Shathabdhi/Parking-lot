package Models;

import java.util.List;

public class ParkingFloor {

    int floorNumber;

    public int getFloorNumber() extends BaseModel{
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    List<ParkingSlot> parkingSlots;
}
