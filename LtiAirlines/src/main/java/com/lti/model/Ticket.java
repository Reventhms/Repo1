package com.lti.model;

import java.time.LocalDate;

public class Ticket {
	int ticketNo;
	int seatNo;
	LocalDate datetime;
	public int getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public LocalDate getDatetime() {
		return datetime;
	}
	public void setDatetime(LocalDate datetime) {
		this.datetime = datetime;
	}
	

}
