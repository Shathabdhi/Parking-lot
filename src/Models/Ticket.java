package Models;

import java.time.LocalDateTime;
import java.util.Date;

public class Ticket extends BaseModel{
    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public ParkingOperator getOperator() {
        return operator;
    }

    public void setOperator(ParkingOperator operator) {
        this.operator = operator;
    }

    private String ticketNumber;
    private LocalDateTime entryTime;

    private Vehicle vehicle;

    private ParkingSlot parkingSlot;
    private Gate entryGate;

    private ParkingOperator operator;
}
