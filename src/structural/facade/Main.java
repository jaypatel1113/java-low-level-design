package structural.facade;

import structural.facade.problem.*;
import structural.facade.solution.BookingFacade;

public class Main {
    public static void main(String[] args) {
        // Step 1: Make payment
        PaymentService paymentService = new PaymentService();
        paymentService.makePayment("user123", 500);

        // Step 2: Reserve seat
        SeatReservationService seatReservationService = new SeatReservationService();
        seatReservationService.reserveSeat("movie456", "A10");

        // Step 3: Send booking confirmation via email
        NotificationService notificationService = new NotificationService();
        notificationService.sendBookingConfirmation("user@example.com");

        // Step 4: Add loyalty points to user's account
        LoyaltyPointsService loyaltyPointsService = new LoyaltyPointsService();
        loyaltyPointsService.addPoints("user123", 50);

        // Step 5: Generate the ticket
        TicketService ticketService = new TicketService();
        ticketService.generateTicket("movie456", "A10");




        System.out.println("\n\n===========\n\n");




        // what if client misses any step ???
        BookingFacade bookingFacade = new BookingFacade();
        bookingFacade.bookMovieTicket("user123", "movie456", "A10", "user@example.com", 500);
    }
}
