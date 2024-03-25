package Models;

import java.time.LocalDateTime;

public class Payment extends BaseModel{
    private PaymentMode paymentMode;
    private Float amount;
    private int refNumber;
    private LocalDateTime time;
    private PaymantStatus status;
}
