package pay.in.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class paymentController {
	@PostMapping("/{orderId}")
	public String initiatePayment(@PathVariable("orderId") String orderId) {
		
		return "Printing orderId from PaymentController!!"+orderId;
		
	}

}
