package org.book.bookmyshow;

import org.book.bookmyshow.models.BaseModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookMyShowApplication {

	public static void main(String[] args) {

		SpringApplication.run(BookMyShowApplication.class, args);

		BaseModel baseModel = new BaseModel();
		baseModel.getId();
	}

}
