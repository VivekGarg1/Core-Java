package com.interfaces;

public class MarkerInterfaceDao {

	public boolean save(Object object) throws InvalidIdentityFoundException {
		boolean isSaved=false;
		if (!(object instanceof MarkerInterface)) {
			throw new InvalidIdentityFoundException("Invalid entity found,can't be saved...");
		}
		else {
			System.out.println("Object saved in database...");
			isSaved=true;
		}
		return isSaved;
	}

}
