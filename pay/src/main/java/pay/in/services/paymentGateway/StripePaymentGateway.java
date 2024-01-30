package pay.in.services.paymentGateway;

import org.springframework.stereotype.Service;

@Service
public class StripePaymentGateway implements PaymentGateway{
	
	@Override
	public String GeneratePaymentLink(String orderId, String email, String phoneNumber, Long amount) {
		// TODO Auto-generated method stub
		return null;
	}
}
