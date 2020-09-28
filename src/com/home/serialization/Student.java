package com.home.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student extends Person implements Serializable {

	private static final long serialVersionUID = -5940697622115327326L;

	private String email;
	private transient String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		oos.writeInt(getId());
		oos.writeObject(getName());
		oos.writeInt(getAge());
	}
	
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		setId(ois.readInt());
		setName((String) ois.readObject());
		setAge(ois.readInt());
	}

	@Override
	public String toString() {
		return "Student [email=" + email + ", password=" + password + "]";
	}

}
