package com.alves.app.ejb;

import java.util.UUID;

import javax.ejb.Stateless;

@Stateless
public class EJBStateless {

	public String getUUID() {
		return UUID.randomUUID().toString();
	}
}