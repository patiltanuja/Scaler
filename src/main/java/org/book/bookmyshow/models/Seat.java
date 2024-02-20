package org.book.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Seat extends BaseModel{
private int number;
private SeatType seatType;
private int row;
private int col;

}

