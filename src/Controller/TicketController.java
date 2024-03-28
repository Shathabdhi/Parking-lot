package Controller;

import Controller.dtos.IssueTicketRequest;
import Controller.dtos.IssueTicketResponse;
import Controller.dtos.ResponseStatus;
import Models.Ticket;
import exceptions.GateNotFoundException;
import exceptions.ParkingLotFullException;
import exceptions.ParkingLotNotFoundException;
import services.TicketService;

public class TicketController {

    public static String TICKET_ISSUE_MESSAGE = "ticket issued";
    public static String INVALID_GATE = "Gate is not valid";

    public static String INVALID_PARKINGLOT = "Invalid Parking Lot found";

    public static String PARKING_LOT_FULL = "Parking Lot is full,find a place on road";
    private TicketService ticketService;

    public IssueTicketResponse issueTicket(IssueTicketRequest ticketRequest){
        Ticket ticket = null;
        try {
            ticket = ticketService.issueTicket(ticketRequest);
        } catch (GateNotFoundException e) {
            return new IssueTicketResponse(null,ResponseStatus.FAILURE,INVALID_GATE);
        } catch (ParkingLotNotFoundException e) {
            return new IssueTicketResponse(null,ResponseStatus.FAILURE,INVALID_PARKINGLOT);
        } catch (ParkingLotFullException e) {
            return new IssueTicketResponse(null,ResponseStatus.FAILURE,PARKING_LOT_FULL );
        }
        return new IssueTicketResponse(ticket, ResponseStatus.SUCCUSS,TICKET_ISSUE_MESSAGE);
    }
}
