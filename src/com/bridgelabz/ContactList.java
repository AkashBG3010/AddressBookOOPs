package com.bridgelabz;

public class ContactList {
	String firstName,lastName,address,state,email;
	int zip;
	long phoneNumber;
	ContactList(String firstName,String lastName,String address,String state,int zip,long phoneNumber,String email){
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.state=state;
		this.zip=zip;
		this.phoneNumber=phoneNumber;
		this.email=email;
	}
	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", state="
				+ state + ", email=" + email + ", zip=" + zip + ", phoneNumber=" + phoneNumber + "]";
	}
}