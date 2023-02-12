package com.alves.app.ejb;

import javax.ejb.Stateful;

@Stateful
public class EJBStateful {

	private int count = 0;

	public void increment() {
		this.count++;
	}

	public int getCount() {
		return count;
	}
}
