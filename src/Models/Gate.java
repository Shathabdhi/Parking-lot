package Models;

public class Gate extends BaseModel{
   private int gateNumber;

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    private GateType gateType;

   private ParkingOperator operator;

   private GateStatus gateStatus;

    public ParkingOperator getOperator() {
        return operator;
    }

    public void setOperator(ParkingOperator operator) {
        this.operator = operator;
    }
}
