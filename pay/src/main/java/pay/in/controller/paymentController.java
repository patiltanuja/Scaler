package pay.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.razorpay.RazorpayException;

import pay.in.dto.initiatePaymentRequestDto;
import pay.in.services.PaymentService;

@RestController
@RequestMapping("/payments")
public class paymentController {
	@Autowired
	private PaymentService paymentService;
	public paymentController(PaymentService paymentService) {
		this.paymentService=paymentService;
	}
	@PostMapping("/")
	public String initiatePayment(@RequestBody initiatePaymentRequestDto request) throws RazorpayException {
		
		return paymentService.initiatePayment(request.getOrderId(),request.getEmail(),request.getPhoneNumber(),request.getAmount());
	}

}
