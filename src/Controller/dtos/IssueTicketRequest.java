package Controller.dtos;

import Models.VehicleType;

public class IssueTicketRequest {
    private VehicleType vehicleType;
    private String vehicleNumber;
    private String ownerName;
    private  Long parkingLotId;

    private Long gateId;

    public Long getGateId() {
        return gateId;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }

    public IssueTicketRequest(VehicleType vehicleType, String vehicleNumber, String ownerName, Long parkingLotId) {
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.parkingLotId = parkingLotId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Long getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(Long parkingLotId) {
        this.parkingLotId = parkingLotId;
    }
}
