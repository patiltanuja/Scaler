package pay.in.services;

import org.springframework.stereotype.Service;

import com.razorpay.RazorpayException;

import pay.in.services.paymentGateway.PaymentGateway;
import pay.in.services.paymentGateway.PaymentGatewayChooserStrategy;

@Service
public class PaymentService {
	private PaymentGatewayChooserStrategy paymentGatewayChooserStrategy;
	
	public PaymentService(PaymentGatewayChooserStrategy paymentGatewayChooserStrategy) {
		this.paymentGatewayChooserStrategy=paymentGatewayChooserStrategy;
	}
	public String initiatePayment(String orderId,String email,String phoneNumber,Long amount) throws RazorpayException{
	//Order order = orderService.getOrderDetails(orderId);
	//Long amount=order.getAmount()
    //String email,String phoneNumber,Long amount
		PaymentGateway paymentGateway = paymentGatewayChooserStrategy.getBestPaymentGateway();
		
	
	return paymentGateway.GeneratePaymentLink(orderId,email,phoneNumber,amount);	
}
}
