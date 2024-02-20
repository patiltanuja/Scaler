package org.book.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Screen extends BaseModel{
private String name;
private List<Seat> seats;
private List<Feature> features;
}
