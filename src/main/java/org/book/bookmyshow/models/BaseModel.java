package org.book.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
public class BaseModel {
    private Long Id;
    private Date createdAt;
    private Date lastModifiedAt;

}
