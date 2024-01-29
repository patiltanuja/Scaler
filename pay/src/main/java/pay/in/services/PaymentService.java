package pay.in.services;

import org.springframework.stereotype.Service;

import pay.in.services.paymentGateway.PaymentGateway;
import pay.in.services.paymentGateway.PaymentGatewayChooserStrategy;

@Service
public class PaymentService {
	private PaymentGatewayChooserStrategy paymentGatewayChooserStrategy;
	
	public PaymentService(PaymentGatewayChooserStrategy paymentGatewayChooserStrategy) {
		this.paymentGatewayChooserStrategy=paymentGatewayChooserStrategy;
	}
	public String initiatePayment(String orderId){
	//Order order = orderService.getOrderDetails(orderId);
	//Long amount=order.getAmount()
		PaymentGateway paymentGateway = paymentGatewayChooserStrategy.getBestPaymentGateway();
		Long amount=100L;
	
	return paymentGateway.GeneratePaymentLink();	
}
}
