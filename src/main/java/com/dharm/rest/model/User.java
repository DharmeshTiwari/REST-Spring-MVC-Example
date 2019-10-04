package com.dharm.rest.model;
public class User {
 private String requestId;
 private String emailAddress;
 private People people;
public String getRequestId() {
	return requestId;
}
public void setRequestId(String requestId) {
	this.requestId = requestId;
}
public String getEmailAddress() {
	return emailAddress;
}
public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}
public People getPeople() {
	return people;
}
public void setPeople(People people) {
	this.people = people;
}

@Override
public String toString() {
  return "RequestId : " +getRequestId() +"EmailAddress "+getEmailAddress() +"Name "+getPeople();
}
}