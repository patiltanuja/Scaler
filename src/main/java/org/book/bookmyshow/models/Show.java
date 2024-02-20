package org.book.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
public class Show extends BaseModel{
private Movie movie;
private Date startTime;
private Date endTime;
private Screen screen;
private List<Feature> feature;

}
