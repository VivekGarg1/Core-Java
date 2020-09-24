package com.interfaces;

public class MarkerInterfaceService {

	public boolean save(Object object) throws InvalidIdentityFoundException {
		return new MarkerInterfaceDao().save(object);
	}
}
