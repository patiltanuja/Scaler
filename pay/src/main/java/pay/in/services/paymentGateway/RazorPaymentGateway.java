package pay.in.services.paymentGateway;
import java.time.Instant;

import org.json.JSONObject;
import com.razorpay.Payment;
import com.razorpay.PaymentLink;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

import org.springframework.stereotype.Service;

@Service
public class RazorPaymentGateway implements PaymentGateway{
	private RazorpayClient razorpayClient;
	
	public RazorPaymentGateway(RazorpayClient razorpayClient) {
		this.razorpayClient= razorpayClient;
	}
	@Override
	public String GeneratePaymentLink(String orderId,String email,String phoneNumber,Long amount) {
        try {
		JSONObject paymentLinkRequest = new JSONObject();
		paymentLinkRequest.put("amount", amount);
		paymentLinkRequest.put("currency", "INR");
		paymentLinkRequest.put("accept_partial", false);
		
		paymentLinkRequest.put("expire_by", 1706693247/*Instant.EPOCH.getEpochSecond()+1800*/);
		paymentLinkRequest.put("reference_id", "TS1989");
		paymentLinkRequest.put("description", "Payment for policy no #23456");
		JSONObject customer = new JSONObject();
		customer.put("name", phoneNumber);
		customer.put("contact", "Gaurav Kumar");
		customer.put("email", email);
		paymentLinkRequest.put("customer", customer);
		JSONObject notify = new JSONObject();
		notify.put("sms", true);
		notify.put("email", true);
		paymentLinkRequest.put("notify", notify);
		paymentLinkRequest.put("reminder_enable", true);
		JSONObject notes = new JSONObject();
		notes.put("policy_name", "Jeevan Bima");
		paymentLinkRequest.put("notes", notes);
		paymentLinkRequest.put("callback_url", "https://example-callback-url.com/");
		paymentLinkRequest.put("callback_method", "get");

		PaymentLink payment = razorpayClient.paymentLink.create(paymentLinkRequest);
		return payment.toString();
        }catch(Exception e){
        	System.out.println(e.toString());
        	return "Something is wrong";
        }
	}
	
}
