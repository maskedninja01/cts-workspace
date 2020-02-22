package com.cts.services;

public class GreetServiceAdvancedImpl implements GreetService{
	private GreetNoteProvider gnp;

	public GreetNoteProvider getGnp() {
		return gnp;
	}

	public void setGnp(GreetNoteProvider gnp) {
		this.gnp = gnp;
	}

	public GreetServiceAdvancedImpl(GreetNoteProvider gnp) {
		super();
		this.gnp = gnp;
	}

	public GreetServiceAdvancedImpl() {
		super();
	}

	public String greet(String userName) {
		// TODO Auto-generated method stub
		return gnp.getGreetNote()+userName;
	}

}
