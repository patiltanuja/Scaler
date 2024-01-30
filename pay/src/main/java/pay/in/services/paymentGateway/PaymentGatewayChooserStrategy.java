package pay.in.services.paymentGateway;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class PaymentGatewayChooserStrategy {
      private RazorPaymentGateway razorPaymentGateway;
      private StripePaymentGateway stripePaymentGateway;
      
      public PaymentGatewayChooserStrategy(
    		  RazorPaymentGateway razorPaymentGateway,
    		  StripePaymentGateway stripePaymentGateway 
      ){
    	  this.razorPaymentGateway= razorPaymentGateway;
    	  this.stripePaymentGateway= stripePaymentGateway;
      }
      
      public PaymentGateway getBestPaymentGateway() {
//    	  int randomInt = new Random().nextInt();
//    	  
//    	  if(randomInt %2 ==0) {
//    		  return razorPaymentGateway; 
//    	  }
//    	  return stripePaymentGateway;
    	  return razorPaymentGateway;
      }
}
