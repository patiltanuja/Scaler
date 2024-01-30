package pay.in.services.paymentGateway;

import com.razorpay.RazorpayException;

public interface PaymentGateway {
    
	String GeneratePaymentLink(String orderId, String email, String phoneNumber, Long amount);
   
}
