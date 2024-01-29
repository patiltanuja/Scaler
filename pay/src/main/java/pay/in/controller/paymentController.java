package pay.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pay.in.services.PaymentService;

@RestController
@RequestMapping("/payments")
public class paymentController {
	@Autowired
	private PaymentService paymentService;
	public paymentController(PaymentService paymentService) {
		this.paymentService=paymentService;
	}
	@PostMapping("/{orderId}")
	public String initiatePayment(@PathVariable("orderId") String orderId) {
		
		return paymentService.initiatePayment(orderId);
	}

}
