package pay.in.services.paymentGateway;

import com.razorpay.RazorpayException;

public interface PaymentGateway {
    String GeneratePaymentLink() throws RazorpayException;
   
}
