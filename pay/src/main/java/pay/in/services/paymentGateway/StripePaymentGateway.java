package pay.in.services.paymentGateway;

import org.springframework.stereotype.Service;

@Service
public class StripePaymentGateway implements PaymentGateway{
	@Override
	public String GeneratePaymentLink() {
		return "Hi";
	}
}
