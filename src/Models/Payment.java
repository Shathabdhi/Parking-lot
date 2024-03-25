package Models;

import java.time.LocalDateTime;

public class Payment {
    private PaymentMode paymentMode;
    private Float amount;
    private int refNumber;
    private LocalDateTime time;
    private PaymantStatus status;
}
