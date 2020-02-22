package com.cts.one;

import java.time.LocalDateTime;

import com.cts.services.GreetNoteProvider;

public class GreetNoteProviderTimeBasedImpl implements GreetNoteProvider {

	public String getGreetNote() {
		// TODO Auto-generated method stub
		LocalDateTime today= LocalDateTime.now();
		int h= today.getHour();
		String g = "";
		if(h>=1 && h<12) {
			g="Good Morning";
		}
		else if(h>=12 && h<16) {
			g="Good Afternoon";
		}
		else
			g="Good Evening";
		return g;
	}

}
