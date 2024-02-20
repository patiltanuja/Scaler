package org.book.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class User extends BaseModel{
private String name;
private String email;
private String password;
private List<Booking> booking;
}
