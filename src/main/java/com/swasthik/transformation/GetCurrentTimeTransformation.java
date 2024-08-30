package com.swasthik.transformation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

@Component
public class GetCurrentTimeTransformation {

	public String getCurrentTime() {
		return "time is" + LocalDateTime.now();
	}
	
	public String getCurrentTimeOnlyDate() {
		return "time is " + LocalDateTime.now().format(DateTimeFormatter.ISO_DATE);
	}
}
