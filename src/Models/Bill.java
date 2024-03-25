package Models;

import Strategies.BillingStrategy;

import java.time.LocalDateTime;
import java.util.List;

public class Bill {

    private LocalDateTime exitTime;
    private String  billNumber;
    private Ticket ticket;
    private float billAmount;
    private BillingStatus billingStatus;
    private List<Payment> payments;
    private Gate exitGates;
    private ParkingOperator operator;
    private BillingStrategy billingStrategy;

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public float getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(float billAmount) {
        this.billAmount = billAmount;
    }

    public BillingStatus getBillingStatus() {
        return billingStatus;
    }

    public void setBillingStatus(BillingStatus billingStatus) {
        this.billingStatus = billingStatus;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public Gate getExitGates() {
        return exitGates;
    }

    public void setExitGates(Gate exitGates) {
        this.exitGates = exitGates;
    }

    public ParkingOperator getOperator() {
        return operator;
    }

    public void setOperator(ParkingOperator operator) {
        this.operator = operator;
    }

    public BillingStrategy getBillingStrategy() {
        return billingStrategy;
    }

    public void setBillingStrategy(BillingStrategy billingStrategy) {
        this.billingStrategy = billingStrategy;
    }
}
