package org.book.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Payment extends BaseModel {
    private int amount;
    private String referenceNo;
    private PaymentProvider PaymentProvider;
    private PaymentStatus paymentStatus;

}
