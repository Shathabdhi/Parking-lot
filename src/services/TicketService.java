package services;

import Controller.dtos.IssueTicketRequest;
import Models.*;
import Strategies.ParkingPlaceAllotmentStrategy;
import Strategies.ParkingSlotAllotmentStrrategyFacyory;
import exceptions.GateNotFoundException;
import exceptions.ParkingLotFullException;
import exceptions.ParkingLotNotFoundException;
import repositoiries.GateRepository;
import repositoiries.ParkingLotRepository;
import repositoiries.VehicleRepository;

import java.util.Date;
import java.util.UUID;

import static java.util.UUID.randomUUID;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkinglotRepository;

    public Ticket issueTicket(IssueTicketRequest ticketRequest) throws GateNotFoundException, ParkingLotNotFoundException, ParkingLotFullException {
        // 1. set time
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
        // 2. get gate details
        Gate gate = gateRepository.findGateByGateId(ticketRequest.getGateId());
        ticket.setEntryGate(gate);

        Vehicle vehicle = vehicleRepository.getVehicleByNumber(ticketRequest.getVehicleNumber());
        if(vehicle == null ){
            vehicle = new Vehicle(ticketRequest.getVehicleType(),
                    ticketRequest.getVehicleNumber(),ticketRequest.getOwnerName());
            vehicleRepository.save(vehicle);
        }
        ticket.setVehicle(vehicle);
        // 3. get parkinglot
        ParkingLot parkingLot = parkinglotRepository.getParkingLotById(ticketRequest.getParkingLotId());
        ParkingPlaceAllotmentStrategy allotmentStrategy = parkingLot.getAllotmentStrategy();


        ParkingPlaceAllotmentStrategy parkingAllotmentRule =
                ParkingSlotAllotmentStrrategyFacyory.getParkingAllotmentStrategyForType(allotmentStrategy);

        ParkingSlot parkingSlot = parkingAllotmentRule.getParkingSlot(ticketRequest.getVehicleType(), ticketRequest.getParkingLotId());
        ticket.setParkingSlot(parkingSlot);
        //4. Ticket number
        ticket.setTicketNumber(UUID.randomUUID().toString());
        return ticket;
    }
}
