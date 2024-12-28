package net.javaguides.banking_app.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class FileNotFoundException extends RuntimeException{

	public FileNotFoundException(String msg) {
		super(msg);
	}

	
}
