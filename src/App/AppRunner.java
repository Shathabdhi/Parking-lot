package App;

import Controller.TicketController;
import Controller.dtos.IssueTicketRequest;
import Models.VehicleType;
import repositoiries.GateRepository;
import repositoiries.ParkingLotRepository;
import repositoiries.TicketRepository;
import repositoiries.VehicleRepository;
import services.TicketService;

public class AppRunner {
    public static void main(String[] args) {

        /*
            1.create gates,floors,parking slots,parking lots
                op1 : create controller for floor,gates etc
                op2: directlly call repositories and create them

            2. just 2 floors and each floors will have 2 spots ,make it full
            3. Is issue Ticket working fine(It should throw an error)
            4. test all the exceptions
            5. try implementing new features along with issue ticket


        */
        GateRepository gateRepository = new GateRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        TicketService ticketService = new TicketService(gateRepository, vehicleRepository, parkingLotRepository, ticketRepository);

        TicketController ticketController = new TicketController(ticketService);
        //IssueTicketRequest request = new IssueTicketRequest(VehicleType.TWO_WHEALER,"KA14EB8987","Shathabdhi",pass gate id,parkinglotid,)
        //ticketController.issueTicket(request);
    }
}
