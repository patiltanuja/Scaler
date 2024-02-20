package org.book.bookmyshow.models;

import java.util.List;

public class Booking extends BaseModel {
private  BookingStatus bookingStatus;
private List<ShowSeat> showSeats;
private int amount;
private List<Payment> payments;
private User user;

}
